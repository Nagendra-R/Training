Feature: Create Auth Token
  Scenario Outline: verify user can token
    Given user wants to call "/auth" end point
    When set header "Content-Type" to "application/json"
    And set request body from the file "create_token.json" with username "<username>" and password "<password>"
    When user performs post call
    Then verify status is 200
    Then verify response message is "Bad credentials"
    Examples:
      | username | password |
      |  ADMIN   | admin123 |





