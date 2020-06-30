package com.san.testclasses;

import com.san.appcode.TestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotation {

    @Test
    public void testMethod1() {
        TestClass testClass = new TestClass();
        int result = testClass.sumNumbers(1,2);
        Assert.assertEquals(result,3);
        System.out.println("testMethod1");
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
