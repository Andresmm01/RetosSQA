Feature: Change Employee Name in a Purchase Order

  Background:
    Given User opens the browser
    When User inserts credentials and clicks on login

  Scenario: Change employee name in an existing purchase order
    When The user clicks on Open Orders
    And The user selects a specific order
    And Selects a new employee for the order
    And Applies the changes
    Then The changes are validated
