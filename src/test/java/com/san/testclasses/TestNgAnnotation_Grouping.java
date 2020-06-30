package com.san.testclasses;

import com.san.appcode.BaseTestAUite;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgAnnotation_Grouping extends BaseTestAUite {

    @BeforeClass(alwaysRun = true)
    public void setUp() {
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

    @Test(groups = {"cars","suv"})
    public void test1() {
        System.out.println("test1");
    }

    @Test(groups = {"cars","sedan"})
    public void test2() {
        System.out.println("test2");
    }

    @Test(groups = {"bikes"})
    public void test3() {
        System.out.println("test3");
    }

    @Test(groups = {"bikes"})
    public void test4() {
        System.out.println("test4");
    }

    @AfterClass(alwaysRun = true)
    public void cleanUp() {
        System.out.println("runs once after class");
    }

}
