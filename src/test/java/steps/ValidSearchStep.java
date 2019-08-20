package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LandingScreen;
import pages.Locators;

import java.util.List;

public class ValidSearchStep extends BaseUtil {

    private  BaseUtil base;
    protected LandingScreen landingScreen = new LandingScreen(base.driver);
    String url="https://openweathermap.org/";

    @Given("^a user opens to openWeathermap homepage$")
    public void openWeatherMapUrl() {
        navigateTo(url);
    }

    @When("^the valid city is entered and searched$")
    public void searchInvalidCity() {

        landingScreen.cityNameTextField.click();
        landingScreen.cityNameTextField.sendKeys("London");
        landingScreen.searchBtn.click();
    }

    @Then("^City Results should be found$")
    public void checkValidResponse() {
        waitForAnElement();
        List<WebElement> resultList = driver.findElements(By.xpath(Locators.LandingPage.SEARCH_RESULT_LIST));
        for(WebElement result : resultList){
            Assert.assertTrue("found result is shown",result.getText().contains("London"));
        }
    }
}
