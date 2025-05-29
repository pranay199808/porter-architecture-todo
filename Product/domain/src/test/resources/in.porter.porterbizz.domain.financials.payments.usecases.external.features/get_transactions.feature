Feature: Get transactions

  Scenario:
    Given There is an account with name TestCompanyGetTransactions
    And Customer with customer_id 1 exists
    And Order with orderId 12345 exists and is completed successfully
#    And Record of type RecordOrderEventRequest and amount 100 exists
    And Record of type RecordRechargeEventRequest and amount 100 exists
    And Record of type RecordAccountMigrationRequest and amount 100 exists
    And Record of type PorterGoldCashbackRequest and amount 100 exists
    And Record of type ManualNEFTRequest and amount 100 exists
    And Record of type OverpaymentRequest and amount 100 exists
    And Record of type GoodwillRequest and amount 100 exists
    And Record of type BalanceTransferBusinessAccountCreditRequest and amount 100 exists
    And Record of type BalanceTransferBusinessAccountDebitRequest and amount 100 exists
    And Record of type TDSRefundsRequest and amount 100 exists
    And Record of type WalletRechargeCashbacksRequest and amount 100 exists
    And Record of type AcquisitionCampaignsRequest and amount 100 exists
    And Record of type RetentionCampaignsRequest and amount 100 exists
    And Record of type ReactivationCampaignsRequest and amount 100 exists
    And Record of type OtherCampaignsRequest and amount 100 exists
    And Record of type BalanceWriteOffCreditRequest and amount 100 exists
    And Record of type BalanceWriteOffDebitRequest and amount 100 exists
    And GetTransactionsRequest is valid
    When GetTransactions is called
    Then List of transactions is returned
