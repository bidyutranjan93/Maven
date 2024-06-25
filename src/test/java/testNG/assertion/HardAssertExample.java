package testNG.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void hardAssert(){
        System.setProperty("webDriver.chrome.driver", "E:\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.manage().window().maximize();
        String title = driver.getTitle();

        Assert.assertEquals(title,"Rediffmail","Title should be matched");

        WebElement loginTextbox = driver.findElement(By.id("login1"));
        Assert.assertTrue(loginTextbox.isDisplayed(), "Login text box should be be visible");

        System.out.println("Hello");
        driver.close();
    }
}
