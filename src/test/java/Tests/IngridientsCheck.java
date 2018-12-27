package Tests;

import Pages.BaseFunc;
import Pages.HomePage;
import Pages.RecepiesPage;
import Pages.TastyPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.ArrayList;
import java.util.List;
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
    private String firstRecipeName;


    @Test
    public void searchForFood()  {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY, "eager");


        LOGGER.info("Opening home URL");
        baseFunc.goToUrl(HOME_PAGE);


        LOGGER.info("Locating category and click");
        baseFunc.driver.findElement(HomePage.TASTY_CATEGORY).click();

        LOGGER.info("Locating recepies dropdown and clicking");
//        Thread.sleep(10000 );
        baseFunc.driver.findElement(TastyPage.RECEPIES_DROPDOWN).click();

        LOGGER.info("Getting first recipe name");
        firstRecipeName = baseFunc.driver.findElement(RecepiesPage.FIRST_RECIPE).getText();
        LOGGER.info("First recipe name is " + firstRecipeName);

        LOGGER.info("Selecting first recipe");

        String oldTab = baseFunc.driver.getWindowHandle();
        baseFunc.driver.findElement(RecepiesPage.FIRST_RECIPE).click();
        LOGGER.info("New tab opens");
        LOGGER.info("Switching active tabs");

        ArrayList<String> newTab = new ArrayList<>(baseFunc.driver.getWindowHandles());
        newTab.remove(oldTab);
        baseFunc.driver.switchTo().window(newTab.get(0));

        LOGGER.info("Listing all ingridients");
        List<WebElement> ingridientList = baseFunc.driver.findElements(By.xpath("//*[contains(@class,'ing-title')]\n"));
        for (int i = 0; i < ingridientList.size(); i++) {
            WebElement ingridient = ingridientList.get(i);
            System.out.println("***" + ingridient.getText());
//            ingridientList.get(i).click();
        }

//        baseFunc.closeBrowser();
    }


}
