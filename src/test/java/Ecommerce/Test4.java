package Ecommerce;

import org.testng.annotations.Test;

public class Test4 {

    @Test
            public void numberTable()
    {
        int n=4;
        int res=1;

        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print(res +" " );
                res++;
            }
            System.out.println();
        }
    }
}
