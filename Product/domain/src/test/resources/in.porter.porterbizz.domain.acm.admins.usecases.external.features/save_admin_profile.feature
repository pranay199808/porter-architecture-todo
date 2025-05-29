Feature: Save an Admin Profile

  Scenario:
    Given There is an account with name TestCompanySaveAdminProfile
    And Admin with email testAdmin@testmail.com exists as primary admin
    And Valid AdminProfileDraft is passed with firstName FName and lastName LName and mobile 1234567890
    When SaveAdminProfile is invoked
    Then The Admin Profile is created

  Scenario:
    Given There is an account with name TestCompanySaveAdminProfile
    And Admin with email testAdmin1@testmail.com exists as primary admin
    And AdminProfile with mobile 1234567890 exists
    And Admin with email testAdmin2@testmail.com exists as secondary admin
    And Valid AdminProfileDraft is passed with firstName FName and lastName LName and mobile 1234567890
    When SaveAdminProfile is invoked
    Then AdminMobileDuplicateException is thrown