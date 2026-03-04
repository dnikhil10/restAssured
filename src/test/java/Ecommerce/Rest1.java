package Ecommerce;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Rest1 {

    @Test
    public void addBook ()
    {
        RestAssured.baseURI="http://216.10.245.166";

        HashMap<String , String> data=new HashMap<>();
        data.put("name" , "lea");
        data.put("isbn","bchg");
        data.put("aisle","112345");
        data.put("author","John foe");

       String  response=given().contentType("application/json").body(data).log().all().when().post("Library/Addbook.php")
                .then().assertThat().statusCode(200).
               extract().response().asString(); //body("ID",equalTo("bcd112"));

        JsonPath js=new JsonPath(response);
        String id=js.get("ID");
        System.out.println("The value of ID="+id);
    }
}
