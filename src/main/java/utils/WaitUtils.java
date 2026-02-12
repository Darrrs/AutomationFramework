package utils;

import driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {

    private static final int DEFAULT_TIMEOUT = 10;

    private static WebDriverWait getWait() {
        return new WebDriverWait(
                DriverManager.getDriver(),
                Duration.ofSeconds(DEFAULT_TIMEOUT)
        );
    }

    public static void waitForVisibility(By locator) {
        getWait().until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );
    }

    public static void waitForClickability(By locator) {
        getWait().until(
                ExpectedConditions.elementToBeClickable(locator)
        );
    }
}
