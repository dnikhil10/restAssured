package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MasterSteps
{
    public WebDriver driver;
    protected WebDriverWait wait=null;

    public void waitUnitElementEnabled(WebElement ele , long time)
    {
        wait=new WebDriverWait(driver , Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }
}
