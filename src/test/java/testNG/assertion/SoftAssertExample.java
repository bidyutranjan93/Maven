package testNG.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertExample {

    @Test
    public void softAssert(){
        System.setProperty("webDriver.chrome.driver", "E:\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(title, "Rediffmail", "Title should be matched");

        WebElement loginTextBox = driver.findElement(By.id("login1"));
//        softAssert.assertFalse(loginTextBox.isDisplayed(),"Login box should be visible");
        softAssert.assertTrue(loginTextBox.isDisplayed(),"Login box should be visible");

        System.out.println("Hello Everyone");
        softAssert.assertAll();
        driver.close();
    }
}
