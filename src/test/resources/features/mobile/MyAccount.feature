@regression
Feature: As a registered user, I want to login and navigate to My Account page so that I should be able to update
  the personal details

  Background:   Background: This is precondition for all the scenarios in this in feature file
    Given the user is on the home page
    And click on menu icon
    And login with an existing credentials

  Scenario Outline: Check if the existing user is able to navigate to My Account section and modifies the personal details section.

    When user cliks on "<section>" section from My Account
    And changes the lastname and enter email and password
    Then the record should be successfully changed

    Examples:
      | section       |
      | PERSONAL DATA |