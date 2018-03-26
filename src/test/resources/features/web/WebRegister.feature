Feature: As a customer I want to register to website and i can sign up for news letter

  Background: This is precondition for all the scenarios in this in feature file
    Given I am on the login page
    When  I click on create account button

  Scenario: As a user I want to Login to the website with valid credentials
    When I enter all valid the details on the registration page
    And  I click on register button
    Then I should see successfully registered message on website


    # This scenario to check data field validation on registration page
    # Used data model for this scenario
    # Expected error messages are retrieved from message property to compare with actual
  Scenario: As a user I want to Login to the website with valid credentials
    Then I see error message for mandatory fields on registration page
      | Title | First Name      | Last Name      | Password | Email Address  | Confirm Password | Mobile number | ErrorMessage                    |
      |       | User first name | User Last name | Pa55word | user@gmail.com | Pa55word         | 123456789     | errorTitleIsMandatory           |
      | Mr    |                 | User Last name | Pa55word | user@gmail.com | Pa55word         | 123456789     | errorFirstNameIsMandatory       |
      | Mr    | User first name |                | Pa55word | user@gmail.com | Pa55word         | 123456789     | errorLastNameIsMandatory        |
      | Mr    | User first name | User Last name |          | user@gmail.com | Pa55word         | 123456789     | errorPasswordIsMandatory        |
      | Mr    | User first name | User Last name | Pa55word |                | Pa55word         | 123456789     | errorEmailAddressIsMandatory    |
      | Mr    | User first name | User Last name | Pa55word | user@gmail.com |                  | 123456789     | errorConfirmPasswordIsMandatory |
      | Mr    | User first name | User Last name | Pa55word | user@gmail.com | Pa55word         |               | errorMobileNumberIssMandatory   |



