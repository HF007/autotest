package com.oym.testng;

import org.testng.annotations.*;

public class demo {

    @BeforeClass
    public void testBefore(){
         System.out.println("这是运行在testcase之前");
    }
    @Test
    public void testcase(){
        System.out.println("这是一个测试case");
    }
    @AfterClass
    public void testAfter(){
        System.out.println("这是运行在case之后");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是运行在方法之前");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println(" 这是运行在方法之后");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("这是运行在类之前");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("这是运行在类的后面");
    }
}
