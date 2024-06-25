package testNG.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParameterization {

    WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodTestDemo(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","E:\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        else if (browserName.equalsIgnoreCase("firefox")){
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

            System.setProperty("webDriver.gecko.driver","E:\\Driver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver(firefoxOptions);

            /*System.setProperty("webDriver.gecko.driver","E:\\Driver\\geckodriver-v0.34.0-win32\\geckodriver.exe");
            driver = new FirefoxDriver();*/
        }

        else if (browserName.equalsIgnoreCase("edge")){
            System.setProperty("webDriver.gecko.driver","E:\\Driver\\edgedriver_win64\\msedgedriver.exe");
            driver = new EdgeDriver();
        }

        else {

            throw new RuntimeException("Please select a correct browser");
        }

    }

    @Parameters({"courseName", "cityName"})
    @Test
    public void verifyGoogleSearch(String courseName, String cityName) throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(courseName , cityName);
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(4000);
        driver.close();
    }
}
