@regression
Feature: Add to cart
# Write in Story format for e.g. As a ....


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

"""
    Scenario Outline: <insert type of user and description>
      Given the user is on the home page
      When the user search for a product "<product name>"
      And the user add the product to cart with "size" and "color" and "quantity"
      Then verify the product is added to the cart
      Examples:
        |product               |quantity|size|colour  |
        | Miko Pullover Hoodie | 2      | M  | Blue   |

"""