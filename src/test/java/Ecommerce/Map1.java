package Ecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Print the first non repeating character in the String = "automation" and show that in list
public class Map1 {

    public static void main(String[] args)
    {
        String str="automation";

        HashMap<Character , Integer> h=new HashMap<>();
        List<Character> l=new ArrayList<>();

        for (char c:str.toCharArray())
        {
            h.put(c , h.getOrDefault(c , 0)+1);
        }

        for (char c:h.keySet())
        {
            if (h.get(c)==1)
            {
                //System.out.println(c);
                //return;  // if we want to print only once
                l.add(c);
            }
        }
       l.stream().forEach(System.out::println);
    }
}
