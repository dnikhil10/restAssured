package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {

    @Test (groups="criminal")
    public void crime ()
    {
        System.out.println("crime method");
    }

    @Test (groups="criminal")
    public void crimeScene ()
    {
        Assert.assertTrue(true);
        System.out.println("crimeScene method");
    }

    @Test(dependsOnGroups={"criminal"})
    public void test()
    {
          System.out.println("test");
    }

    @Test (groups="Advocate")
    public void law ()
    {
        Assert.assertTrue(false);
        System.out.println("law method");
    }

    @Test(dependsOnMethods = {"law"})
    public void sublaw()
    {
        System.out.println("sub law method");
    }
}
