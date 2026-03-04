package List;

import org.testng.annotations.Test;

public class Demo1
{
    @Test(priority = -2)
    public void pattern1()
    {
        for (int i=0;i<6;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
             }
            System.out.println();
        }
    }
    @Test(priority = -1)
    public void pattern2()
    {
        for (int i=6;i>=0;i--)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    @Test()
    public void pattern3()
    {

    }


}
