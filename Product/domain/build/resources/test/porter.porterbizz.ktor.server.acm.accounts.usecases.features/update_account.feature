Feature: Update BusinessAccount

  Scenario:
    Given There is an account with name TestCompanyUpdateAdminProfile
    And UpdateBusinessAccountRequest is valid
    When UpdateBusinessAccount is called
    Then Account Should be updated
    And InvoicingFrequencyUpdate Should be created
