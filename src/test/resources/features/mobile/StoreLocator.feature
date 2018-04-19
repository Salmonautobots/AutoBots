@regression
Feature: As a user I want to navigate to the Store Locator link so that I should be able to search
         the nearest stores for the entered post code.

  Background: This is precondition for all the scenarios in this in feature file
    Given the user is on the home page
    And click on menu icon

  Scenario Outline: Search Store

  When user chose store locator and search with the Post Code "<postCode>"
  Then the list of the stores should be displayed

    Examples:
      |postCode|
      |hp19 8bu|