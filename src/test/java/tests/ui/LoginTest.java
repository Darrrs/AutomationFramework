 package tests.ui;
 import org.testng.annotations.Test;
import org.testng.Assert;
import base.BaseTest;
import pages.LoginPage;

 public class LoginTest extends BaseTest{
    @Test
    public void validlogintest(){
        LoginPage loginPage=new LoginPage();
        loginPage.login("tomsmith", "SuperSecretPassword!");

        String successmessage=loginPage.getSuccessMessage();
         Assert.assertTrue(
                successmessage.contains("You logged into a secure area"),
                "Login success message not displayed"
        );
    }   
 }