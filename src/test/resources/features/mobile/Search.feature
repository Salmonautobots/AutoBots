@regression
Feature: Search

  Scenario Outline: Search with valid data

    Given the user is on the home page
    When user enters valid search criteria "<ValidSearchCriteria>" in the searcfield
    And clicks on the search button
    Then the matching results should be displayed

    Examples:
      |ValidSearchCriteria|
      |Jacket|

    Scenario Outline: Search with Invalid search data
      Given the user is on the home page
      When the user searches with "<keyword>"
      Then the "<message>" should be displayed

      Examples:
        |keyword|message                                             |
        |       |DID YOU MEAN                                        |
        |qqqqq  |WE'RE SORRY, NO PRODUCTS WERE FOUND FOR YOUR SEARCH:|