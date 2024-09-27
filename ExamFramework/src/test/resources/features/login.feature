Feature: Login with valid credentials
  Scenario: Navigate to HomePage
    Given : go to login page
    And : enter the "username" and "password"
    When : click on the submit button
    Then : validate user on home page
