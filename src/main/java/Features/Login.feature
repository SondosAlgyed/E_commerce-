@Regression
Feature: user should able to login Successfully
  Scenario: User could log in with valid email and password
    Given user go to login page
    When user enter valid email and password
    Then user could log in Successfully and go to home page