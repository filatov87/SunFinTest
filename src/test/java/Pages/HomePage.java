package Pages;

import org.openqa.selenium.By;

public class HomePage {
    private BaseFunc baseFunc;
    public static final By TASTY_CATEGORY = By.xpath("//*[@id=\"quick-site-section-navigation-inner\"]/a[11]/span");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
}
