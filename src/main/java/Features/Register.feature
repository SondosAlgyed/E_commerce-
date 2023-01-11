@Regression
Feature: user should able to  register Successfully
  Scenario: user can register with valid date
    Given user go to register page
    When user enter valid data
    And user click to register
    Then user could register Successfully

