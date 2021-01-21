$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "feature to test login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LoginFunctionality"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Check login is succesful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginCheck"
    }
  ]
});
formatter.step({
  "name": "user is on dashboard page",
  "keyword": "Given "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "atulvp18@gmail.com",
        "Atul@1995"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User views Udemy website",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_views_Udemy_website()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login is succesful with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@LoginFunctionality"
    },
    {
      "name": "@LoginCheck"
    }
  ]
});
formatter.step({
  "name": "user is on dashboard page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_is_on_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters atulvp18@gmail.com and Atul@1995",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_enters_atulvp18_gmail_com_and_Atul(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.LoginSteps.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});