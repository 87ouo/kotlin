/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.ir;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/ir/irJsText")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class IrJsTextTestCaseGenerated extends AbstractIrJsTextTestCase {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInIrJsText() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irJsText"), Pattern.compile("^(.+)\\.kt(s)?$"), TargetBackend.ANY, true);
    }

    @TestMetadata("compiler/testData/ir/irJsText/dynamic")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Dynamic extends AbstractIrJsTextTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInDynamic() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irJsText/dynamic"), Pattern.compile("^(.+)\\.kt(s)?$"), TargetBackend.ANY, true);
        }

        @TestMetadata("dynamicAndMembersOfAny.kt")
        public void testDynamicAndMembersOfAny() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicAndMembersOfAny.kt");
        }

        @TestMetadata("dynamicArrayAccess.kt")
        public void testDynamicArrayAccess() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicArrayAccess.kt");
        }

        @TestMetadata("dynamicArrayAssignment.kt")
        public void testDynamicArrayAssignment() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicArrayAssignment.kt");
        }

        @TestMetadata("dynamicArrayAugmentedAssignment.kt")
        public void testDynamicArrayAugmentedAssignment() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicArrayAugmentedAssignment.kt");
        }

        @TestMetadata("dynamicArrayIncrementDecrement.kt")
        public void testDynamicArrayIncrementDecrement() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicArrayIncrementDecrement.kt");
        }

        @TestMetadata("dynamicBinaryEqualityOperator.kt")
        public void testDynamicBinaryEqualityOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicBinaryEqualityOperator.kt");
        }

        @TestMetadata("dynamicBinaryLogicalOperator.kt")
        public void testDynamicBinaryLogicalOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicBinaryLogicalOperator.kt");
        }

        @TestMetadata("dynamicBinaryOperator.kt")
        public void testDynamicBinaryOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicBinaryOperator.kt");
        }

        @TestMetadata("dynamicBinaryRelationalOperator.kt")
        public void testDynamicBinaryRelationalOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicBinaryRelationalOperator.kt");
        }

        @TestMetadata("dynamicCall.kt")
        public void testDynamicCall() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicCall.kt");
        }

        @TestMetadata("dynamicElvisOperator.kt")
        public void testDynamicElvisOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicElvisOperator.kt");
        }

        @TestMetadata("dynamicExclExclOperator.kt")
        public void testDynamicExclExclOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicExclExclOperator.kt");
        }

        @TestMetadata("dynamicInfixCall.kt")
        public void testDynamicInfixCall() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicInfixCall.kt");
        }

        @TestMetadata("dynamicMemberAccess.kt")
        public void testDynamicMemberAccess() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicMemberAccess.kt");
        }

        @TestMetadata("dynamicMemberAssignment.kt")
        public void testDynamicMemberAssignment() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicMemberAssignment.kt");
        }

        @TestMetadata("dynamicMemberAugmentedAssignment.kt")
        public void testDynamicMemberAugmentedAssignment() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicMemberAugmentedAssignment.kt");
        }

        @TestMetadata("dynamicMemberIncrementDecrement.kt")
        public void testDynamicMemberIncrementDecrement() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicMemberIncrementDecrement.kt");
        }

        @TestMetadata("dynamicUnaryOperator.kt")
        public void testDynamicUnaryOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicUnaryOperator.kt");
        }

        @TestMetadata("dynamicWithSmartCast.kt")
        public void testDynamicWithSmartCast() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/dynamicWithSmartCast.kt");
        }

        @TestMetadata("implicitCastFromDynamic.kt")
        public void testImplicitCastFromDynamic() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/implicitCastFromDynamic.kt");
        }

        @TestMetadata("implicitCastToDynamic.kt")
        public void testImplicitCastToDynamic() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/implicitCastToDynamic.kt");
        }

        @TestMetadata("invokeOperator.kt")
        public void testInvokeOperator() throws Exception {
            runTest("compiler/testData/ir/irJsText/dynamic/invokeOperator.kt");
        }
    }

    @TestMetadata("compiler/testData/ir/irJsText/native")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Native extends AbstractIrJsTextTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInNative() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irJsText/native"), Pattern.compile("^(.+)\\.kt(s)?$"), TargetBackend.ANY, true);
        }

        @TestMetadata("nativeNativeKotlin.kt")
        public void testNativeNativeKotlin() throws Exception {
            runTest("compiler/testData/ir/irJsText/native/nativeNativeKotlin.kt");
        }
    }

    @TestMetadata("compiler/testData/ir/irJsText/scripting")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Scripting extends AbstractIrJsTextTestCase {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
        }

        public void testAllFilesPresentInScripting() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/ir/irJsText/scripting"), Pattern.compile("^(.+)\\.kt(s)?$"), TargetBackend.ANY, true);
        }
    }
}
