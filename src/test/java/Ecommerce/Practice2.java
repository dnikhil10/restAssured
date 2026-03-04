package Ecommerce;

public class Practice2
{
    public static void main(String[] args )
    {
        String value = "Laptop";
        String temp=" ";

        for (int i=value.length()-1;i>=0;i--)
        {
            char res=value.charAt(i);
            temp=temp+res;
        }
        System.out.println(temp);
    }
}
