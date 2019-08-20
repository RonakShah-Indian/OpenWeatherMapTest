Feature: Open openweather site and verify the site UI

  Scenario: Verify Site UI
    Given a user goes to openWeathermap homepage
    When the valid city is entered and searched
    Then City Results should be found
