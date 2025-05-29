Feature: Create transaction requests

  Scenario: Creating an already existing transaction request
    Given Event type "overpayment" of the request
    And Account id 123456
    And Order id "ABC123"
    And Amount 50 of the order
    And Request reason "This is a test comment."
    And The request is already created
    When The request is created
    Then The request is not created

  Scenario: Creating a transaction request
    Given Event type "overpayment" of the request
    And Account id 123456
    And Order id "ABC123"
    And Amount 50 of the order
    And Request reason "This is a test comment."
    When The request is created
    Then The request is created successfully
