package com.san.testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_TestParameters {

    @BeforeClass
    @Parameters({"browser","platform"})
    public void setUp(String browser,String platform) {
        System.out.println("TestNG_TestParameters -> setup");
        System.out.println("1. parameter value from xml file:" + browser);
        System.out.println("2. parameter value from xml file:" + platform);
    }

    @Test
    @Parameters({"response"})
    public void test1(String response) throws InterruptedException {
        String[] sa = response.split(",");
        System.out.println("TestNG_TestParameters -> test1");
        System.out.println("Response from xml file:" + response);
        System.out.println("Response from xml file:" + sa[0]);
        System.out.println("Response from xml file:" + sa[1]);
    }
}
