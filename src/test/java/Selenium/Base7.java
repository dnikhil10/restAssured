package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.time.Duration;

public class Base7 {

    public static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));

        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");

        WebElement userName =driver.findElement(By.name("email"));
        Assert.assertTrue(userName.isDisplayed(), "UserName is displayed");

        TakesScreenshot ts=(TakesScreenshot)driver;
        File src =ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./Selenium/image.png");
        FileUtils.copyFile(src,dest);
    }
}
