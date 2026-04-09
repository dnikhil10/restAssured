package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;

public class Base6 {

    @Test

    public void getFlipkart() throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(5000);


        WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(3000));
        WebElement closeBtn=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='q7ywiQ']/child::span[@role='button']"))));

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",closeBtn);
        Thread.sleep(5000);

       WebElement searchBtn= wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='Afujtw']/child::input[@name='q'])[1]"))));
       searchBtn.sendKeys("Mobile");
       Thread.sleep(5000);



        driver.close();
    }
}
