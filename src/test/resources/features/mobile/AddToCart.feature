@regression
Feature: Add to cart

  Scenario Outline: Add to cart
    Given the user is on the home page
#    When user selects "<category>" category
    When I search the procust "<product>"
#    And subcategory as "<subcategory>"
#    And click on the product "<product>"
    And select size as "<size>"
    And select colour as "<colour>"
    And enter quantity as "<quantity>"
    And clicks on ADD TO CART button
    Then the product should be added to the cart

#    Examples:
 #     |category    |subcategory|size|quantity|product           |
#      |WOMENS| Womens   |M   |2       | Denim Slim Skirt |

  Examples:
    |product               |quantity|size|colour  |
    | Miko Pullover Hoodie | 2      | M  | Blue   |
