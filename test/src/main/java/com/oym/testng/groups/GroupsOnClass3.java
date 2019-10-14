package com.oym.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "Tea")
public class GroupsOnClass3 {

    public void groupsOnTea1(){
        System.out.println("groupsOnTea1运行");
    }

    public void groupsOnTea2(){
        System.out.println("groupsOnTea2运行");
    }
}
