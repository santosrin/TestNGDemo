package com.san.testclasses;

import com.san.appcode.BaseTestAUite;
import org.testng.annotations.*;

public class TestAnnotations1 extends BaseTestAUite {

    @BeforeClass
    public void setUp() {
        System.out.println("runs once before class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("runs once after class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }
}
