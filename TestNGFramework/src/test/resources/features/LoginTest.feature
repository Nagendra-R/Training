
Feature: for valid login credentials


  Background:
    Given user open website
    Then verify user is on login page

  @Smoke
  Scenario: verify whether user can login or not
    When user login with username "Admin" and password "admin123"
    Then verify user is on home page


  Scenario: verify user can logout of the application
    When user login with valid credentials
    Then verify user is on home page
    When user click on the burger icon
    And click on logout button
    Then verify user is on login page



  @WIP
  Scenario Outline:verify error message with invalid credentials
    When user login with username "<username>" and password "<password>"
    Then verify the error message with invalid credentials

    Examples:
    | username | password|
    |  test    |test123  |
    |  demo    |demo123  |
    |   hello  |hello123 |
    |    java  |java123  |







