package com.san.testclasses;

import org.testng.*;

public class CustomListener3 implements ISuiteListener {

    public void onStart(ISuite suite) {
        //when <suite> tag starts
        System.out.println("onStart: before suite starts ");
    }

    public void onFinish(ISuite suite) {
        //when <suite> tag completes
        System.out.println("onFinish: after suite completes ");
    }

}
