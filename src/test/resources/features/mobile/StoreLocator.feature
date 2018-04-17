Feature: Store Locator

  Scenario: Search Store
  Given the user is on the home page
  When user choses store locator
  And search with details
  |zipCode|Country|
  |WD171DA|United States|
  Then the list of the stores should be displayed