Feature: As a guest user, I want to register myself so that I should be able to access the site as a registered user

  Background: This is precondition for all the scenarios for the features for which user dont need to login
    When the user is on the mobilefirst home page
    And confirms the consent window


  Scenario: User Registration
    When user clicks on menu icon
    And  navigates to login page
    And  user enters the below details on the registration page
      | First Name      | Last Name      | Password   | Mobile number |
      | User first name | User Last name | Salmon$123 | 9234567890    |

    Then user should be registered successfully and navigated to the My Account page