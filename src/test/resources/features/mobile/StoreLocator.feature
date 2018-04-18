@regression
Feature: Store Locator

  Scenario Outline: Search Store
  Given the user is on the home page
  When user chose store locator
  And search with details as Post Code "<postCode>"
  Then the list of the stores should be displayed

    Examples:
      |postCode|
      |WD171DA|
