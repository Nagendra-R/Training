Feature:verify user end point
  Scenario:verify user can create user
    Given user wants to call "/user" end point
    When set header "Content-Type" to "application/json"
    And set request body from "create-user.json"
    When user performs post call
    Then verify status is 200

  Scenario:verify user can update data
    Given user wants to call "/user/username" end point
    When set header "Content-Type" to "application/json"
    And user performs get call
    Then verify status is 200








