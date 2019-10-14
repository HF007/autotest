package com.oym.testng.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行了");
    }
}
