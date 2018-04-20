package com.salmon.test.step_definitions.mobile;

import com.salmon.test.page_objects.mobile.MobileHomePage;
import com.salmon.test.page_objects.mobile.StoreFinderPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class StoreFinderSteps {
    MobileHomePage mobileHomePage;
    StoreFinderPage storeFinderPage;

    String postcode;

    public StoreFinderSteps(MobileHomePage mobileHomePage, StoreFinderPage storeFinderPage) {
        this.mobileHomePage = mobileHomePage;
        this.storeFinderPage = storeFinderPage;
    }

    @When("^user chose store locator and search with the Post Code \"([^\"]*)\"$")
    public void user_chose_store_locator_and_search_with_the_Post_Code(String postcode) throws Exception {
        this.postcode = postcode;
        mobileHomePage.clickStoreFinderIcon();
        storeFinderPage.searchStore(postcode);
    }

    @Then("^the list of the stores should be displayed$")
    public void the_list_of_the_stores_should_be_displayed() throws Exception {
        Assert.assertTrue(storeFinderPage.storeResultsCheck(postcode));
    }
}