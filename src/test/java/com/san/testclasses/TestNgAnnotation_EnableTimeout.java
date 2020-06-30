package com.san.testclasses;

import com.san.appcode.BaseTestAUite;
import com.san.appcode.TestClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgAnnotation_EnableTimeout {

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

    @Test(enabled = false)
    public void test1() {
        System.out.println("test1");
    }

    @Test(timeOut = 300)
    public void test2() throws InterruptedException {
        System.out.println("test2");
        Thread.sleep(200);
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        System.out.println("runs once after class");
    }

}
