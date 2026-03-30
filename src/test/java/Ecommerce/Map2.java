package Ecommerce;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map2 {

    //Store person name and age in hashmap
    //Iterate over Hashmap
    //Determine ppl who are between 25 and 35
    //show the names of them in List

    @Test
    public void mapScenario()
    {
        HashMap<String , Integer> m=new HashMap<>();
        m.put("Rashmi" , 28);
        m.put("Nikhi" , 30);
        m.put("test" , 33);
        m.put("tester" , 38);

        List<String> l=new ArrayList<>();

        for (Map.Entry<String , Integer> entry:m.entrySet())
        {
            if (entry.getValue() > 25 && entry.getValue()<35)
            {
                  String name=entry.getKey();
                  l.add(name);
            }
        }
        l.stream().forEach(System.out::println);
    }

}
