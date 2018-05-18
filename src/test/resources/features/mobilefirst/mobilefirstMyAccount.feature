Feature: As a registered user, I want to login and navigate to My Account page so that I should be able to update
  the personal details

  Background:   Background: This is precondition for all the scenarios in this in feature file

    When the user is on the mobilefirst home page
    And confirms the consent window

    Scenario: Check if the existing user is able to navigate to My Account section and modifies the personal details section.

    When login with an existing user
    And changes the lastname and enter confirm email and password
    Then the changed record should be successfully populated

