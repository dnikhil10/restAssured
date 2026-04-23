package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base8 {

    private static WebDriver driver;

    @BeforeTest
    public void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }

    @Test
    public void run() throws InterruptedException
    {
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
    }

    @AfterTest
    public void teardown()
    {
        driver.close();
    }

}
