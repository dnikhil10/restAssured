package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions ( features = "src/test/resources/Features",
        glue = {"Stepdefination"},
        tags = "@Regression",
        monochrome = true,
        dryRun = true,
        plugin = {"pretty" , "html:target/cucumber-report.html"})

public class testRunner extends AbstractTestNGCucumberTests {
}
