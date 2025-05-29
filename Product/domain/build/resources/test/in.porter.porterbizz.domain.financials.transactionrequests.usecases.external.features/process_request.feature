Feature: Processing transaction requests
  Scenario: Processing a request
    Given Order id "ABC123" for the request
    And Status "Approved"
    And The comment by the approver "This is a test comment."
    When The request is processed
    Then The request is processed successfully
