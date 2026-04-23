package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;


        public class Base11 {

            public WebDriver driver;

            @Test
            public void uploadFile() throws InterruptedException {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options=new ChromeOptions();
                options.addArguments("--disable-notifications");
                driver=new ChromeDriver(options);
                driver.manage().window().maximize();

                driver.navigate().to("https://practice.expandtesting.com/upload");
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));

                WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(05));
                WebElement uploadFile =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fileInput")));
                JavascriptExecutor js=(JavascriptExecutor) driver;
                js.executeScript("arguments[0].scrollIntoView(true);",uploadFile);
                uploadFile.sendKeys("C:\\Nikhil\\Java - Interview\\Selenium.txt");
                Thread.sleep(5000);

                driver.findElement(By.xpath("//button[text()='Upload']")).click();
                Thread.sleep(5000);

                WebElement txt_confirm=driver.findElement(By.xpath("//h1[contains(text(),'File Uploaded!')]"));
                js.executeScript("arguments[0].scrollIntoView(true);",txt_confirm);
                Thread.sleep(5000);
                Assert.assertTrue(txt_confirm.isDisplayed());

                driver.close();
            }
        }
