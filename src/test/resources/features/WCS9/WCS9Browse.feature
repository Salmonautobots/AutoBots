Feature: As a user I want to apply the filter to the results so that the results should be updated
  Background: Precondition

    Given user is on the WCS homepage

   Scenario Outline: Apply the filters to the result

    When user enters search criteria "<searchCriteria>" in the WCS search field
    Then the matching results should be displayed on the WCS page
     And apply the filtering criteria on the page
     Then the results should be updated as per the applied criteria

    Examples:
      | searchCriteria |
      | Skirt          |
