package Ecommerce;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Test2 {

           @BeforeClass
           public void work()
           {
               Reporter.log("Work" , true);
           }
           @BeforeMethod
           public void notRun()
           {
               Reporter.log("Not run" , true);
               Assert.assertEquals("Tested" , "Tested");
              //Assert.assertTrue();
           }
         @Test
         public void test () {

             Reporter.log("Test" , true);
         }
         @Test (priority = 1 , invocationCount = 5 , enabled = false)
         public void tested()
         {
             Reporter.log("Tested" , true);
         }
         @Test (priority = -1)
         public void run()
         {
             Reporter.log("Running" , true);
         }
}
