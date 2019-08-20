Feature: Open openweather site and verify the site UI

  Scenario: Verify Site UI
    Given a user goes to openWeather homepage
    When the invalid city is entered and searched
    Then No result should be found
