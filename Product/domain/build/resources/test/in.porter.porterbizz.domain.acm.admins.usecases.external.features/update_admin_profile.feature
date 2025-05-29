Feature: Update an Admin Profile

  Scenario:
    Given There is an account with name TestCompanyUpdateAdminProfile
    And Admin with email testAdmin@testmail.com exists as primary admin
    And Admin Profile is created with firstName FName and lastName LName and mobile 9234567890
    And Valid UpdateAdminProfileRequest is passed with firstName NewFName and lastName NewLName and mobile 9234567890
    When UpdateAdminProfile is called
    Then Admin Profile is updated

  Scenario:
    Given There is an account with name TestCompanyUpdateAdminProfile
    And Admin with email testAdmin@testmail.com exists as primary admin
    And Admin Profile is created with firstName FName and lastName LName and mobile 9234567890
    And Valid UpdateAdminProfileRequest is passed with firstName FName and lastName LName and mobile 1234567890
    When UpdateAdminProfile is called
    Then AdminMobileNotValidException is thrown

  Scenario:
    Given There is an account with name TestCompanyUpdateAdminProfile
    And Admin with email testAdmin@testmail.com exists as primary admin
    And Admin Profile is not created with firstName FName and lastName LName and mobile 9234567890
    And Valid UpdateAdminProfileRequest is passed with firstName FName and lastName LName and mobile 9234567890
    When UpdateAdminProfile is called
    Then AdminProfileNotFoundException is thrown