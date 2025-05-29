Feature: Upsert Order Reallocation Info
  As Porterbizz
  I want to insert Order Reallocation Info for an order once it has been released

  Scenario: Successfully insert a order reallocation info
    Given Given a cancelled order with order_id CRN1056692056
    When UpsertReallocationInfo is called
    Then Order is found in the order_reallocation_infos table
