package Ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

    public static void main (String[] args)
    {
        List<String> names= Arrays.asList("nikhil" , "test" ,"hello" );

        List<String> n=names.stream().filter(name -> name.startsWith("n")).collect(Collectors.toList());

        n.forEach(System.out::println);
    }
}
