package base;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class BaseAPITest extends BaseTest {
    // This class can be extended by API test classes in the future
    @BeforeClass
    public void setupAPI(){
        RestAssured.baseURI="https://dummyjson.com";
        
    }
}