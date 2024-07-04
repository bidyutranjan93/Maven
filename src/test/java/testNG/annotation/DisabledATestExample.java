package testNG.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledATestExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login");
    }

    @Test(enabled = false)
    public void fundTransfer(){
        System.out.println("Verify fund transfer");
    }

    @Test(dependsOnGroups = {"smoke"}, alwaysRun = true)
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyCashBack(){
        System.out.println("Verify Cashback");
    }
}
