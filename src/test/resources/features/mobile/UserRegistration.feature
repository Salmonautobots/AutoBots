Feature: As a guest user, I want to register myself so that I should be able to access the site as a registered user

  Background: This is precondition for all the scenarios in this in feature file
    Given the user is on the home page
    And click on menu icon

    Scenario: Register the user by adding the data into mandatory fields

      When I click on Register link
      And enter the values in the below fields
      Then user should be registered successfully