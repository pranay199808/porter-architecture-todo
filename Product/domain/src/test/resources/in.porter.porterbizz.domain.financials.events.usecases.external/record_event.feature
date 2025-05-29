Feature: Record an event

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordEventRequest is of type RecordOrderEventRequest and amount 100
    When RecordEvent is called
    Then Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordEventRequest is of type RecordRechargeEventRequest and amount 100
    When RecordEvent is called
    Then Event is recorded

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And RecordEventRequest is of type RecordAccountMigrationRequest and amount 100
    When RecordEvent is called
    Then Event is recorded