package steps;

import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import static io.restassured.RestAssured.given;

public class OpenWeatherMapApiTest {

    @Given("^the api check the response$")
    public void checkApi() {
        JSONObject jsonObject = checkSite("London");
        Assert.assertEquals(jsonObject.get("name"),"London");
        Assert.assertEquals(jsonObject.get("cod"),200l);
        jsonObject =checkSite("xyz");
        Assert.assertEquals(jsonObject.get("cod"),"404");
        Assert.assertEquals(jsonObject.get("message"),"city not found");
    }

    /**
     * Check the response/status code of the url
     */
    public static JSONObject checkSite(String city)  {
        String apiBase = "http://api.openweathermap.org/data/2.5/weather?q=";
        String units = "imperial"; // metric
        String lang = "en";
        String apiKey = "8084c2e8f09cb2ddcf5ddabc846a9930";
        String loginUrl = null;
        try {
            loginUrl = apiBase + URLEncoder.encode(city, "utf-8") + "&appid=" + apiKey + "&mode=json&units=" + units + "&lang=" + lang;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Response response = given().
                get(loginUrl).then().extract().response();
        String jsonAsString = response.asString();
        System.out.println(jsonAsString);
        JSONParser parse = new JSONParser();
        JSONObject job = null;

        try {
            job = (JSONObject) parse.parse(jsonAsString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return job;
    }
}
