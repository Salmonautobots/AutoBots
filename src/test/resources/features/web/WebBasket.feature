Feature: As a customer I can view the my basket deatils before proceeding to checkout

  Background: This is precondition for all the scenarios in this in feature file
    Given I navigate to the Project "Home" page
    And   I clear the basket page

  Scenario: As a user i can view the deatils of the product in Basket page
    Given I add items to the basket Page
    Then  I can see the added Product name in the basket
    And   I can see the added product price in the basket
    And   I can see checkout securely button
    And   I can see continue shopping button
