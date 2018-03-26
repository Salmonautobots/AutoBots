Feature: As a customer i can search for a specific item on website


  Background: This is precondition for all the scenarios in this in feature file
    Given I navigate to the Project "Home" page

  Scenario: i want to search for the sku on website and i navigate to the PDP
    When I search for a product sku
    Then I navigate to product deatils page of the searched sku


  Scenario Outline:
    When  I enter the search keyword "<searchKeyword>" on search box
    And  I click on search button
    Then I navigated to that correct "<searchKeyword>" search results page
    Examples:
      | searchKeyword |
      | Abc           |
      | Xyz           |
      | 123           |
