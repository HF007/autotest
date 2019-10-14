package com.oym.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethods {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是运行在服务端组的方法1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是运行在服务端的方法222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是运行在服务端组的方法1111");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是运行在服务端的方法222222");
    }
    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("运行在server组之前的方法");
    }
    @AfterGroups("server")
    public void afterGroupsBefore(){
        System.out.println("运行在server组别之后的方法");
    }
    @BeforeGroups("client")
    public void beforeGroupsAfter(){
        System.out.println("运行在client之前的方法");
    }
    @AfterGroups("client")
    public void afterGroupsAfter(){
        System.out.println("运行在client之后的方法");
    }

}
