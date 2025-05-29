Feature: Create an admin
  As Porterbizz
  I want to create an admin for an account

  Scenario: Successfully create an admin
    Given There is an account with name TestCompanyAdmin
    And CreateAdminRequest is for email test@testmail.com
    When CreateAdmin is called
    Then Admin object is returned for CreateAdmin
#
#  Scenario: Successfully create an admin
#    Given There is an account with name TestCompanyAdmin
#    And Admin with email test@testmail.com exists as secondary admin
#    And CreateAdminRequest is for email test@testmail.com
#    When CreateAdmin is called
#    Then MailAlreadyExistsForTheAccountException is thrown
#
#  Scenario: Successfully create an admin
#    Given There is an account with name TestCompanyAdmin
#    And Admin with email test@testmail.com exists as primary admin
#    And There is an account with name TestCompanyAdmin2
#    And CreateAdminRequest is for email test@testmail.com
#    When CreateAdmin is called
#    Then MailAlreadyExistsException is thrown
#
#  Scenario: Successfully create an admin
#    Given There is an account with name TestCompanyAdmin
#    And Admin with email test@testmail.com exists as primary admin
#    And CreateAdminRequest is for email test@testmail.com
#    When CreateAdmin is called
#    Then PrimaryAdminAlreadyExistsException is thrown