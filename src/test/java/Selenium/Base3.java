package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Base3 {

    @Test
    public void testDropdown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://semantic-ui.com/modules/dropdown.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));

        driver.findElement(By.xpath("(//input[@name='gender']/following-sibling::div[text()='Gender'])[1]")).click();
        Thread.sleep(3000);
        List<WebElement> values=driver.findElements(By.xpath("//div[text()='Gender']/following-sibling::div/div[@class='item']"));
        System.out.println(values.size());
        for (WebElement value:values)
        {
            System.out.println(value.getText());
        }
        driver.quit();
    }
}
