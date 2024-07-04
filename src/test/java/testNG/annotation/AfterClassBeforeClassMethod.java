package testNG.annotation;

import org.testng.annotations.*;

public class AfterClassBeforeClassMethod {

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("Before class Method");
    }

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

    @AfterClass
    public void afterClassMethod(){
        System.out.println("After class Method");
    }
}
