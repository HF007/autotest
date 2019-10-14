package com.oym.testng.param;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest {
    @Test
    @Parameters({"name","age"})
    public void paramTest(String name,int age){
        System.out.println("name="+name+"\n"+"age="+age);
    }
}
