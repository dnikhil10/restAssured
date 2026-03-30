package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Base
{
    protected static WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void execution() throws InterruptedException {
       driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
       Thread.sleep(3000);
        WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(10));
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Mobile number or email address')]")));
        Thread.sleep(3000);
        driver.close();
    }

}
