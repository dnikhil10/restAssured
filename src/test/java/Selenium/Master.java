package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Master
{
    public static WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        if (driver==null)
        {
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("Testing and devloping");
        }
    }
    @AfterTest
    public void tearDown() {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
