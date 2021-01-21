@Search&Logout
Feature: feature to search and logout functionality

Background:
	Given User views Udemy website 

@SearchCourse
Scenario Outline: Check user is able to search course succesfully
Given user is on dashboard page
When user clicks on login button
When user enters <username> and <password>
And  clicks on login button
Then user is navigated to the home page
Then user search for anything 


  Examples: 
      |username | password |
      |atulvp18@gmail.com |Atul@1995 |
      
@Logout
Scenario Outline: Check user is able to logout succesfully
Given user is on dashboard page
When user clicks on login button
When user enters <username> and <password>
And clicks on login button
Then user logout from the site

  Examples: 
      |username | password |
      |atulvp18@gmail.com |Atul@1995 |
  #    |akshatababar90@gmail.com |aksh@123 |
    