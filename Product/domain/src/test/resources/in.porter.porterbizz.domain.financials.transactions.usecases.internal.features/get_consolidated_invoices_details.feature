Feature: Get consolidated invoice details

  Scenario: Successfully get consolidated invoice details for an account in given duration
    Given There is an account with name TestCompanyConsInvoice
    And There are gst details for accountId 1 for stateId 3
    And There is an account with name TestCompanyConsInvoice2
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 100     |
      | 1234567891  | 2023-10-10T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 150     |
      | 1234567892  | 2023-10-20T00:00:00Z  | 2         | 3           | Bangalore     | 10      | 200     |
    When Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    Then Total transaction sum should be 100

  Scenario: Give null gst info in case no billing info is present
    Given There is an account with name TestCompanyConsInvoice
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 3           | Bangalore     | 10      | 100     |
    When Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    Then GST info should not exist for stateId 10

  Scenario: Use default Porter GST and IGST rates in case no gst details are present for Porter in that state
    Given There is an account with name TestCompanyConsInvoice
    And There are gst details for accountId 1 for stateId 3
    And Order transactions were done with these details:
      | orderId     | transactionDate       | accountId | geoRegionId | geoRegionName | stateId | amount  |
      | 1234567890  | 2023-10-20T00:00:00Z  | 1         | 100         | Bangalore     | 3      | 100     |
    When Consolidated invoice details are fetched for account 1 in duration 2023-10-15T00:00:00Z to 2023-10-31T00:00:00Z
    Then IGST is used for stateId 3