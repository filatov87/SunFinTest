package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseFunc {
    public WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(BaseFunc.class));

    public BaseFunc() {

        LOGGER.info("Starting chrome + maximize");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void goToUrl(String url) {

        driver.get(url);
    }


    public void closeBrowser() {
        driver.quit();
    }

}
