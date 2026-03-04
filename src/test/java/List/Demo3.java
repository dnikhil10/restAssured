package List;

import org.testng.annotations.Test;

public class Demo3 {

    @Test
    public void reverseString()
    {
        String str="Nikhil";
        String temp="";

        for (int i=str.length()-1;i>=0;i--)
        {
              char sw=str.charAt(i);
              temp=temp+sw;
        }

        System.out.println(temp);
    }
}
