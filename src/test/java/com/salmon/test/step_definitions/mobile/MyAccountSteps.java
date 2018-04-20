package com.salmon.test.step_definitions.mobile;

import com.salmon.test.page_objects.mobile.MobileHomePage;
import com.salmon.test.page_objects.mobile.MyAccountsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyAccountSteps {

    MyAccountsPage myAccountsPage;
    MobileHomePage mobileHomePage;

    public MyAccountSteps(MyAccountsPage myAccountsPage, MobileHomePage mobileHomePage) {
        this.myAccountsPage = myAccountsPage;
        this.mobileHomePage = mobileHomePage;
    }


    @When("^user cliks on \"([^\"]*)\" section from My Account$")
    public void user_cliks_on_section_from_My_Account(String section) throws Exception {
        myAccountsPage.selectSection(section);
    }

    @When("^changes the lastname and enter email and password$")
    public void changes_the_lastname_and_enter_email_and_password() throws Exception {
        myAccountsPage.changeSurname();
    }

    @Then("^the record should be successfully changed$")
    public void the_record_should_be_successfully_changed() throws Exception {
        myAccountsPage.confirmSurnameUpdate();
    }

    @And("^login with an existing credentials$")
    public void loginWithAnExistingCredentials() throws Exception {
        mobileHomePage.clickLoginLink();
        myAccountsPage.loginWithExistingUser();
    }
}