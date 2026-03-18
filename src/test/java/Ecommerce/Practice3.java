package Ecommerce;

public class Practice3 {

    int numbers=23;
    String type= "hello";

    public static void main(String[] args)
    {
        Object ob=new Practice3();

        if(ob instanceof Practice3)
        {
            Practice3 p3=(Practice3)ob;
            System.out.println(p3.numbers);
        }
        else
        {
            System.out.println("It is not instance");
        }
    }
}
