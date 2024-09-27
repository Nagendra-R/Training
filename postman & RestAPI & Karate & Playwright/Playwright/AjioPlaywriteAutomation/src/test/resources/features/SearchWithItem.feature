Feature: validate the search item in the list of the products
  Scenario: search with item and check with each item
    Given user open the website
    Then verify user on home page
    When user search with "item"
    And user click on the search button
    Then verify the items shown contains the "item"


Scenario: validate the price between 600 to 1200
  Given user open the website
  Then verify user on home page
  When user search with "item"
  And user click on the search button
  Then verify user on shirts item page
  When fill the min "600" and max "1200" amount
  Then validate the price is between min and max
