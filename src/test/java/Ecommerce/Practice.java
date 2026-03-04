package Ecommerce;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Practice {

    @BeforeSuite
    public void firstexec()
    {
        Reporter.log("Always first" , true );
        String name="nikhil";
        Assert.assertEquals(name , "nikhil");
        String names= "";
        Reporter.log("Always first end" , true );
    }

    @BeforeClass
    public String wakeup()
    {
        Reporter.log("executed wakeup",true);
        return  "wokeup";
    }

    @BeforeMethod
    public void first()
    {
        Reporter.log("Always",true);
    }

    @Test //(enabled = false)
    public void clean ()
    {
        System.out.println("Test");
        Reporter.log("hello" , true);
        Reporter.log("Hii" , false);
    }
}
