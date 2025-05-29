Feature: Update an Admin

  Scenario:
    Given There is an account with name TestCompanyUpdateAdminProfile
    And Admin with email testAdmin@testmail.com exists as primary admin
    And Valid UpdateAdminRequest is passed with email newTestAdmin@testmail.com
    When UpdateAdmin is called
    Then Updated Admin object is returned
