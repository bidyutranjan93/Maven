package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTestNGExample {

    public WebDriver driver;

    @BeforeMethod
    public void beforeMethodExample(){
        System.setProperty("webDriver.chrome.driver", "E:\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testCase1(){

        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        System.out.println("Hello Everyone....");
        
    }

    @Test
    public void testCase2(){

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        System.out.println(" How are you everyone...");
    }

    @Test
    public void testcase3(){

        driver.get("https://www.redbus.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void afterMethodExample(){
        driver.close();
    }
}
