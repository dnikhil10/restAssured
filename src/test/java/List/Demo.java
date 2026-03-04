package List;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args)
    {
        List<Integer> count=new ArrayList<>();
        count.add(22);
        count.add(40);
        count.add(32);
        count.add(0);
        System.out.println(count.size());
        Collections.sort(count);

        for (Object ob:count)
        {
            System.out.println(ob);
        }

        List<Character> res=new ArrayList<>();

        for (char i='f';i>='a';i--)
        {
            res.add(i);
        }

        System.out.println(res.size());
        System.out.println(res);

        Collections.sort(res);

        for (Object ob:res)
        {
            System.out.println(ob);
        }
    }


}
