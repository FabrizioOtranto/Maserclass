Feature: Login valid credentials

  Narrative:
  In order to use al the functionalities on the webpage
  As a user
  I want to be able to log in

  Scenario Outline: login Scenario

    Given The user is in the login page of automationPractice
    When The user enters valid username <username> and password <password>
    Then The user is redirected to home page

    Examples:
      |username         |password|
      |"qs123@gmail.com"|"qs123" |
