package com.salmon.test.step_definitions.mobilefirst;

import com.salmon.test.framework.PageObject;
import com.salmon.test.page_objects.mobilefirst.mobilefirstHomePage;
import com.salmon.test.page_objects.mobilefirst.mobilefirstMyAccountPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import javax.validation.constraints.AssertTrue;

public class mobilefirstMyAccount {

    mobilefirstHomePage mobilefirstHomePage;
    mobilefirstMyAccountPage mobilefirstMyAccountPage;

    public mobilefirstMyAccount(mobilefirstHomePage mobilefirstHomePage, mobilefirstMyAccountPage mobilefirstMyAccountPage){
        this.mobilefirstHomePage = mobilefirstHomePage;
        this.mobilefirstMyAccountPage = mobilefirstMyAccountPage;
    }

    @When("^login with an existing user$")
    public void login_with_an_existing_user() throws Exception {
        mobilefirstHomePage.clickMenuIcon();
        mobilefirstHomePage.clickLoginLink();
        mobilefirstHomePage.loginWithExistingUser();
    }

    @When("^changes the lastname and enter confirm email and password$")
    public void changes_the_lastname_and_enter_confirm_email_and_password() throws Exception {
        mobilefirstMyAccountPage.clickEditLink();
        mobilefirstMyAccountPage.editLastName();
        mobilefirstMyAccountPage.setConfirmEmail();
        mobilefirstMyAccountPage.setPassword();
        mobilefirstMyAccountPage.clickSaveButton();
    }

    @Then("^the changed record should be successfully populated$")
    public void the_changed_record_should_be_successfully_populated() throws Exception {
        //Assert.assertTrue(mobilefirstMyAccountPage.confirmUpdates());
        mobilefirstMyAccountPage.confirmUpdates();
    }
}
