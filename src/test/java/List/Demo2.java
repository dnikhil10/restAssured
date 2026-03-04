package List;

import java.util.Arrays;

public class Demo2 {

    public static void main(String[]args)
    {
        String[] str={"Kot" , "Sho" , "Ksh" , "Sum" , "Nik"};

       // Arrays.sort(str);
      //  for (String name:str)
     //   {
     //       System.out.println(name);
      //  }

        for (int i=0;i<str.length-1;i++)
        {
            for (int j=0;j<str.length-i-1;j++)
            {
                if (str[j].compareTo(str[j+1])>0)
                {
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }

        for (String name:str)
           {
             System.out.println(name);
           }
    }
}
