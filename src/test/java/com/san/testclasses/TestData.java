package com.san.testclasses;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider(name = "inputs")
    public Object[][] getData() {
        return new Object[][] {
                {"Bmw","m3"},
                {"audi","a6"},
                {"benz","c300"}
        };
    }
}
