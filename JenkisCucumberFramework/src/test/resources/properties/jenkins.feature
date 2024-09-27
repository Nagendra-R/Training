Feature: validate user can login and logout

  Scenario:login create item and logout
    Given user open the localhost8080
    Then validate user on loginPage
    And user enter the "username" and "password"
    And user click the login button
    Then validate user on homepage on jenkins
    When user click on new item
    Then validate user on project file
    Given user enter random string as item name
    Then validate user on configure file
    When user click on file radio button
    And user pass the path "localFilepath"
    And user click on addBuildPathDropDown
    And user select the top level maven
    And user pass "goals" to topLevelMaven
    And user click on save button
    Then validate user finishes the project







