package Ecommerce;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Rest2 {

    @Test
    public void getMethod() {
        RestAssured.baseURI = "https://automationexercise.com";
        String response=given()
                .when().get("/api/productsList").
                then().assertThat().statusCode(200).extract().response().asString();

        System.out.println(response);

        JsonPath js=new JsonPath(response);
        int responseCode=js.getInt("responseCode");
        System.out.println("responseCode="+responseCode);

       int productCount= js.getInt("products.size()");
        System.out.println(productCount);
        String Name = js.get("products[4].name");
        System.out.println(Name);

        System.out.println("List of name and price");

        for (int i=0;i<productCount;i++)
        {
            String name =js.get("products["+i+"].name");
               String price         = js.get("products["+i+"].price");
            System.out.println(name);
            System.out.println(price);
        }

        for (int j=0;j<productCount;j++)
        {
            String name=js.get("products["+j+"].name");
            if (name.equals("Colour Blocked Shirt – Sky Blue"))
            {
                String brand=js.get("products["+j+"].brand");
                System.out.println(brand);
                break;
            }

        }
    }


}
