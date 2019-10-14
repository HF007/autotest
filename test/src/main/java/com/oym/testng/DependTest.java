package com.oym.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void testLogin(){
        System.out.println("登录成功");
    }
    @Test(dependsOnMethods = {"testLogin"})
    public void testBuy(){
        System.out.println("购买成功");
    }
    @Test(dependsOnMethods = {"testBuy"})
    public void testPay(){
        System.out.println("支付成功");
    }
}
