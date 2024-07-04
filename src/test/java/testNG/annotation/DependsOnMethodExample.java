package testNG.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test
    public void verifyLogin_1(){
        Assert.assertTrue(false);
        System.out.println("Verify Login_1");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyCashBack(){
        System.out.println("Verify Cashback");
    }

    @Test
    public void verifyFundTransfer(){
        System.out.println("Verify FundTransfer");
    }
}
