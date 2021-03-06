package com.san.testclasses;

import org.testng.*;

public class CustomListener2 implements ITestListener {

    public void onTestStart(ITestResult result) {
        //when test method starts - @Test annotated method
        System.out.println("onTestStart -> Test Name: "+ result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        //if test method is successful
        System.out.println("onTestSuccess -> Test Name: "+ result.getName());
    }

    public void onTestFailure(ITestResult result) {
        //if test method is failed
        System.out.println("onTestFailure -> Test Name: "+ result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        //if test method is skipped
        System.out.println("onTestSkipped -> Test Name: "+ result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ignore this
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        //ignore this
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        //before <test> tag of xml file
        System.out.println("onStart -> Test Name: "+ context.getName());
        ITestNGMethod methods[] = context.getAllTestMethods();
        System.out.println("These methods will be executed in this test tag");
        for(ITestNGMethod method : methods) {
            System.out.println(method.getMethodName());
        }
    }

    public void onFinish(ITestContext context) {
        //after <test> tag of xml file
        System.out.println("onFinish -> Test Name: "+ context.getName());
    }

}
