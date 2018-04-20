Feature: As a guest user, I want to register myself so that I should be able to access the site as a registered user

  Background: This is precondition for all the scenarios in this in feature file
    Given the user is on the home page
    And click on menu icon

    Scenario: Register the user by adding the data into mandatory fields

      When user clicks on user registration icon
      And  user enters the registration details
        |First Name|Last Name|Password    |
        |Jack      |Wills    |Salmon$1234 |
      Then user should be registered successfully and My Account page should be displayed
