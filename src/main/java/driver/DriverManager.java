package driver;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;
    public static WebDriver getDriver() {
        return driver;
    }
    public static void setDriver(WebDriver driverinstance) {
        DriverManager.driver = driverinstance;
    }
    public static void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}