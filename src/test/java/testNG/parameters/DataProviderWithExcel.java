package testNG.parameters;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "test-data")
    public Object[][] dataProvider() throws IOException {
        Object[][] arrObj = getExcelData("C:\\Users\\BIDYUT\\Desktop\\data provider.xlsx", "testcase1");
        return arrObj;
    }

    public String[][] getExcelData(String filename, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);
        XSSFSheet sh = wb.getSheet(sheetName);

        XSSFRow row = sh.getRow(0);
        int noOfRows = sh.getPhysicalNumberOfRows();
        int noOFColumn = row.getLastCellNum();

        Cell cell;
        String[][] data = new String[noOfRows - 1][noOFColumn];

        for (int i=1; i<noOfRows; i++){              // Rows
            for (int j=0; j<noOFColumn; j++){       //  Column
                row = sh.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }
        }
        return data;
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
