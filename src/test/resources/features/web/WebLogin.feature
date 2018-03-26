Feature: As a customer I want to login to website to maintain personal deatils

  Background: This is precondition for all the scenarios in this in feature file
    Given I navigate to the Project "Home" page

  Scenario: As a user I want to Login to the website with valid credentials
    When I am on the login page
    And  I enter in valid User name
    And  I enter in valid password
    And  I click on login button
    Then I should see welcome message on website

