Feature: Delete gst info
  As Porterbizz
  I want to delete a gst entry for an account

  Scenario: Successfully delete a gst info ( billing infos)
    Given There is an account with name TestAccount
    And There are gst details for accountId 1 for stateId 3
    And DeleteBillingInfoRequest is for account_external_id
    When DeleteBillingInfo is called
    Then BillingInfo is deleted


