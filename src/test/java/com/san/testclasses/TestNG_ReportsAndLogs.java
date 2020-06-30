package com.san.testclasses;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNG_ReportsAndLogs {

    @BeforeClass
    public void setUp() {
        //System.out.println("TestNG_ReportsAndLogs -> This runs once before class");
        Reporter.log("TestNG_ReportsAndLogs -> This runs once before class", true);
    }

    @AfterClass
    public void cleanUp() {
        //System.out.println("TestNG_ReportsAndLogs -> This runs once after class");
        Reporter.log("TestNG_ReportsAndLogs -> This runs once after class", true);
    }

    @BeforeMethod
    public void beforeMethod() {
        //System.out.println("TestNG_ReportsAndLogs -> This runs before every method");
        Reporter.log("TestNG_ReportsAndLogs -> This runs before every method",true);
    }

    @AfterMethod
    public void afterMethod() {
        //System.out.println("TestNG_ReportsAndLogs -> This runs after every method");
        Reporter.log("TestNG_ReportsAndLogs -> This runs after every method", true);
    }

    @Test
    public void testMethod1() {
        System.out.println("TestNG_ReportsAndLogs -> testMethod1");
        Reporter.log("TestNG_ReportsAndLogs -> testMethod1",true);
    }

    @Test
    public void testMethod2() {
        System.out.println("TestNG_ReportsAndLogs -> testMethod2");
        Reporter.log("TestNG_ReportsAndLogs -> testMethod2",true);
        Assert.assertTrue(false);
    }

    @Test
    public void testMethod3() {
        System.out.println("TestNG_ReportsAndLogs -> testMethod3");
        Reporter.log("TestNG_ReportsAndLogs -> testMethod3",true);
    }
}
