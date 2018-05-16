package com.salmon.test.step_definitions.WCS9;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.WCS9.WCS9HomePage;
import com.salmon.test.page_objects.mobile.CreateAccountPage;
import com.salmon.test.page_objects.mobile.MobileHomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WCS9HomePageSteps {

    WCS9HomePage wcs9HomePage;

    public WCS9HomePageSteps(WCS9HomePage wcs9HomePage){

        this.wcs9HomePage = wcs9HomePage;
    }

    @Given("^user is on the WCS homepage$")
    public void user_is_on_the_WCS_home_page() throws Exception {
        UrlBuilder.startAtHomePage();

        Thread.sleep(10000);
    }


    @When("^user enters search criteria \"([^\"]*)\" in the WCS search field$")
    public void user_enters_search_criteria_in_the_WCS_search_field(String prodname) throws Exception {

    }


    @Then("^the matching results should be displayed on the WCS page$")
    public void the_matching_results_should_be_displayed_on_the_WCS_page() throws Exception {

    }


}