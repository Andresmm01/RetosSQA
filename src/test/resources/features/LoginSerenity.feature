Feature: Login Serenity
  Scenario: Login successfully in Serenity
    Given User open the browser
    When User insert credentials and click on login
    Then User successfully accesses their profile
