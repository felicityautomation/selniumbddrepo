# This file is related to Login Feature of DemoBlaze application
#new content
Feature: Login feature of DemoBlaze application

  Scenario Outline: Verify login functionality when logged with valid credentials
    Given User opened the browser
    When user navigated to the DemoBlaze application login URL
    And user clicks on Sign-in link
    And user input user name and password from the file "testdata/mydata.xlsx" and sheet "Credentials"
    And user clicks on Login button
    Then user should see home page with greeting message
    And close the browser

    Examples: 
      | username  | password |
      | bharathedu1 |     123456 |
      | bharathedu2 |     welcome1 |
