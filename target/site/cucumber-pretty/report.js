$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CheckApi.feature");
formatter.feature({
  "line": 1,
  "name": "Open openweather site and verify the site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1756971923,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui;verify-site-ui",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the api check the response",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenWeatherMapApiTest.checkApi()"
});
formatter.result({
  "duration": 1999469846,
  "status": "passed"
});
formatter.after({
  "duration": 81500179,
  "status": "passed"
});
formatter.uri("CitySearchInvalid.feature");
formatter.feature({
  "line": 1,
  "name": "Open openweather site and verify the site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1071654961,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui;verify-site-ui",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a user goes to openWeather homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the invalid city is entered and searched",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "No result should be found",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenWeatherMapStep.openUrl()"
});
formatter.result({
  "duration": 6622871600,
  "status": "passed"
});
formatter.match({
  "location": "InvalidSearchStep.searchInvalidCity()"
});
formatter.result({
  "duration": 13583649924,
  "status": "passed"
});
formatter.match({
  "location": "InvalidSearchStep.checkInValidCityResponse()"
});
formatter.result({
  "duration": 48499127,
  "status": "passed"
});
formatter.after({
  "duration": 91638345,
  "status": "passed"
});
formatter.uri("CitySearchValid.feature");
formatter.feature({
  "line": 1,
  "name": "Open openweather site and verify the site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1066659722,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui;verify-site-ui",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a user goes to openWeathermap homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the valid city is entered and searched",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "City Results should be found",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "ValidSearchStep.searchInvalidCity()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidSearchStep.checkValidResponse()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 81335164,
  "status": "passed"
});
formatter.uri("OpenWeather.feature");
formatter.feature({
  "line": 1,
  "name": "Open openweather site and verify the site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1059599360,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Site UI",
  "description": "",
  "id": "open-openweather-site-and-verify-the-site-ui;verify-site-ui",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a user opens to openWeather homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "the Page Loads",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the UI of the screen should be verified",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidSearchStep.openWeatherUrl()"
});
formatter.result({
  "duration": 11005732827,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMapStep.pageLoads()"
});
formatter.result({
  "duration": 6208371,
  "status": "passed"
});
formatter.match({
  "location": "OpenWeatherMapStep.checkUI()"
});
formatter.result({
  "duration": 81036945,
  "status": "passed"
});
formatter.after({
  "duration": 91346247,
  "status": "passed"
});
});