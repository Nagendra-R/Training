Feature: validation of ebay website

  Scenario: Scenario: User navigates through the eBay website and adds items to the cart
    Given user opens the website
    Then validate user is on the eBay home page
    When user searches for "item" on the home page
    Then validate user is on the result page
    When user click the first suggestion item
    Then validate user is on the item details page
    When user clicks on the add to cart button
    Then validate user is on the checkout page
    Then validate amount on checkout page







#    When close the new open window
#    When user searches for "mobiles" on the home page
#    Then validate user is on the result page
#    When user click the first suggestion item
#    Then validate user is on the result page
#    When user clicks on the add to cart button
#    Then validate user is on the checkout page







#    When user searches for "shirts" on the same page
#    Then validate user is on the searched suggestion page
#    When user enters the first suggestion item
#    Then validate user is on the item details page
#    When user clicks on the add to cart button
#    Then validate user is on the checkout page
