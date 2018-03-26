package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.gui.WebLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

/**
 * Created by aherappa on 07/12/2017.
 */

public class WebLoginSteps {

    private WebLoginPage loginPage;


    public WebLoginSteps(WebLoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() throws Throwable {
        UrlBuilder.startAtHomePage();
        loginPage.clickOnSignInHeaderLink();
    }

    @When("^I enter in valid User name$")
    public void iEnterInValidUserName() throws Throwable {
        loginPage.enterValidUsername();
    }

    @When("^I enter in valid password$")
    public void iEnterInValidPassword() throws Throwable {
        loginPage.enterValidPassword();
    }

    @When("^I click on login button$")
    public void iClickOnLoginButton() throws Throwable {
        loginPage.clickOnSignInButton();
    }

    @Then("^I should see welcome message on website$")
    public void iShouldSeeWelcomeMessageOnWebsite() throws Throwable {
        assertEquals(Props.getMessage("welcomeMsg"), loginPage.getWelcomeMessageText());
    }
}

