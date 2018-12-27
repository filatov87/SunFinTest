package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HomePage {
    private BaseFunc baseFunc;
    public static final By TASTY_CATEGORY = By.xpath("//*[@id=\"quick-site-section-navigation-inner\"]/a[11]/span");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
WebDriver driver;

//    DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "none")
}
