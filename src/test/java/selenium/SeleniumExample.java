package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class SeleniumExample {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webDriver.chrome.driver", "E:\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

//        Thread.sleep(3000);
        driver.close();

    }
}
