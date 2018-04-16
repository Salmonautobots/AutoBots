Feature: Add to cart

  Scenario Outline: Add to cart
    Given the user is on the home page
    When user selects "<category>" category
    And subcategory as "<subcategory>"
    And click on the product "<product>"
    And select size as "<size>"
    And enter quantity as "<quantity>"
    And clicks on ADD TO CART button
    Then the product should be added to the cart

    Examples:
      |category    |subcategory|size|quantity|product           |
      |WOMENS| Womens   |M   |2       | Denim Slim Skirt |