Feature: validate login functionality

  Scenario: verify user can login with valid credentials
    Given user opens the website
    Then verify user is on login page
    When user enters username "valid.username" and password "valid.password"
    Then verify user is on home page


  Scenario: verify locked out user cannot get access to the application
    Given user opens the website
    Then verify user is on login page
    When user enters username "locked.username" and password "valid.password"
    Then verify locked out user error message is displayed as below
      | Sorry, this user has been locked out. This is failed |


#  Scenario: verify the sort is descending order
#    Given user opens the website
#    Then verify user is on login page
#    When user enters username "valid.username" and password "valid.password"
#    When user click on the name ZToaA button
#    Then  verify user is sorted in descending order
#
#
#  Scenario: sort the price low to high
#    Given user opens the website
#    Then verify user is on login page
#    When user enters username "valid.username" and password "valid.password"
#    When user click on price low to high
#    Then verify the price is sort in ascending order
#
#
#  Scenario Outline: verify all the users are valid or not
#    Given user opens the website
#    Then verify user is on login page
#    When user enters with every "<username>" and "<password>"
#    Then verify user is on home page
#    Examples:
#      | username                | password     |
#      | standard_user           | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |
#      | error_user              | secret_sauce |
#      | visual_user             | secret_sauce |






#  Scenario: verify add to cart is working









