package Ecommerce;

import PoJo.LoginResponse;
import PoJo.LoginSteps;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class ECommerceAPITest {

   @Test
    public void getEcommerce()
   {
       RequestSpecification request=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
               setContentType(ContentType.JSON).build();

       LoginSteps loginSteps=new LoginSteps();
       loginSteps.setUserEmail("postman@postman.com");
       loginSteps.setUserPassword("Byecg#2025");

       RequestSpecification reqLogin=given().spec(request).body(loginSteps).log().all();

       LoginResponse loginResponse=reqLogin.when().post("/api/ecom/auth/login").then().log().all().
               extract().response().as(LoginResponse.class);

       String token= loginResponse.getToken();
       String userID=loginResponse.getUserId();

       // Add Product

       RequestSpecification addProduct= new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").
               addHeader("Authorization",token ).build();

       RequestSpecification reqAddProduct=given().log().all().spec(addProduct).param("productName","qwerty").
               param("productAddedBy","6808a7fafc76541aad3c1422").
               param("productCategory","fashion").
               param("productPrice","11500").
               param("productDescription","Addidas Originals").
               param("productFor","Women").
               param("productSubCategory","shirts").
               multiPart("productImage",new File("\\Users\\nikhi\\OneDrive\\Pictures\\Screenshots\\Screenshot 2023-04-03 174430.png"));

       String addResponse=reqAddProduct.when().post("/api/ecom/product/add-product").then().log().all().extract().
               response().asString();

       JsonPath js=new JsonPath(addResponse);
       String productId=js.get("productId");
       System.out.println(productId);
      System.out.println("Tested and checking for rebase and rebased");
   }
}


























































































































































































































































