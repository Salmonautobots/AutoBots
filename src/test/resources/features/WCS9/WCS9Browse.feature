Feature: As a user I want to see the results for the searched criteria and error message for the invalid search

  Background: Precondition

    Given user is on the WCS homepage

   Scenario Outline: Search for the valid search criteria

    When user enters search criteria "<searchCriteria>" in the WCS search field
    Then the matching results should be displayed on the WCS page

    Examples:
      | searchCriteria |
      | Skirt          |
