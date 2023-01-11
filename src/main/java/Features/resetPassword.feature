@Regression
Feature: user should able to reset his password successfully
  Scenario: user could reset his password
    Given user go to login page and go to password recovery page
    When user enter valid email
    Then user got Email with instructions
