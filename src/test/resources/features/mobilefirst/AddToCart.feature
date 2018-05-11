Feature:  As a user I want to search the product and navigate to PDP page so that I can add the product into mini cart on mobilefirst site

  Background: This is precondition for all the scenarios for the features for which user dont need to login
    When the user is on the mobilefirst home page
    And confirms the consent window
    And clicks on mobilefirst menu icon

  Scenario Outline: Search a product and add to cart

    When I search and select the "<product>"
    And  add the product to the cart with size "<size>"  and quantity "<quantity>"
    Then the product should be added to the basket

    Examples:
      | product             | quantity | size |
      | Cotton Stretch Pant | 1        | 30   |