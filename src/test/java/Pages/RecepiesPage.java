package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecepiesPage {
    private BaseFunc baseFunc;
    public static final By FIRST_RECIPE = By.xpath("/html/body/div[5]/main/div[1]/section/div[1]/a");

    public RecepiesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }
    WebDriver driver;

}
