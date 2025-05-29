Feature: Update BusinessAccountInfo

  Scenario:
    Given There is an account with name TestCompanyUpdateAdminProfile
    And UpdateBusinessAccountsInfoRequest is valid
    When UpdateBusinessAccountInfo is called
    Then Account Info Should be updated
