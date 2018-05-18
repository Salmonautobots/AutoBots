package com.salmon.test.step_definitions.mobile;

import com.salmon.test.page_objects.mobile.MobileHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SearchSteps {

    MobileHomePage mobileHomePage;

    public SearchSteps(MobileHomePage mobileHomePage) {
        this.mobileHomePage = mobileHomePage;
    }

    @When("^user enters valid search criteria \"([^\"]*)\" in the search field$")
    public void user_enters_valid_search_criteria_in_the_search_field(String validsearchstring) throws Exception {
        mobileHomePage.searchString(validsearchstring);
    }

    @Then("^the matching results should be displayed$")
    public void the_matching_results_should_be_displayed() throws Exception {
        Assert.assertTrue(mobileHomePage.checkProductImage());
    }

    @When("^the user searches with invalid key words\"([^\"]*)\"$")
    public void the_user_searches_with_invalid_key_words(String invalidsearch) throws Exception {
        mobileHomePage.searchString(invalidsearch);
    }

    @Then("^the \"([^\"]*)\" should be displayed$")
    public void the_should_be_displayed(String invalidSearchString) throws Exception {
        Assert.assertTrue(mobileHomePage.checkInvalidSearchErrors(invalidSearchString));
    }

    @And("^click on menu icon$")
    public void clickOnMenuIcon() throws Exception {
        mobileHomePage.clickToggleMenuClick();
    }
}