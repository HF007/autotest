package com.oym.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass1 {

    public void groupsOnStu1(){
        System.out.println("groupsOnStu1运行");
    }

    public void groupsOnStu2(){
        System.out.println("groupsOnStu2运行");
    }
}
