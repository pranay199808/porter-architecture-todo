Feature: Get an Admin Profile

  Scenario:
    Given There is an account with name TestCompanyGetAdminProfile
    And Admin with email testAdmin@testmail.com exists as primary admin
    And AdminProfile exists for it
    When GetAdminProfile is invoked
    Then The Admin Profile is returned
