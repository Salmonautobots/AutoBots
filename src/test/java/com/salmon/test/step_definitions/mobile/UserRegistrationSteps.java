package com.salmon.test.step_definitions.mobile;

import com.salmon.test.page_objects.mobile.CreateAccountPage;
import com.salmon.test.page_objects.mobile.MobileHomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class UserRegistrationSteps {
    MobileHomePage mobileHomePage;
    CreateAccountPage createAccountPage;

    public UserRegistrationSteps(MobileHomePage mobileHomePage, CreateAccountPage createAccountPage){
        this.mobileHomePage = mobileHomePage;
        this.createAccountPage = createAccountPage;
    }
    @When("^user clicks on user registration icon$")
    public void user_clicks_on_user_registration_icon() throws Throwable {
        mobileHomePage.clickUserRegistrationLink();
    }

    @When("^user enters the registration details$")
    public void user_enters_the_registration_details(DataTable userDetails) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

        createAccountPage.registerUser(userDetails);
    }

    @Then("^user should be registered successfully and My Account page should be displayed$")
    public void user_should_be_registered_successfully_and_My_Account_page_should_be_displayed() throws Throwable {
        Assert.assertTrue(createAccountPage.myAccountNavigate());
    }
}