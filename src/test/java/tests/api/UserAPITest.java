package tests.api;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import base.BaseAPITest;

public class UserAPITest extends BaseAPITest {
    @Test

    // public void getusersTest(){
    //     Response response= given().header("Accept", "application/json")
    //         .header("Content-Type", "application/json")
    //                 .when()
    //                     .get("/users")
    //                 .then()
    //                     .extract()
    //                     .response();
    //     Assert.assertEquals(response.getStatusCode(), 200);
    //     Assert.assertNotNull(response.jsonPath().get("users[0].firstName"));
    // }

    public void createuserTest(){
        Response postResponse=given().header("Content-Type","application/json")
                                    .body(
                                        "{ \"firstName\": \"Vishnu\", \"lastname\": \"Reddy\",\"age\":\"25\" }"
                                    ).when()
                                    .post("/users/add").then()
                                    .extract().response();
        Assert.assertEquals(postResponse.getStatusCode(), 201);
        String userid=postResponse.jsonPath().getString("id");
        System.out.println("Hey the id is:"+userid);
        // Response getResponse= given().when().get("/users/"+userid).then().extract().response();
        // Assert.assertEquals(getResponse.getStatusCode(), 200);

    }


}
