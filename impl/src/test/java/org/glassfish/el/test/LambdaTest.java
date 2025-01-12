/*
 * Copyright (c) 2018, 2021 Oracle and/or its affiliates and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.el.test;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.assertEquals;

import jakarta.el.ELProcessor;

public class LambdaTest {
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
    @Before
    public void setUp() {    
    } 
    
    void testExpr(ELProcessor elp, String testname, String expr, Long expected) {
        System.out.println("=== Test Lambda Expression:" + testname + " ===");
        System.out.println(" ** " + expr);
        Object result = elp.eval(expr);
        System.out.println("    returns " + result);
        assertEquals(expected, result);
    }

    @Test
    public void testImmediate() {
        ELProcessor elp = new ELProcessor();
        testExpr(elp, "immediate", "(x->x+1)(10)", Long.valueOf(11));
        testExpr(elp, "immediate0", "(()->1001)()", Long.valueOf(1001));
        testExpr(elp, "immediate1", "((x,y)->x+y)(null, null)", Long.valueOf(0));
        testExpr(elp, "immediate 2", "(((x,y)->x+y)(3,4))", Long.valueOf(7));
        testExpr(elp, "immediate 3", "(x->(y=x)+1)(10) + y", Long.valueOf(21));
    }

    @Test
    public void testAssignInvoke() {
        ELProcessor elp = new ELProcessor();
        testExpr(elp, "assign", "func = x->x+1; func(10)", Long.valueOf(11));
        testExpr(elp, "assign 2", "func = (x,y)->x+y; func(3,4)", Long.valueOf(7));
    }

    @Test
    public void testConditional() {
        ELProcessor elp = new ELProcessor();
        elp.eval("cond = true");
        testExpr(elp, "conditional", "(x->cond? x+1: x+2)(10)", Long.valueOf(11));
        elp.eval("cond = false");
        testExpr(elp, "conditional 2",
                 "func = cond? (x->x+1): (x->x+2); func(10)", Long.valueOf(12));
    }

    @Test
    public void testFact() {
        ELProcessor elp = new ELProcessor();        
        testExpr(elp, "factorial", "fact = n->n==0? 1: n*fact(n-1); fact(5)", Long.valueOf(120));
        testExpr(elp, "fibonacci", "f = n->n==0? 0: n==1? 1: f(n-1)+f(n-2); f(10)", Long.valueOf(55));
    }

    @Test
    public void testVar() {
        ELProcessor elp = new ELProcessor();
        elp.setVariable("v", "x->x+1");
        testExpr(elp, "assignment to variable", "v(10)", Long.valueOf(11));
    }

    @Test
    public void testLambda() {
        ELProcessor elp = new ELProcessor();
        testExpr(elp, "Lambda Lambda 1", "f = ()->y->y+1; f()(100)", Long.valueOf(101));
        testExpr(elp, "Lambda Lambda 2", "f = (x)->(tem=x; y->tem+y); f(1)(100)", Long.valueOf(101));
        testExpr(elp, "Lambda Lambda 3", "(()->y->y+1)()(100)", Long.valueOf(101));
        testExpr(elp, "Lambda Lambda 4", "(x->(y->x+y)(1))(100)", Long.valueOf(101));
        testExpr(elp, "Lambda Lambda 5", "((x)->(y->x+y))(1)(100)", Long.valueOf(101));
        testExpr(elp, "Lambda Lambda 6"
                , "(x->y->x(0)+y)(x->x+1)(100)", Long.valueOf(101));
        testExpr(elp, "Lambda Lambda 7", "f = ()->((1)); f()", Long.valueOf(1));
        testExpr(elp, "Lambda Lambda 8", "f = ()->(y)->y+1; f()(100)", Long.valueOf(101));
    }
}
