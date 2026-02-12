package tests.api;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import base.BaseAPITest;

public class UserSchemaTest extends BaseAPITest{
    @Test
    public void schematest(){
        given().when().get("/users").then().statusCode(200).assertThat()
        .body(matchesJsonSchemaInClasspath("schema/users-schema.json"));
    }
}
