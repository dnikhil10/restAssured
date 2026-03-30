package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.time.Duration;
import java.util.List;

public class Base1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[contains(text(),'Create new account')]")).click();
        Thread.sleep(3000);

        WebElement dropdown=driver.findElement(By.xpath("//div[@id='_R_mad6p4jikacppb6amH2_' and @role='combobox']"));
        dropdown.click();
        Thread.sleep(3000);

        List<WebElement> values=driver.findElements(By.xpath("//div[@id='R_mad6p4jikacppb6amH2' and @role='combobox']/following::div[@role='listbox']/child::div"));
        System.out.println(values.size());
        for(WebElement value:values)
        {
            System.out.println(value.getText());
        }

        driver.quit();
    }
}
