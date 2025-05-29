Feature: Create a business customer

  Scenario: Successfully create a Business Customer
    Given There is an account with name TestCompanyCustomer
    And CreateBusinessCustomerRequest is for customer_id 1
    When CreateBusinessCustomer is called
    Then BusinessCustomer object is returned