package com.salmon.test.step_definitions.mobilefirst;

import com.salmon.test.models.cucumber.RegistrationModel;
import com.salmon.test.page_objects.mobile.MyAccountsPage;
import com.salmon.test.page_objects.mobilefirst.UserRegistrationPage;
import com.salmon.test.page_objects.mobilefirst.mobilefirstHomePage;
import com.salmon.test.page_objects.mobilefirst.mobilefirstMyAccountPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.validation.constraints.AssertTrue;
import java.util.List;

public class mobilefirstUserRegistration {

    UserRegistrationPage userRegistrationPage;
    mobilefirstMyAccountPage mobilefirstMyAccountPage;
    mobilefirstHomePage mobilefirstHomePage;

    public mobilefirstUserRegistration(mobilefirstHomePage mobilefirstHomePage, mobilefirstMyAccountPage mobilefirstMyAccountPage, UserRegistrationPage userRegistrationPage){
        this.userRegistrationPage = userRegistrationPage;
        this.mobilefirstMyAccountPage = mobilefirstMyAccountPage;
        this.mobilefirstHomePage = mobilefirstHomePage;
    }

    @When("^user clicks on menu icon$")
    public void user_clicks_on_menu_icon() throws Exception {
        mobilefirstHomePage.clickMenuIcon();
    }

    @When("^navigates to login page$")
    public void navigates_to_login_page() throws Exception {
        mobilefirstHomePage.clickLoginLink();
        mobilefirstHomePage.clickCreateAccount();
    }

    @When("^user enters the below details on the registration page$")
    public void user_enters_the_below_details_on_the_registration_page(List<RegistrationModel> regdetails) throws Exception {
        userRegistrationPage.userRegistration(regdetails);
    }

    @Then("^user should be registered successfully and navigated to the My Account page$")
    public void user_should_be_registered_successfully_and_navigated_to_the_My_Account_page() throws Exception {
        Assert.assertTrue(mobilefirstMyAccountPage.getTextProfile().isDisplayed());
    }

}
