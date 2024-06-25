package testNG.annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }

    @Test
    public void fundTransfer(){
        System.out.println("Verify fund transfer");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyCashBack(){
        System.out.println("Verify Cashback");
    }

}
