#Feature: Check if a customer_id is a business customer
#
#  Scenario:
#    Given There is an account with name TestCompanyCustomer
#    And Business Customer with customer_id 1 exists
#    And IsBusinessCustomerRequest is for customer_id 1
#    When IsBusinessCustomer is called
#    Then BusinessCustomer object is returned for IsBusinessCustomer
