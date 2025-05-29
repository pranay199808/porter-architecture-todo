Feature: Get Trip Details of an Account Feature
  Scenario: If business account has consolidated invoice enabled when order was created and If business account has consolidated invoice enabled now, then isConsolidatedInvoiceEnabled should be true
    Given There is an account with name TestCompany with isConsolidatedInvoiceEnabled set to 1
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 and isConsolidatedInvoiceEnabled 1 exists and is completed successfully
    And Order with orderId 1234567890 exists in the trip details cache table
    When Get trip details is called for the account
    Then isConsolidatedInvoiceEnabled field should be present in the response and set to 1

  Scenario: If business account has consolidated invoice disabled when order was created and If business account has consolidated invoice disabled now, then isConsolidatedInvoiceEnabled should be true
    Given There is an account with name TestCompany with isConsolidatedInvoiceEnabled set to 0
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 and isConsolidatedInvoiceEnabled 0 exists and is completed successfully
    And Order with orderId 1234567890 exists in the trip details cache table
    When Get trip details is called for the account
    Then isConsolidatedInvoiceEnabled field should be present in the response and set to 0

  Scenario: If business account has consolidated invoice disabled when order was created and If business account has consolidated invoice enabled now, then isConsolidatedInvoiceEnabled should be false
    Given There is an account with name TestCompany with isConsolidatedInvoiceEnabled set to 1
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 and isConsolidatedInvoiceEnabled 0 exists and is completed successfully
    And Order with orderId 1234567890 exists in the trip details cache table
    When Get trip details is called for the account
    Then isConsolidatedInvoiceEnabled field should be present in the response and set to 0

  Scenario: If business account has consolidated invoice enabled when order was created and If business account has consolidated invoice disabled now, then isConsolidatedInvoiceEnabled should be true
    Given There is an account with name TestCompany with isConsolidatedInvoiceEnabled set to 0
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 and isConsolidatedInvoiceEnabled 1 exists and is completed successfully
    And Order with orderId 1234567890 exists in the trip details cache table
    When Get trip details is called for the account
    Then isConsolidatedInvoiceEnabled field should be present in the response and set to 1