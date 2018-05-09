@regression
Feature: As a user I want to browse the category and apply the filters so that the results should be displayed
  as per the searched criteria

  Background:   Background: This is precondition for all the scenarios in this in feature file
    Given the user is on the home page
    And click on menu icon

  @SSP-87 @SSP-81 @SSP-86 @Automation
  Scenario Outline: Browse the Main section, categories and apply filters
    When click on the "<section>" section
    And apply the filter "<filter>" filter
    Then the filter should be successfully applied and the matching result should be populated

    Examples:

      | section | filter       |
      | MEN     | £20 - £49.99 |