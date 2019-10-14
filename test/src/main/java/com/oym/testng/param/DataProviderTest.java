package com.oym.testng.param;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.tools.jconsole.inspector.XObject;

import java.lang.reflect.Method;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void dataProviderTest(String name,int age){
        System.out.println("name"+name+"\n"+"age"+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{
            {"zhangsan",11},
            {"lisi",22},
            {"wangwu",33}
        };
        return o;

    }
    @Test(dataProvider = "methodProvider")
    public void test1(String name,int age){
        System.out.println("test1的name"+name+"age"+age);
    }
    @Test(dataProvider = "methodProvider")
    public void test2(String name,int age){
        System.out.println("test2的name"+name+"age"+age);
    }
    @DataProvider(name = "methodProvider")
    public Object[][] mathodProvider(Method method){
       Object[][] result=null;
       if(method.getName().equals("test1")){
           result=new Object[][]{
                   {"zhangsan",22},
                   {"lisi",33}
           };
           }else if(method.getName().equals("test2")){
           result=new Object[][]{
                   {"wangwu",55},
                   {"zhaoliu",66}
           };
       }return  result;
           }
       }




