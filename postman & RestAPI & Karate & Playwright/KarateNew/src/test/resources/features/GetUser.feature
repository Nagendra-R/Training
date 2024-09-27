Feature: Get list of bookings
  Scenario: Verify user can retrieve list of bookings
    Given url host
    And path '/user/string'
    When method get
    Then status 200
    And print response

