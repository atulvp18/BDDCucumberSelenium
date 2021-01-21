@LoginFunctionality
Feature: feature to test login functionality

Background:
	Given User views Udemy website 

@LoginCheck
Scenario Outline: Check login is succesful with valid credentials
Given user is on dashboard page
When user clicks on login button
When user enters <username> and <password>
And clicks on login button
Then user is navigated to the home page


  Examples: 
      |username | password |
      |atulvp18@gmail.com |Atul@1995 |