package Pages;

import org.openqa.selenium.By;

public class TastyPage {
    private BaseFunc baseFunc;
    public static final By RECEPIES_DROPDOWN = By.xpath("//*[@id=\"navigation-collapse\"]/ul/li[4]");

    public TastyPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
}
