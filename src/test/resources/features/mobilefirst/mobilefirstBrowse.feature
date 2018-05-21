Feature: As a user I want to browse the category and apply the filters so that the results should be displayed
  as per the searched criteria

  Background: This is precondition for all the scenarios for the features for which user dont need to login
    When the user is on the mobilefirst home page
    And confirms the consent window
 #   And clicks on mobilefirst menu icon


  Scenario Outline: Search with valid data set

    When user enters search criteria "<searchCriteria>" in the mobilefirst search field
    And click ton the filter header "<filterheader>" and filter "<filter>"
    Then the filter should be applied successfully

    Examples:
      | searchCriteria | filterheader | filter       |
      | Skirt          | Price        | $50 - $99.99 |
