package Ecommerce;

import org.testng.annotations.Test;

public class Palindrome {

    public static void main (String[] args)
    {
        String str="gadag";
        String temp="";
        for (int i=str.length()-1;i>=0;i--)
        {
           char var= str.charAt(i);
           temp=temp+var;
        }
        if (str.equalsIgnoreCase(temp))
        {
            System.out.println("The string is palindrome = "+temp);
        }
        else
        {
            System.out.println("The string is not palindrome = "+temp);
        }
        //finding how many characters in String
        String str1 = "gadagaaaaaa";
        int temp1=0;
        char res='a';
        for (int i=0;i<str1.length();i++)
        {
            char var=str1.charAt(i);
            if (var==res)
            {
                temp1++;
            }
        }
        System.out.println("The number of a ="+temp1);
        //Duplicate character in the String
        String str2="nikhil";
        int[] num=new int[256];
        for (int i=0;i<str2.length();i++)
        {
            num[str2.charAt(i)]++;
        }
        for (int j=0;j<num.length;j++)
        {
            if (num[j]>1)
            {
                System.out.println((char)j + " " +num[j]+ " times");
            }
        }
        //Fibonaci series
        int a=0;
        int b=1;
        int n=5;

        for (int i=0;i<=n;i++)
        {
            System.out.print(a + " ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

