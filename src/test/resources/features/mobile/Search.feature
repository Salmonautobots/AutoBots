@regression
Feature: Search
# Write in Story format for e.g. As a ....

  Scenario Outline: Search with valid data
  # General spell mistakes
    Given the user is on the home page
    When user enters valid search criteria "<ValidSearchCriteria>" in the searcfield
    #And clicks on the search button  - explicit step not required
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