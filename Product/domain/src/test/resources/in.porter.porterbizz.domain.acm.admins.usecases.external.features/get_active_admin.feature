Feature: Create an admin
  As Porterbizz
  I want to get an admin for an account if it is active

  Scenario:
    Given There is an account with name TestCompanyGetActiveAdmin
    And Admin with email testAdmin@testmail.com exists as primary admin
    When GetActiveAdmin is called for email testAdmin@testmail.com
    Then Admin object is returned for GetActiveAdmin

  Scenario:
    Given There is an account with name TestCompanyGetActiveAdmin
    And Admin with email testAdmin@testmail.com exists as primary admin
    When GetActiveAdmin is called for email testAdmin123@testmail.com
    Then AdminNotFoundException is thrown