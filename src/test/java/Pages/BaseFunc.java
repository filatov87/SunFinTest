package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class BaseFunc {
    public WebDriver driver;
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(BaseFunc.class));

    public BaseFunc() {

        LOGGER.info("Starting chrome");
        this.driver = new ChromeDriver();
        LOGGER.info("Maximize window + implicity wait ");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    public void goToUrl(String url) {
        LOGGER.info("Opening URL");
        driver.get(url);
    }
    public void closeBrowser() {
        LOGGER.info("Closing browser");
        driver.quit();
    }

}
