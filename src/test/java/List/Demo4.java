package List;

import io.cucumber.java.sl.In;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.*;

import java.util.HashMap;

public class Demo4 {

    @BeforeClass

    public void nonRepeatedCharacter()
    {
        String str="automation";

        Map<Character , Integer> m=new HashMap<>();

        for (char c:str.toCharArray())
        {
            m.put(c , m.getOrDefault(c , 0)+1);
        }

       // m.entrySet().stream().filter(name->name.getValue()==1).forEach(System.out::println);


        System.out.println("Hello");

        System.out.println("tested");


        for (Map.Entry<Character , Integer> entry:m.entrySet())
        {
              if (entry.getValue()==1)
              {
                  System.out.println(entry.getValue() +" = "+ entry.getKey());
                  break;
              }
        }
    }
    @Test
    public void getFebonacciseries()
    {
        int a=0;
        int b=1;
        int n=7;

        for (int i=0;i<=n;i++)
        {
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}
