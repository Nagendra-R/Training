Feature:  Create USer

  Background:
    * def body = read("classpath://Json//create-user.json")

  Scenario: verify user can post the data
    Given url host
    And path '/user'
    And header Accept = 'application/json'
    And request body
    When method post
    Then status 200
    And print response