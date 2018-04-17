package com.salmon.test.step_definitions.mobile;

import com.salmon.test.page_objects.mobile.MobileHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreFinderSteps {
    MobileHomePage mobileHomePage;
    public StoreFinderSteps(MobileHomePage mobileHomePage){
        this.mobileHomePage = mobileHomePage;
    }

    @When("^user chose store locator$")
    public void user_chose_store_locator() throws Exception {
        mobileHomePage.getStoreFinderIcon().click();
    }

    @When("^search with details as Post Code \"([^\"]*)\"$")
    public void search_with_details_as_Post_Code(String postcode) throws Exception {

    }

    @Then("^the list of the stores should be displayed$")
    public void the_list_of_the_stores_should_be_displayed() throws Exception {

    }


}
