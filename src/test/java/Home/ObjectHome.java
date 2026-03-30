package Home;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectHome {

    public ObjectHome (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Create new account')]")
    public WebElement createAccountbtn;

    @FindBy(xpath="//span[contains(text(),'Log in to Facebook')]")
    public WebElement titleText;

}
