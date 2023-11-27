Feature: Login Serenity
  Scenario Outline: Login successfully in Serenity
    Given User open the browser
    When User insert credentials "<User>" "<Password>" and click on login
    Then User successfully accesses their profile
    Examples:
      | User  | Password |
      | admin | Serenity |