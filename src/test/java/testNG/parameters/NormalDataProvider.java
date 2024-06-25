package testNG.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NormalDataProvider {

    @DataProvider(name ="test-data")
    public Object[][] testData(){
        return new Object[][]{
                {"salenium ", "Pune"}, {"Java ", "Mumbai"}, {"Python ", "Bangalore"}
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyGoogleSearch(String courseName, String cityName) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys(courseName, cityName);
        googleSearchBox.sendKeys(Keys.ENTER);

        Thread.sleep(4000);
        driver.close();
    }
}
