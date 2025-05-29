Feature: Create an admin v1
  As Porterbizz
  I want to create an admin for an account

  Scenario: Successfully create an admin
    Given There is an account with name TestCompanyAdminV1
    And CreateAdminV1Request is for email test@testmail.com
    When CreateAdminV1 is called
    Then Admin object is returned for CreateAdminV1