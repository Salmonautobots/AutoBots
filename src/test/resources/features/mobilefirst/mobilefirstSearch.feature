Feature: As a user I want to use the search component for words, sentences etc. so that I should be able to see all the contents
  from the website matching the search criteria.

  Background: This is precondition for all the scenarios for the features for which user dont need to login
    When the user is on the mobilefirst home page
    And confirms the consent window
 #   And clicks on mobilefirst menu icon


  Scenario Outline: Search with valid data set

    When user enters search criteria "<searchCriteria>" in the mobilefirst search field
    Then the matching results should be displayed on the page

    Examples:
      | searchCriteria |
      | Skirt          |

  Scenario Outline: Search with Inva
  lid search data set

    When user enters search criteria "<searchCriteria>" in the mobilefirst search field
    Then the "<message>" should be displayed on the page

    Examples:
      | searchCriteria | message                                              |
      |                | We are sorry, but no results were found for          |
  #    | qqqqqqq        | We are sorry, but no results were found for:qqqqqqq |