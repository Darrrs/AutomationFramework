package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;
import driver.DriverManager;


public class LoginPage {

    WebDriver driver;

    private By usernameInput= By.id("username");
    private By passwordInput=By.id("password");
    private By loginInput=By.cssSelector("button[type='submit']");
    private By successMessage = By.cssSelector(".flash.success");

    public LoginPage(){
        this.driver=DriverManager.getDriver();

    }

    public void enterusername(String username){
        driver.findElement(usernameInput).sendKeys(username);
    }
    public void enterpassword(String password){
        driver.findElement(passwordInput).sendKeys(password);
    }
    public void clicklogin(){
        driver.findElement(loginInput).click();
    }
    public String getSuccessMessage() {
        WaitUtils.waitForVisibility(successMessage);
        return driver.findElement(successMessage).getText();
    }




    public void login(String username ,String password){
        enterusername(username);
        enterpassword(password);
        clicklogin();
    }

}