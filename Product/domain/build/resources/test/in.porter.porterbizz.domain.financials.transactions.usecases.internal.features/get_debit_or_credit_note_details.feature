Feature: Get Debit or Credit Note Details Feature
  Scenario: Successfully get the debit note details when a given order transaction is updated
    Given There is an account with name TestCompanyDnCn
    And There are gst details for accountId 1 for stateId 3
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 exists and is completed successfully
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 100     |
      | 1234567891  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 150     |
    And Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    When Debit Or Credit Note generation is invoked with orderId 1234567890 and accountId 1 and amount 50 and noteType debit and original order amount 100 and updated order amount 150
    Then A Note with noteType debit and amount 50.0 and accountId 1 should be generated

  Scenario: Check for the note number validations when a debit note is generated
    Given There is an account with name TestCompanyDnCn
    And There are gst details for accountId 1 for stateId 3
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 exists and is completed successfully
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 100     |
      | 1234567891  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 150     |
    And Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    When Debit Or Credit Note generation is invoked with orderId 1234567890 and accountId 1 and amount 50 and noteType debit and original order amount 100 and updated order amount 150
    Then The Note with type debit should have no of digits as 10 in the note number

  Scenario: Successfully get the credit note details when a given order transaction is updated
    Given There is an account with name TestCompanyDnCn
    And There are gst details for accountId 1 for stateId 3
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 exists and is completed successfully
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 100     |
      | 1234567891  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 150     |
    And Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    When Debit Or Credit Note generation is invoked with orderId 1234567890 and accountId 1 and amount 50 and noteType credit and original order amount 100 and updated order amount 50
    Then A Note with noteType credit and amount 50.0 and accountId 1 should be generated

  Scenario: Give null gst info in case no billing info is present
    Given There is an account with name TestCompanyDnCn
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 exists and is completed successfully
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 100     |
    And Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    When Debit Or Credit Note generation is invoked with orderId 1234567890 and accountId 1 and amount 50 and noteType debit and original order amount 100 and updated order amount 150
    Then GST info should be null for stateId 10

  Scenario: Use default Porter GST and IGST rates in case no gst details are present for Porter in that state
    Given There is an account with name TestCompanyDnCn
    And There are gst details for accountId 1 for stateId 3
    And Customer with customer_id 1 exists
    And Order with orderId 1234567890 exists and is completed successfully
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 100         | Bangalore     | 3      | 100     |
    And Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    When Debit Or Credit Note generation is invoked with orderId 1234567890 and accountId 1 and amount 50 and noteType debit and original order amount 100 and updated order amount 150
    Then IGST should be used for stateId 3