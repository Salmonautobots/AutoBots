package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.gui.WebHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.testng.Assert.assertEquals;

/**
 * Created by aherappa on 19/12/2017.
 */

public class WebHomePageSteps {


    private WebHomePage homePage;

    public WebHomePageSteps(WebHomePage homePage) {
        this.homePage = homePage;
    }


    @Given("^I navigate to the Project \"([^\"]*)\" page$")
    public void iNavigateToTheProjectPage(String page) throws Throwable {
        if (page.equalsIgnoreCase("Home"))
            UrlBuilder.startAtHomePage();
    }

    @When("^I enter my email address \"([^\"]*)\" in newsletter field$")
    public void iEnterMyEmailAddressInNewsletterField(String emailId) throws Throwable {
        homePage.enterNewsLetterEmailID(emailId);
    }

    @When("^I click on newsletter SIGN UP$")
    public void iClickOnNewsletterSIGNUP() throws Throwable {
        homePage.clickNewsSignUpButton();
    }

    @Then("^I should see newsletter \"([^\"]*)\"$")
    public void iShouldSeeNewsletter(String thankYouMessage) throws Throwable {
        homePage.getNewsLetterThankYouMessage();
        assertEquals(thankYouMessage, homePage.getNewsLetterThankYouMessage());
    }


    @Then("^I can see homepage is loaded successfully$")
    public void iCanSeeHomepageIsLoadedSuccessfully() throws Throwable {
        homePage.getCurrentPageTitle().contains("Homepage");
    }
}

