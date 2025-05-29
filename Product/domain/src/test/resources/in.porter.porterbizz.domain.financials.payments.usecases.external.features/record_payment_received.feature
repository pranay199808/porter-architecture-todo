Feature: Record payment received

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentReceived
    And Admin with email test1233321@testmail.com exists as primary admin
    And Payment Link exists for refId 9c072651-0691-400e-bc22-0287e3163c8b and amount 100 and status success
    And RecordPaymentReceivedRequest is valid for refId 9c072651-0691-400e-bc22-0287e3163c8b and amount 120 and status success
    When RecordPaymentReceived is called
    Then RecordPayment is updated successfully

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentReceived
    And Admin with email test1233321@testmail.com exists as primary admin
    And Payment Link exists for refId 9c072651-0691-400e-bc22-0287e3163c8b and amount 100 and status failure
    And RecordPaymentReceivedRequest is valid for refId 9c072651-0691-400e-bc22-0287e3163c8b and amount 120 and status failure
    When RecordPaymentReceived is called
    Then RecordPayment is updated successfully
