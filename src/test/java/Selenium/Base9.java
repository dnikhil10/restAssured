package Selenium;

import io.cucumber.java.lv.Tad;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class Base9

{
          @Test
    public void write()
          {
              Reporter.log("Write method done" , true) ;
              Assert.assertTrue(false);
          }

}
