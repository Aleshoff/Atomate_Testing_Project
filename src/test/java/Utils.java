import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Utils {
    //Constants
    final static String CHROME_DRIVER_LOCATION = "chromedriver.exe";
    final static String BASE_URL = "";

    //Waits for an element to load for a specified period of time.
    public static void waitForElementToLoad(int timeUnit) {
        try {
            TimeUnit.SECONDS.sleep(timeUnit);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Scrolls into view and waits for element to load.
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        waitForElementToLoad(3);
    }


}