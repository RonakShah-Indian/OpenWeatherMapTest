package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LandingScreen;

public class InvalidSearchStep extends BaseUtil {

    private  BaseUtil base;
    protected LandingScreen landingScreen = new LandingScreen(base.driver);
    String url="https://openweathermap.org/";

    @Given("^a user opens to openWeather homepage$")
    public void openWeatherUrl() {
        navigateTo(url);
    }

    @When("^the invalid city is entered and searched$")
    public void searchInvalidCity() {

        landingScreen.cityNameTextField.click();
        landingScreen.cityNameTextField.sendKeys("xyz");
        landingScreen.searchBtn.click();
    }

    @Then("^No result should be found$")
    public void checkInValidCityResponse() {
        waitForAnElement();
        Assert.assertTrue("Not found result is shown",landingScreen.NoResultLabel.isDisplayed());
    }
}
