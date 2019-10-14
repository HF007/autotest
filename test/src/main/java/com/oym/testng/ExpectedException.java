package com.oym.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions=RuntimeException.class)
    public void expectedExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个成功的s异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
