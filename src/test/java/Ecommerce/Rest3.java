package Ecommerce;

import PoJo.Api;
import PoJo.Course;
import PoJo.WebAutomation;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;


import java.util.List;

import static io.restassured.RestAssured.given;

public class Rest3 {

String token;

    @Test
    public void postToken ()
    {
        int total=0;
       String response =given().formParam("client_id" , "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
                formParam("client_secret","erZOWM9g3UtwNRj340YYaK_W" )
                .formParam("grant_type", "client_credentials")
                .formParam("scope","trust")
                .log().all().when().post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")
                .then().assertThat().statusCode(200).extract().response().asString();

       JsonPath js=new JsonPath(response);
       token=js.get("access_token");
       System.out.println("Access_Token="+token);

        Course c=given().queryParam("access_token" , token).log().all().
                when().get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
                .as(Course.class);
        System.out.println(c.getInstructor());

             List<Api> api=c.getCourses().getApi();

             for (int i=0;i< api.size();i++)
             {
                 String title=api.get(i).getCourseTitle();
                 if (title.equals("SoapUI Webservices testing"))
                 {
                     int price=api.get(i).getPrice();
                     System.out.println(price);
                     break;
                 }
             }
             List<WebAutomation> webAuto=c.getCourses().getWebAutomation();
             for (int i=0;i<webAuto.size();i++)
             {
                 String Titles=webAuto.get(i).getCourseTitle();
                 System.out.println(Titles);
                 int price=webAuto.get(i).getPrice();
                 total=total+price;
             }
             System.out.println("The total price="+total);


    }
}
