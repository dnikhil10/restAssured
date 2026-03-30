package Selenium;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Base4 extends Master{

    @Test

    public void snapDeal() throws InterruptedException {
        driver.get("https://www.snapdeal.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));

        WebDriverWait wait=new WebDriverWait(driver , Duration.ofSeconds(05));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'search-box-input')]")))).click();
        Thread.sleep(3000);

        List<WebElement> styles=driver.findElements(By.xpath("//div[@class='sc-49edc83e-13 DsXWy']"));
        if (styles.size()>0)
        {
            for (WebElement style:styles)
            {
                   if (style.getText().equals("tshirt"))
                   {
                       System.out.println(style.getText());
                       break;
                   }
            }
        }
        else
        {
            System.out.println("Size is zero");
        }
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[contains(@id,'search-box-input')]")))).click();
        Thread.sleep(3000);
        Actions a=new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//div[@id='tab-category-0']"))).build().perform();
        Thread.sleep(3000);


    }
}
