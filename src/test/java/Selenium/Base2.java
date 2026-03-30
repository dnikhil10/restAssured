package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Base2 {

    @Test
    public void getAllOptions() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));

        driver.findElement(By.xpath("//textarea[@name='q' and @role='combobox']")).sendKeys("Tested");
        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.xpath("//li[contains(@class,'sbct PZPZlf')]"));
        System.out.println(options.size());
        List<String> a = new ArrayList<>();
        for (WebElement option : options)
        {
            String val = option.getText();
            a.add(val);
        }
        System.out.println(a);
        List<String> res = a.stream().filter(name -> name.contains("meaning")).collect(Collectors.toList());
        res.forEach(System.out::println);
        driver.quit();

    }
        }



