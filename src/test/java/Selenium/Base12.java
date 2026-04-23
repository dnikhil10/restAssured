package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Base12 {

    public static void main(String[] args)

    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.in/");

        FluentWait<WebDriver> wait=new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofMillis(500));
        wait.withTimeout(Duration.ofSeconds(05));
        wait.ignoring(NoSuchElementException.class);
        WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='nav-li']//a[text()='Bestsellers']")));


        ele.click();
        driver.close();
    }
}
