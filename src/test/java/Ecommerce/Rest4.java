package Ecommerce;

import PoJo.Resourse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Rest4 {


    @Test
    public void practiceTest()
    {
        Resourse rs=new Resourse();
        rs.setJob("tailor");
        rs.setName("Nikhil");
        String response=given().header("Content-Type", "application/json").body(rs)
                .when().post("https://reqres.in/api/users").then().extract().response().asString();
        System.out.println(response);
    }
}
