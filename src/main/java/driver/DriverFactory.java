package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import config.ConfigReader;
// import static config.ConfigReader.getProperty;

public class DriverFactory {
    public static WebDriver createDriver(){

        // String browser= ConfigReader.getProperty("browser");
        // WebDriver driver;
        // if(browser.equalsIgnoreCase("chrome")){
        //     driver=new ChromeDriver();
        // }
        // else throw new IllegalArgumentException("Unsupported browser: " + browser);

        // driver.manage().window().maximize();
        // return driver;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        return driver;

    }
}