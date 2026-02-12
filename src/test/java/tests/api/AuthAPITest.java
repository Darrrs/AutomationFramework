package tests.api;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseAPITest;




public class AuthAPITest extends BaseAPITest{
    @Test
    public void validateAuth(){
        Response postresponse= given().header("Content-Type", "application/json")
                                .body("{ \"username\": \"emilys\", \"password\": \"emilyspass\" }")
                                .when()
                                .post("/auth/login").then().extract().response();
        
        Assert.assertEquals(postresponse.statusCode(), 200);
        String token=postresponse.jsonPath().getString("accessToken");
        Assert.assertNotNull(token);
        String username=postresponse.jsonPath().getString("username");
        Assert.assertEquals(username, "emilys");
        System.out.println("Token for the login is:"+token);
    }

}