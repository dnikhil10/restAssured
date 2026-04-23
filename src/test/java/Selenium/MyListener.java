package Selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyListener implements ITestListener {

    public static WebDriver driver;
    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("Test Started");
    }

    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test failed");

        try {
            driver=new ChromeDriver();
            driver.get("https://www.facebook.com/");
            TakesScreenshot ts=(TakesScreenshot)driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
            String ssname=result.getName()+"_"+timeStamp+".png";
            File dest = new File("./Selenium/"+ssname);
            FileUtils.copyFile(src, dest);
            driver.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test success name "+ result.getName());
    }
}
