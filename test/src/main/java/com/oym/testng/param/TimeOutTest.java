package com.oym.testng.param;

import org.omg.CORBA.TIMEOUT;
import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void timeOutTest() throws InterruptedException {
        Thread.sleep(2000);
    }
}
