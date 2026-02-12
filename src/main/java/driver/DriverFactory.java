package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import config.ConfigReader;
// import static config.ConfigReader.getProperty;

public class DriverFactory {
    public static WebDriver createDriver(){

        String browser= ConfigReader.getProperty("browser");
        WebDriver driver;
        if(browser.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        }
        else throw new IllegalArgumentException("Unsupported browser: " + browser);

        driver.manage().window().maximize();
        return driver;
    }
}