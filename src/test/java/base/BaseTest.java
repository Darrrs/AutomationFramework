package base;
import driver.DriverFactory;
import driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigReader;

public class BaseTest{

    @BeforeMethod
    public void setUp(){
        // WebDriver driver = DriverFactory.createDriver();
        DriverManager.setDriver(DriverFactory.createDriver());
        DriverManager.getDriver().get(ConfigReader.getProperty("baseUrl"));
    }

    @AfterMethod
    public void tearDown(){
        DriverManager.quitDriver();
    }
}