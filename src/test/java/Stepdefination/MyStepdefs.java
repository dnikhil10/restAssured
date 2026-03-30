package Stepdefination;

import Home.ObjectHome;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepdefs extends MasterSteps {

    WebDriver driver;
    ObjectHome objectHome=new ObjectHome(driver);


    @Given("user hits the facebook url")
    public void userHitsTheFacebookUrl()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();   // maximize window
        driver.get("https://www.facebook.com/");
        waitUnitElementEnabled(objectHome.titleText,10);

    }

    @Then("user is displayed with {string} title")
    public void userIsDisplayedWithTitle(String arg0)
    {

    }

    @Given("user is displayed with {string} button")
    public void userIsDisplayedWithButton(String arg0) {

    }

    @Then("User clicks on the button.")
    public void userClicksOnTheButton() {
    }
}
