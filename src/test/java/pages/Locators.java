package pages;


/**
 * Contains elements locator
 */
public class Locators {

    /* Landing Page Locators */

    public static final class LandingPage {

        public static final String WEATHER_TILE_BUTTON="//a[@class='nav__link bg-hover-color'][contains(text(),'Weather')]";
        public static final String CITY_NAME_TEXTFIELD="//div[@class='form-group search-cities__block']//input[@id='q']";
        public static final String SEARCH_BUTTON="//form[@id='searchform']//button[@type='submit']";
        public static final String CURRENT_LOCATION_BUTTON="//form[@id='searchform']//button[@type='button']";
        public static final String SEARCH_RESULT_LIST="//tbody//tr//td[2]";
        public static final String SEARCH_TEXTFIELD="//input[@id='search_str']";
        public static final String NO_RESULT_LABEL="/html/body/main/div[4]/div/div/div/div/div";

    }
}
