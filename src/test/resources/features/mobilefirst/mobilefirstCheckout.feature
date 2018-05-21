@regression @SSP-2
Feature: As a user, I want to select the goods and make a payment so that the order should be successfully placed

  Background: This is precondition for all the scenarios for the features for which user dont need to login
    When the user is on the mobilefirst home page
    And confirms the consent window


  Scenario Outline: Search a product and add to cart

    When I search and select the "<product>"
    And  add the product to the cart with size "<size>"  and quantity "<quantity>"
    And checkout from the cart page
    And checkout as a guest user
    And enter shipping details
      | First Name | Last Name | Address1           | City    | PostCode | Phone      | country       | state   |
      | Test       | Tester    | 64, Clarendon Road | Watford | 12345    | 9234567890 | United States | Alabama |

    And enter payment details and click place an order
      | Type | Number           | Expiry Month | Expiry Year | Security Code | Email           |
      | Visa | 4111111111111111 | 10           | 2022        | 224           | test@tester.com |
    Then the order confirmation page should be displayed

    Examples:
      | product                   | quantity | size |
      | Classic Fit Jean (Petite) | 1        | 8    |
