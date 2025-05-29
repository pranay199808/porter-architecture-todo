Feature: Update Invoicing Frequency
  Scenario: Successfully update invoicing frequency if there is any pending update
    Given There is an account with name TestCompany
    And Pending updates in InvoicingFrequencyUpdates are:
    | id | accountId | isConsolidatedInvoiceEnabled | consolidatedInvoiceCycleDuration | status | startDate            |
    | 1  | 1         | true                         | 0                                | ACTIVE | 2023-12-01T00:00:00Z |
    When updateInvoicingFrequencyJob is invoked
    Then businessAccountInfo should be updated
