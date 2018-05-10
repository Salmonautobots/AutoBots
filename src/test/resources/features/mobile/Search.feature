@regression2
Feature: As a user I want to use the search component for words, sentences etc. so that I should be able to see all the contents
  from the website matching the search criteria.

  Background: This is precondition for all the scenarios in this in feature file
    Given the user is on the home page
    And click on menu icon

  @SSP-70 @SSP-81 @SSP-69 @Automation @SSP-69 @SSP-70
  Scenario Outline: Search with valid data set

    When user enters valid search criteria "<ValidSearchCriteria>" in the search field
    Then the matching results should be displayed

    Examples:
      | ValidSearchCriteria |
      | Jacket              |

  @SSP-71 @SSP-81 @SSP-69 @Automation @SSP-69 @SSP-71
  Scenario Outline: Search with Invalid search data set

    When the user searches with invalid key words"<keyword>"
    Then the "<message>" should be displayed

    Examples:
      | keyword | message                                              |
      |         | DID YOU MEAN                                         |
      | qqqqq   | WE'RE SORRY, NO PRODUCTS WERE FOUND FOR YOUR SEARCH: |