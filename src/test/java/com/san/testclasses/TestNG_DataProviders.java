package com.san.testclasses;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProviders {

//@DataProvider(name = "inputs")
//    public Object[][] getData() {
//        return new Object[][] {
//                {"Bmw","m3"},
//                {"audi","a6"},
//                {"benz","c300"}
//        };
//    }

    @Test(dataProvider = "inputs",dataProviderClass = TestData.class)
    public void testMethod1(String input1, String input2) {
        System.out.println("Input1: "+ input1);
        System.out.println("Input2: "+ input2);
    }
}
