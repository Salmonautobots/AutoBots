Feature: As a user, I want to select the goods and make a payment so that the order should be successfully placed

  Background: User has to be on the main page and clicked on the menu icon.

    Given the user is on the home page
    And click on menu icon

  @regression
  Scenario Outline: 1. Purchase a product as a registered user

 #     When login with an existing credentials
    When I search the product "<product>"
    And add the product to the cart with size "<size>", colour "<colour>" and quantity "<quantity>"
    And navigate to Full Cart page
    And I click on the Checkout button from the full cart
    And login with an existing credentials on the pick a path page
    And select the credit card from the option
    And enter cvn code
    Then the order should be successfully placed

    Examples:
      | product              | quantity | size | colour |
      | Miko Pullover Hoodie | 2        | M    | Blue   |

  @regression2
  Scenario Outline: 2. Purchase a product as a newly registered user during the purchase journey

    When I search the product "<product>"
    And add the product to the cart with size "<size>", colour "<colour>" and quantity "<quantity>"
    And navigate to Full Cart page
    And I click on the Checkout button from the full cart
    And I click on create account Now button and register as a new user
      | First Name | Last Name | Password    |
      | Jack       | Wills     | Salmon$1234 |
    And enter shipping address
      | First Name | Last Name | Address1           | City    | PostCode | Phone        |
      | Test      | Tester   | 64, Clarendon Road | Watford | WD17 1DA | 01923 320000 |

    And enter credit card details on the billing address page and click continue
      | Card Name  | Type | Number           | Expiry Month | Expiry Year | Security Code |
      | CreditTest   | Visa | 4111111111111111 | December     | 2022        | 224           |

    Then the order should be successfully placed

    Examples:
      | product              | quantity | size | colour |
      | Miko Pullover Hoodie | 2        | M    | Blue   |

  @regression2
  Scenario Outline: 3. Purchase a product as a guest user
    When I search the product "<product>"
    And add the product to the cart with size "<size>", colour "<colour>" and quantity "<quantity>"
    And navigate to Full Cart page
    And I click on the Checkout button from the full cart
    And click Checkout as Guest button
    And enter shipping address
      | First Name | Last Name | Address1           | City    | PostCode | Phone        |
      | Test       | Tester    | 64, Clarendon Road | Watford | WD17 1DA | 01923 320000 |

    And enter email address
      | Email           |
      | test@tester.com |

    And enter credit card details on the billing address page and click continue
      | Card Name  | Type | Number           | Expiry Month | Expiry Year | Security Code |
      | CreditTest | Visa | 4111111111111111 | December     | 2022        | 224           |

    Then the order should be successfully placed
    Examples:
      | product              | quantity | size | colour |
      | Miko Pullover Hoodie | 2        | M    | Blue   |