package com.san.testclasses;

import com.san.appcode.BaseTestAUite;
import com.san.appcode.TestClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgAnnotation_DependentTests extends BaseTestAUite {

    TestClass testClass;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        testClass = new TestClass();
        System.out.println("runs once before class");
    }


//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("beforeMethod");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("afterMethod");
//    }

    @Test(dependsOnMethods = {"test2"},alwaysRun = true)
    public void test1() {
        System.out.println("test1");

    }

    @Test
    public void test2() {
        System.out.println("test2");
        int result = testClass.sumNumbers(1,2);
        Assert.assertEquals(result,2);
    }

    @Test(dependsOnMethods = {"test1"})
    public void test3() {
        System.out.println("test3");
    }

    @Test
    public void test4() {
        System.out.println("test4");
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        System.out.println("runs once after class");
    }

}
