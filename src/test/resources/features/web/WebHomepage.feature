Feature: As a customer I want to sign up for news letter from homepage

  Scenario: As a user, I can check site is up and running after deployment
    Given I navigate to the Project "Home" page
    Then  I can see homepage is loaded successfully

  Scenario Outline: I want to sign up for the newsletter
    Given I navigate to the Project "Home" page
    When I enter my email address "<emailId>" in newsletter field
    And  I click on newsletter SIGN UP
    Then I should see newsletter "<ThankYouMessage>"
    Examples:
      | emailId         | ThankYouMessage     |
      | user1@gmail.com | newsletter.thankyou |
      | user2@gmail.com | newsletter.thankyou |





