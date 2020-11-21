package IgnoreTest;

import org.testng.annotations.Test;

public class Ignore1 {
    @Test(enabled = false)
    public void IgnoreMethod1(){
        System.out.println("方法1");
    }

    @Test
    public void IgnoreMethod2(){
        System.out.println("方法2");
    }
}
