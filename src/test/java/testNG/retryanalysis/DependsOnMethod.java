package testNG.retryanalysis;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

    @Test
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test
    public void verifyLogin_1(){
        Assert.assertTrue(false);
        System.out.println("Verify Login_1");
    }

    @Test
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
