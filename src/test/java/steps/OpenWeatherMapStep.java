package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import pages.LandingScreen;

import static io.restassured.RestAssured.given;

public class OpenWeatherMapStep extends BaseUtil {

    private  BaseUtil base;
    protected LandingScreen landingScreen = new LandingScreen(base.driver);
    String url="https://openweathermap.org/";

    @Given("^a user goes to openWeather homepage$")
    public void openUrl() {
        navigateTo(url);
    }

    @When("^the Page Loads$")
    public void pageLoads() {
       waitForAnElement();
    }

    @Then("^the UI of the screen should be verified$")
    public void checkUI() {
        Assert.assertTrue("Weather title is found",landingScreen.weatherTileBtn.isEnabled());
        Assert.assertTrue("Weather title is found",landingScreen.cityNameTextField.isEnabled());
        Assert.assertTrue("Weather title is found",landingScreen.currentLocationBtn.isEnabled());
        Assert.assertTrue("Weather title is found",landingScreen.searchBtn.isEnabled());
    }
}
