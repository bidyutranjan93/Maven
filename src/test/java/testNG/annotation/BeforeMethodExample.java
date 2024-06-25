package testNG.annotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodExample {
    
    @BeforeMethod
    public void beforeMethod1(){
        System.out.println("Before Method 1 ");
    }
    
    @Test
    public void case1(){
        System.out.println("Case 1");
    }
    @Test
    public void case2(){
        System.out.println("Case 2");
    }
    
    @AfterMethod
    public void afterMethod1(){
        System.out.println("After Method 1 ");
    }
}
