Feature: validate create booking end point
  Scenario: Verify user can create booking
    Given user wants to call "/booking" end point
    When set header "Content-Type" to "application/json"
    And set request body from "create_booking.json"
    When user performs post call
    Then verify status is 200
    And verify booking id is not empty
    When stores created booking id into "booking.id"
    Given user wants to call "/auth" end point
    When set header "Content-Type" to "application/json"
    And set request body from "create_token.json"
    And user performs post call
    Then verify status is 200
    And store token value to "api.token"
    Given user wants to call "/booking/@id" end point
    When set header "Content-Type" to "application/json"
    And set header "Cookie" to "token=@token"
    And set request body from "update_booking.json"
    And user performs put call
    Then verify status is 200


#    Given user wants to call "/booking" end point
#    And set header "Content-Type" to "application/json"
#    And set request body from the file "create_booking.json"
#    When user performs post call
#    Then verify status code is 200
#    And verify booking id is not empty
#    And stores created booking id into "booking.id"
#    When user wants to call "/auth" end point
#    And set header "Content-Type" to "application/json"
#    And set request body from the file "create_token.json"
#    And user performs post call
#    Then verify status code is 200
#    And store token value to "api.token"
#    When user wants to call "/booking/@id" end point
#    And set header "Content-Type" to "application/json"
#    And set header "Cookie" to "token=@token"
#    And set request body from the file "update_booking.json"
#    And user performs put call
#    Then verify status code is 200




  Scenario: verify status code is 200 and response is not empty
    Given user wants to call "/booking" end point
    When set header "Content-Type" to "application/json"
    When user performs get call
    Then verify status is 200 and response is not empty
#
#
#  Scenario: verify user can update the existing booking
#    Given user wants to call "/booking" end point
#    When user performs get call
#    Then verify status is 200
#    When user stores first booking id from the response




