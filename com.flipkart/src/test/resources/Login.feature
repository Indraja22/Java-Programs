Feature: FlipKart e-shopping website automation

  Scenario Outline: Login to FlipKart application with different credentials
    Given User has launched the application for testcase id "<DataID>"
    When User is able to create a new account for himself or is able to login to an existing account
    Then Take a screenshot of successfull login

    Examples:
      | DataID |


