package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Landing Screen locators
 */
public class LandingScreen {

    public LandingScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = Locators.LandingPage.CITY_NAME_TEXTFIELD)
    public WebElement cityNameTextField;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.CURRENT_LOCATION_BUTTON)
    public WebElement currentLocationBtn;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.NO_RESULT_LABEL)
    public WebElement NoResultLabel;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.SEARCH_BUTTON)
    public WebElement searchBtn;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.SEARCH_RESULT_LIST)
    public WebElement searchResultList;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.SEARCH_TEXTFIELD)
    public WebElement searchTextField;

    @FindBy(how = How.XPATH, using = Locators.LandingPage.WEATHER_TILE_BUTTON)
    public WebElement weatherTileBtn;
}
