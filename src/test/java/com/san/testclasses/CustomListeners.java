package com.san.testclasses;

import org.testng.*;

public class CustomListeners implements IInvokedMethodListener,ITestListener,ISuiteListener{

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // Before every method in the test class
        System.out.println("before invocation: "+ testResult.getTestClass().getName() +
                " -> " + method.getTestMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // After every method in the test class
        System.out.println("after invocation: "+ testResult.getTestClass().getName() +
                " -> " + method.getTestMethod().getMethodName());
    }

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

    public void onStart(ISuite suite) {
        //when <suite> tag starts
        System.out.println("onStart: before suite starts ");
    }

    public void onFinish(ISuite suite) {
        //when <suite> tag completes
        System.out.println("onFinish: after suite completes ");
    }
}
