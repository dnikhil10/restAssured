package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Base10 {

    public WebDriver driver;

    @Test
    public void zoomOut() throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));

        driver.navigate().to("https://www.amazon.in/");

        Thread.sleep(5000);
        //WebElement html =driver.findElement(By.tagName("html"));
        //html.click();

        Robot robot=new Robot();

        for (int i=0;i<4;i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);

            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
        }

        robot.delay(2000);

        driver.quit();
    }
}
