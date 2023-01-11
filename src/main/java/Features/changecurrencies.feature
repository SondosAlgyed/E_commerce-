@Regression
Feature: user should able to change currency Successfully
  Scenario: User could switch between currencies US-Euro
    When user change currency
    Then All pages will have new currency
