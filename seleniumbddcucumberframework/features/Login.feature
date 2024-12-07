# This file is related to Login Feature of DemoBlaze application
Feature: Login feature of DemoBlaze application

  Scenario: Verify login functionality when logged with valid credentials
    Given User opened the browser
    When user navigated to the DemoBlaze application login URL
    And user clicks on Sign-in link
    And user input user name as 'bharathedu1' and password as '123456'
    And user clicks on Login button
    Then user should see home page with greeting message
    And close the browser

	@regression
   Scenario: Verify login functionality when logged in with invalid credentails
    Given User opened the browser
    When user navigated to the DemoBlaze application login URL
    And user clicks on Sign-in link
    And user input user name as 'bharathedu1' and password as 'Welcome1'
    And user clicks on Login button
    Then user should see error message
    And close the browser