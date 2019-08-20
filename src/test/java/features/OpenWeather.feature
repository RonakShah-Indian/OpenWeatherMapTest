Feature: Open openweather site and verify the site UI

  Scenario: Verify Site UI
    Given a user opens to openWeather homepage
    When the Page Loads
    Then the UI of the screen should be verified
