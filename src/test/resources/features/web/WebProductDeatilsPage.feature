Feature: As a customer I can view the deatils about the product in PDP

  Background: This is precondition for all the scenarios in this in feature file
    Given I navigate to "Sku id" Product deatils page

  Scenario: As a user I can view the deatils of the product in PDP
    Then I can see the Product name
    And  I can see the Price
    And  I can see add to basket button

  Scenario: As a user I can add a product to my basket from PDP
    When I click on Add to basket button
    Then I can see item is added to the basket message is displayed
    And  i can see mini basket is updated with the item count

