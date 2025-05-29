Feature: Upsert an event

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And Record of type RecordOrderEventRequest and amount 100 exists
    And RecordEventRequest is of type RecordRechargeEventRequest and amount 100 for UpsertEvent
    When UpsertEvent is called
    Then Event is upserted

  Scenario:
    Given There is an account with name TestCompanyRecordPaymentEvent
    And Customer with customer_id 1 exists
    And Record of type RecordOrderEventRequest and amount 100 exists
    And RecordEventRequest is of type RecordAccountMigrationRequest and amount 100 for UpsertEvent
    When UpsertEvent is called
    Then Event is upserted