package Ecommerce;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Rest5 {

    @Test
    public void getBooks()
    {
        RestAssured.baseURI="https://demoqa.com";

        String response=given().when().get("/BookStore/v1/Books").then().assertThat().statusCode(200).extract().
                response().asString();

        System.out.println(response);

        JsonPath js=new JsonPath(response);

        int size=js.get("books.size()");
        System.out.println(size);

        List<String> bookTitle =new ArrayList<>();

        for (int i=0;i<size;i++)
        {
            String title=js.get("books["+i+"].title");
            bookTitle.add(title);
        }
        bookTitle.stream().filter(title->title.contains("Java")).forEach(System.out::println);

    }

}
