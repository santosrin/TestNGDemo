package com.san.testclasses;

import com.san.appcode.TestClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAnnotation_SoftAssert {

    // Notes : Create an object for Soft Assert
    // Use the object reference to access assert methods
    // Finally call assertAll() method to aggregate all assert statuses
    @Test
    public void testMethod1() {
        SoftAssert sa = new SoftAssert();
        TestClass testClass = new TestClass();
        int result = testClass.sumNumbers(1,2);
        //Assert.assertEquals(result,3);
        sa.assertEquals(result,2);
        System.out.println("assert1");
        //Assert.assertEquals(result,3);
        sa.assertEquals(result,3);
        System.out.println("testMethod1");
        sa.assertAll();
    }

    @Test
    public void atestMethod2() {
        TestClass testClass = new TestClass();
        String expectedString = "Hello World";
        System.out.println("testMethod2");
        String result = testClass.addStrings("Hello","World");
        Assert.assertEquals(result,expectedString);
    }

    @Test
    public void testMethod3() {
        System.out.println("testMethod3");
        int[] expectedArray = {1,2,3,4};
        TestClass testClass = new TestClass();
        int[] result = testClass.getArray();
        Assert.assertEquals(result,expectedArray);
    }
}
