package Ecommerce;

import PoJo.SingleObj;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class Test1 {

    // SingleObj singleObj=new SingleObj();

    @Test (priority = 1)
    public void properties() throws IOException
    {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("C:\\Users\\nikhi\\IdeaProjects\\restAssuredDemo\\target\\Nikhil.properties");
        p.load(fis);
        String name=p.getProperty("Name");
        System.out.println(name);
        String wifename=p.getProperty("Wife");
        System.out.println(wifename);
    }

    @Test( dependsOnMethods = "properties")
    public void dummyMethod() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println(arr.length);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");


        }


    }
}
