package com.salmon.test.step_definitions.mobile;

import com.salmon.test.page_objects.mobile.MobileHomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.validation.constraints.AssertTrue;

public class SearchSteps {

    MobileHomePage mobileHomePage;
    public SearchSteps(MobileHomePage mobileHomePage){
        this.mobileHomePage = mobileHomePage;
    }

    @When("^user enters valid search criteria \"([^\"]*)\" in the searcfield$")
    public void user_enters_valid_search_criteria_in_the_searcfield(String searchstring) throws Exception {
        mobileHomePage.getSearchBox().sendKeys(searchstring);
    }

    @When("^clicks on the search button$")
    public void clicks_on_the_search_button() throws Exception {
        mobileHomePage.getSearchIcon().click();
    }

    @Then("^the matching results should be displayed$")
    public void the_matching_results_should_be_displayed() throws Exception {
        Assert.assertTrue(mobileHomePage.getProductImage().isDisplayed());
    }

    @When("^the user searches with \"([^\"]*)\"$")
    public void the_user_searches_with(String search) throws Exception {
        mobileHomePage.getSearchBox().sendKeys(search);
        mobileHomePage.getSearchIcon().click();
    }

    @Then("^the \"([^\"]*)\" should be displayed$")
    public void the_should_be_displayed(String invalidSearchString) throws Exception {
        Assert.assertTrue(mobileHomePage.checkInvalidSearchErrors(invalidSearchString));
    }

}