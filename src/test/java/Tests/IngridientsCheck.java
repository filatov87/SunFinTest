package Tests;

import Pages.BaseFunc;
import Pages.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class IngridientsCheck {

    /*
      TODO:
      1. Select Food section from the home page
      1.1 Search for locator and click
      2. Choose any recipe from Delfi Food Home Page
      2.1 Search and click for "recipes"
      2.2 Select first recipe and store "recipe-name"
      2.3 Click on first recipe
      3. Go thru all ingredients in selected recipe (click on each)
      4. For each ingredient You will get recipes with selected ingredient
      5. On ingredient page You need to check that selected recipe presents on page
      5.1 Check that "recipe-name" is present on page
      */
    WebDriver driver;
    private BaseFunc baseFunc = new BaseFunc();
    private static final Logger LOGGER = Logger.getLogger(String.valueOf(IngridientsCheck.class));
    private String HOME_PAGE = "https://www.delfi.lv";



    @Test
    public void searchForFood() {
        baseFunc.goToUrl(HOME_PAGE);
        LOGGER.info("Locating category and click");
        baseFunc.driver.findElement(HomePage.TASTY_CATEGORY).click();


        baseFunc.closeBrowser();
    }


}
