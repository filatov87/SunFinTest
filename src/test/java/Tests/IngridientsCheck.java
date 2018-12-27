package Tests;

import Pages.BaseFunc;
import Pages.HomePage;
import Pages.TastyPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;
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
    public void searchForFood() throws InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");

        LOGGER.info("Opening home URL");
        baseFunc.goToUrl(HOME_PAGE);


        LOGGER.info("Locating category and click");
        baseFunc.driver.findElement(HomePage.TASTY_CATEGORY).click();

        LOGGER.info("Locating recepies dropdown and clicking");
        Thread.sleep(10000 );
        baseFunc.driver.findElement(TastyPage.RECEPIES_DROPDOWN).click();

//        baseFunc.closeBrowser();
    }


}
