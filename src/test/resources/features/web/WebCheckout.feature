Feature: As a customer I can view the my basket deatils before proceeding to checkout

  Background:
    Given I navigate to the Project "Home" page


  Scenario: As a user I can able to place order with payment type as Card
    When I as an existing customer is on basket page with products to checkout
    And  I click on the Checkout securely button
    And  I enter valid delivery address and continue
    And  I enter payment card deatils and confirm payment
      | cardNumber       | cvv | expiryMonth | expiryYear |
      | 4111111111111111 | 111 | 03          | 2018       |
    And  I click on place order button on review page
    Then I will be navigated to order confirmation page and successfully placed an order