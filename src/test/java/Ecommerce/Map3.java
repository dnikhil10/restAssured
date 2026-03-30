package Ecommerce;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map3 {

    //Given we have a list of String
    //Determine which String is repeated

    @Test
    public void map3Scenario()
    {
         List<String> l= Arrays.asList("test" , "tested" , "testing" , "test" , "tested");

        Map<String , Integer> h=new HashMap<>();

        for (String name:l)
        {
            h.put( name , h.getOrDefault(name , 0)+1);
        }

        //for (String test:h.keySet())
        //{
        //    if (h.get(test) > 1)
        //    {
         //       System.out.println(test + " " + h.get(test)+" times repeated");
          //  }
       // }

        for (Map.Entry<String , Integer> entry:h.entrySet())
        {
             if (entry.getValue() > 1)
             {
                 System.out.println(entry.getKey() + " " + entry.getValue() + " times repeated");
             }
        }
    }
}
