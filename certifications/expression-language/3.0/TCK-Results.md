TCK Results
===========

As required by the
[Eclipse Foundation Technology Compatibility Kit License](https://www.eclipse.org/legal/tck.php),
following is a summary of the TCK results for releases of Jakarta Expression Language.

# 3.0 Certification Request

- [x] Organization Name ("Organization") and, if applicable, URL
  Eclipse Foundation
- [x] Product Name, Version and download URL (if applicable)
  [EE4J Implementation of Expression Language 3.0.3](https://eclipse-ee4j.github.io/el-ri)
- [x] Specification Name, Version and download URL
   [Jakarta Expression Language 3.0](https://jakarta.ee/specifications/expression-language/3.0/)
- [x] TCK Version, digital SHA-256 fingerprint and download URL
  [Jakarta Expression Language TCK 3.0.0](https://download.eclipse.org/jakartaee/expression-language/3.0/jakarta-expression-language-tck-3.0.0.zip), SHA-256: 7af99b28c81c1f7eba1e241b20f3854289ae511c8446158671f32731c785504c
- [x] Public URL of TCK Results Summary
  [TCK results summary](https://eclipse-ee4j.github.io/el-ri/certifications/expression-language/3.0/TCK-Results)
- [x] Any Additional Specification Certification Requirements
  None
- [x] Java runtime used to run the implementation
  Oracle JDK 1.8.0_202
- [x] Summary of the information for the certification environment, operating system, cloud, ...
  Linux
- [x] By checking this box I acknowledge that the Organization I represent accepts the terms of the [EFTL](https://www.eclipse.org/legal/tck.php).
- [x] By checking this box I attest that all TCK requirements have been met, including any compatibility rules.



Test results:

```
[javatest.batch] Number of Tests Passed      = 336
[javatest.batch] Number of Tests Failed      = 0
[javatest.batch] Number of Tests with Errors = 0
[javatest.batch] ********************************************************************************
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/arrayelresolver/ELClient.java#arrayELResolverCCETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/arrayelresolver/ELClient.java#arrayELResolverIAETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/arrayelresolver/ELClient.java#arrayELResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/arrayelresolver/ELClient.java#arrayELResolverOBETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/arrayelresolver/ELClient.java#arrayELResolverPNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/arrayelresolver/ELClient.java#arrayELResolverPNWETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/arrayelresolver/ELClient.java#arrayELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beanelresolver/ELClient.java#beanELResolverInvokeMNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beanelresolver/ELClient.java#beanELResolverInvokeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beanelresolver/ELClient.java#beanELResolverInvokeVoidTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beanelresolver/ELClient.java#beanELResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beanelresolver/ELClient.java#beanELResolverPNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beanelresolver/ELClient.java#beanELResolverPNWETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beanelresolver/ELClient.java#beanELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beannameelresolver/ELClient.java#beanNameELResolverGetTypeNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beannameelresolver/ELClient.java#beanNameELResolverGetValueNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beannameelresolver/ELClient.java#beanNameELResolverInvokeMNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beannameelresolver/ELClient.java#beanNameELResolverInvokeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beannameelresolver/ELClient.java#beanNameELResolverIsReadOnlyNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beannameelresolver/ELClient.java#beanNameELResolverSetValueNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/beannameelresolver/ELClient.java#beanNameELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/compositeelresolver/ELClient.java#compositeELResolverAddNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/compositeelresolver/ELClient.java#compositeELResolverInvokeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/compositeelresolver/ELClient.java#compositeELResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/compositeelresolver/ELClient.java#compositeELResolverPNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/compositeelresolver/ELClient.java#compositeELResolverPNWETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/compositeelresolver/ELClient.java#compositeELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elcontext/ELClient.java#elContextAddGetListenersTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elcontext/ELClient.java#elContextGetContextNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elcontext/ELClient.java#elContextGetSetLocaleTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elcontext/ELClient.java#elContextIsSetPropertyResolvedTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elcontext/ELClient.java#elContextPutContextNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elcontext/ELClient.java#elContextPutGetContextTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elprocessor/ELClient.java#elProcessorDefineFunctionCNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elprocessor/ELClient.java#elProcessorDefineFunctionNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elprocessor/ELClient.java#elProcessorDefineFunctionNSMETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elresolver/ELClient.java#elResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elresolver/ELClient.java#elResolverPNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elresolver/ELClient.java#elResolverPNWETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/elresolver/ELClient.java#elResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expression/ELClient.java#expressionHashCodeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expression/ELClient.java#negativeEqualsTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#coerceToTypeELExceptionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#coerceToTypeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#createExpressionNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#createMethodExpressionELExceptionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#createMethodExpressionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#createValueExpression2Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#createValueExpressionELExceptionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#createValueExpressionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/expressionfactory/ELClient.java#newInstanceTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/functionmapper/ELClient.java#functionMapperTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/lambdaexpression/ELClient.java#invokeELETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/lambdaexpression/ELClient.java#invokeNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/listelresolver/ELClient.java#listELResolverIAETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/listelresolver/ELClient.java#listELResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/listelresolver/ELClient.java#listELResolverPNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/listelresolver/ELClient.java#listELResolverPNWETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/listelresolver/ELClient.java#listELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/mapelresolver/ELClient.java#mapELResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/mapelresolver/ELClient.java#mapELResolverPNWETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/mapelresolver/ELClient.java#mapELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/methodexpression/ELClient.java#methodExpressionSerializableTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/methodexpression/ELClient.java#negativeMethodExpressionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/methodexpression/ELClient.java#positiveMethodExpressionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/methodinfo/ELClient.java#methodInfoTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/resourcebundleelresolver/ELClient.java#resourceBundleELResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/resourcebundleelresolver/ELClient.java#resourceBundleELResolverPNWETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/resourcebundleelresolver/ELClient.java#resourceBundleELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/staticfieldelresolver/ELClient.java#staticFieldELResolverInvokeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/staticfieldelresolver/ELClient.java#staticFieldELResolverNPETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/staticfieldelresolver/ELClient.java#staticFieldELResolverTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/staticfieldelresolver/ELClient.java#staticFieldResolverInvokeMNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/staticfieldelresolver/ELClient.java#staticFieldResolverInvokePNFETest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/valueexpression/ELClient.java#negativeValueExpressionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/valueexpression/ELClient.java#positiveValueExpressionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/valueexpression/ELClient.java#valueExpressionEqualsTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/valueexpression/ELClient.java#valueExpressionSerializableTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/api/javax_el/variablemapper/ELClient.java#variableMapperTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorBigDecimalTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorBigIntegerTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorByteTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorDoubleTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorFloatTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorIntegerTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorLongTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorMultiTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorNullTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/assignmentoperator/ELClient.java#elAssignmentOperatorShortTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigDecimalAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigDecimalDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigDecimalModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigDecimalMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigDecimalSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigIntegerAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigIntegerDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigIntegerModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigIntegerMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBigIntegerSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBooleanAndTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elBooleanOrTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elByteAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elByteDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elByteModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elByteMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elByteSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elDoubleAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elDoubleDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elDoubleModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elDoubleMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elDoubleSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elFloatAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elFloatDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elFloatModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elFloatMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elFloatSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elIntegerAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elIntegerDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elIntegerModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elIntegerMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elIntegerSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elLongAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elLongDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elLongModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elLongMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elLongSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNullOperandAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNullOperandDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNullOperandModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNullOperandMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNullOperandSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNumericStringDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNumericStringModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNumericStringMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elNumericStringSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elShortAddTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elShortDivisionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elShortModulusTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elShortMultiplyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/binaryoperator/ELClient.java#elShortSubtractTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elCharacterToNumberCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elCoerceToEnumTypeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elCoerceToOtherTypeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNullToNumberCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToBigDecimalCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToBigIntegerCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToByteCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToDoubleCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToFloatCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToIntegerCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToLongCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elNumberToShortCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elPrimitiveToStringCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elStringToNumberCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#elWrapperToStringCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#negativeElBooleanCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#negativeElCharacterCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#negativeElNumberCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#positiveBoxedToPrimitiveTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#positiveElBooleanCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#positiveElCharacterCoercionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/coercion/ELClient.java#positivePrimitiveToBoxedTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionAverageTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionCountTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionDistinctTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionFindFirstTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionFlatMapTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionForEachTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionLimitTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionMapFilterTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionMaxTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionMinTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionPeekTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionReduceTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionSubStreamTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionSumTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/collectionoperators/ELClient.java#elCollectionToArrayTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elBigDecimalConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elBigIntegerConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elBooleanConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elByteConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elDoubleConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elFloatConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elIntegerConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elLongConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/concatoperator/ELClient.java#elShortConcatenationTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/conditionaloperator/ELClient.java#elConditionalBooleanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/conditionaloperator/ELClient.java#elConditionalStringTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/emptyoperator/ELClient.java#elEmptyArrayTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/emptyoperator/ELClient.java#elEmptyCollectionTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/emptyoperator/ELClient.java#elEmptyMapTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/emptyoperator/ELClient.java#elEmptyNullTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/emptyoperator/ELClient.java#elEmptyStringTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprBigDecimalTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprBigIntegerTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprByteTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprDoubleTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprFloatTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprIntegerTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprLongTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprNullTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprShortTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/lambda/ELClient.java#elLambdaExprStringTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#compositeExprEval1Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#compositeExprEval2Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#dotAndIndexOperatorsSameTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#elSyntaxEscapeTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#literalExprAsMethodExpr1Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#literalExprAsMethodExpr2Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#literalExprEval1Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#literalExprEval2Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#mixedCompositeExpressionsTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#nestedEvalExpressionsTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#parseOnceEvalManyTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#poundDollarSameMeaning1Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#poundDollarSameMeaning2Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#rValueCoercion1Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/language/ELClient.java#rValueCoercion2Test_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/literal/ELClient.java#elBooleanLiteralTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/literal/ELClient.java#elFloatingPointLiteralTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/literal/ELClient.java#elIntegerLiteralTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/literal/ELClient.java#elNullLiteralTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/literal/ELClient.java#elStringLiteralTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/literal/ELClient.java#elSyntaxAsLiteralTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/mapper/ELClient.java#ELFunctionBindingTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/mapper/ELClient.java#ELVariableBindingTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elDivEqualPreAndTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elDivEqualPreCondTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elDivEqualPreOrTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elDivPreBinaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elDivPreRelationalTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elModEqualPreAndTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elModEqualPreCondTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elModEqualPreOrTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elModPreBinaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elModPreRelationalTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elMultiEqualOrCondTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elMultiEqualPreAndTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elMultiEqualPreCondTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elMultiPreBinaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elMultiPreRelationalTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#elParenPreBinaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/operatorprecedence/ELClient.java#functionPrecedenceTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigDecimalEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigDecimalGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigDecimalGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigDecimalLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigDecimalLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigDecimalNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigIntegerEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigIntegerGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigIntegerGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigIntegerLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigIntegerLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBigIntegerNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBooleanEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elBooleanNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elByteEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elByteGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elByteGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elByteLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elByteLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elByteNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elDoubleEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elDoubleGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elDoubleGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elDoubleLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elDoubleLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elDoubleNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elEnumEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elEnumNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elEqualOperandGreaterThanOrEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elEqualOperandLessThanOrEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elFloatEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elFloatGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elFloatGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elFloatLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elFloatLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elFloatNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elIntegerEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elIntegerGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elIntegerGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elIntegerLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elIntegerLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elIntegerNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elLongEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elLongGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elLongGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elLongLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elLongLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elLongNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elNullOperandEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elNullOperandGreaterThanOrEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elNullOperandLessThanOrEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elNullOperandNotEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elOtherEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elOtherGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elOtherGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elOtherLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elOtherLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elOtherNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elShortEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elShortGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elShortGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elShortLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elShortLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elShortNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elStringEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elStringGreaterThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elStringGreaterThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elStringLessThanEqualTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elStringLessThanTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/relationaloperator/ELClient.java#elStringNotEqualToTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorBigDecimalTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorBigIntegerTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorByteTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorDoubleTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorFloatTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorIntegerTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorLongTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorNullTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/semicolonoperator/ELClient.java#elSemiColonOperatorShortTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elBigDecimalUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elBigIntegerUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elBooleanUnaryFalseTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elBooleanUnaryTrueTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elByteUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elDoubleStringUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elDoubleUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elFloatUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elIntegerUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elLongStringUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elLongUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elNullUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/el/spec/unaryoperator/ELClient.java#elShortUnaryTest_from_standalone
[javatest.batch] PASSED........com/sun/ts/tests/signaturetest/el/ELSigTest.java#signatureTest
[javatest.batch] 
[javatest.batch] Aug 7, 2019 12:16:32 PM Finished executing all tests, wait for cleanup...
[javatest.batch] Aug 7, 2019 12:16:32 PM Harness done with cleanup from test run.
[javatest.batch] Total time = 643s
[javatest.batch] Setup time = 0s
[javatest.batch] Cleanup time = 0s
[javatest.batch] Test results: passed: 336
[javatest.batch] Results written to /home/jenkins/workspace/2_expression-language-run-tck-against-staged-build/eltckwork/eltck.
```