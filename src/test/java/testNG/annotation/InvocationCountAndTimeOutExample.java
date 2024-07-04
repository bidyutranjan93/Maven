package testNG.annotation;

import org.testng.annotations.Test;

public class InvocationCountAndTimeOutExample {

    @Test(invocationCount = 10)
    public void invocationCount(){
        System.out.println("I count method");
    }
    @Test(invocationCount = 20000, invocationTimeOut =1 )
    public void invocationTimeOut(){
        System.out.println("I time out Method");
    }
}
