Feature: As a user I want to use the search component for words, sentences etc. so that I should be able to see all the contents
  from the website matching the search criteria.

  Background: This is precondition for all the scenarios for the features for which user dont need to login
    When the user is on the mobilefirst home page
    And confirms the consent window
 #   And clicks on mobilefirst menu icon


  Scenario Outline: Search with valid data set

    When user enters valid search criteria "<ValidSearchCriteria>" in the mobilefirst search field
    Then the matching results should be displayed on the page

    Examples:
      | ValidSearchCriteria |
      | Skirt              |

  Scenario Outline: Search with Invalid search data set

    When the user searches with invalid key words"<keyword>" in the mobilefirst search field
    Then the "<message>" should be displayed on the page

    Examples:
      | keyword | message                                              |
      |         | DID YOU MEAN                                         |
      | qqqqq   | WE'RE SORRY, NO PRODUCTS WERE FOUND FOR YOUR SEARCH: |