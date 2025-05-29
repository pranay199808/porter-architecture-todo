Feature: Record a payment event

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type PorterGoldCashbackRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type ManualNEFTRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type OverpaymentRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type GoodwillRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type BalanceTransferBusinessAccountCreditRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type BalanceTransferBusinessAccountDebitRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type TDSRefundsRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type WalletRechargeCashbacksRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type AcquisitionCampaignsRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type RetentionCampaignsRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type ReactivationCampaignsRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type OtherCampaignsRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type BalanceWriteOffCreditRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordPaymentRequest is of type BalanceWriteOffDebitRequest and amount 100
    When RecordPaymentEvent is called
    Then Payment Event is recorded

#  Scenario:
#    Given There is an account with name TestCompanyRecordPaymentEvent
#    And Customer with customer_id 1 exists
#    And RecordPaymentRequest is of type PaymentGatewayRechargeRequest and amount 100
#    When RecordPaymentEvent is called
#    Then Payment Event is recorded
#
#  Scenario:
#    Given There is an account with name TestCompanyRecordPaymentEvent
#    And Customer with customer_id 1 exists
#    And RecordPaymentRequest is of type PaymentGatewayVNEFTRequest and amount 100
#    When RecordPaymentEvent is called
#    Then Payment Event is recorded