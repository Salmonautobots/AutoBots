@SSP-2 @regression2
Feature: POC for Salesforce Commerce Cloud

  Background:
		#@AKZON-880
    Given the user is on the home page
    And click on menu icon


	#When user clicks on icon and selects Register option then after entering the data in the first name, last name, email and valid password, registration is successful
  @SSP-73 @SSP-81 @SSP-74 @Automation
  Scenario: User Registration
    When user clicks on user registration icon
    And  user enters the registration details
      | First Name | Last Name | Password    |
      | Jack       | Wills     | Salmon$1234 |
    Then user should be registered successfully and My Account page should be displayed
