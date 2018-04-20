@regression
Feature:  As a user I want to search the product, navigate to PDP page so that I can add the product into mini cart

  Background: This is precondition for all the scenarios in this in feature file
    Given the user is on the home page
    And click on menu icon

  Scenario Outline: Search a product and add to cart

    When I search the product "<product>"
    And add the product to the cart with size "<size>", colour "<colour>" and quantity "<quantity>"
    Then the product should be added to the cart

    Examples:
      | product              | quantity | size | colour |
      | Miko Pullover Hoodie | 2        | M    | Blue   |