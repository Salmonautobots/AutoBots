Feature:  As a user I want to search the product, navigate to PDP page so that I can add the product into mini cart

    Scenario Outline: Signup for the news letter

    When the user is on the D&G home page
    And enteres "<email>"
    And clicks signup
    Then the signup should be successful

    Examples:
      | email            |
      | test@tester1.com |