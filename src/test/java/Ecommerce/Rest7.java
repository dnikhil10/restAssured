package Ecommerce;

import Selenium.MyListener;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Rest7
{
    @Test
    public void weatherMethod()
    {
        RequestSpecification request =new RequestSpecBuilder().setBaseUri("https://demoqa.com").
                setContentType(ContentType.JSON).build();

         String resp=given().spec(request).queryParam("ISBN" , "9781449325862").when().get("/BookStore/v1/Books")
                 .then().assertThat().statusCode(200).extract().response().asString();

        System.out.println(resp);
    }

}
