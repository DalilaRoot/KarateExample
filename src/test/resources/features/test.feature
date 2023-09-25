@test1
Feature: Test
  Scenario: Tester une api
    Given url urlServeur
    When method Get
    Then status 200
    And print response
    And match  response.data[0].first_name contains 'George'