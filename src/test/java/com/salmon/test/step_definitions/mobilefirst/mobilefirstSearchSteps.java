package com.salmon.test.step_definitions.mobilefirst;

import com.salmon.test.page_objects.mobilefirst.mobilefirstHomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class mobilefirstSearchSteps {
    mobilefirstHomePage mobilefirstHomePage;


    public mobilefirstSearchSteps(mobilefirstHomePage mobilefirstHomePage){
        this.mobilefirstHomePage = mobilefirstHomePage;
    }

    @When("^user enters search criteria \"([^\"]*)\" in the mobilefirst search field$")
    public void user_enters_search_criteria_in_the_mobilefirst_search_field(String searchCriteria) throws Exception {
        mobilefirstHomePage.search(searchCriteria);
    }

    @Then("^the matching results should be displayed on the page$")
    public void the_matching_results_should_be_displayed_on_the_page() throws Exception {
        Assert.assertTrue(mobilefirstHomePage.getSearchResults());
    }

    @When("^the user searches with invalid key words\"([^\"]*)\" in the mobilefirst search field$")
    public void the_user_searches_with_invalid_key_words_in_the_mobilefirst_search_field(String arg1) throws Exception {

    }

    @Then("^the \"([^\"]*)\" should be displayed on the page$")
    public void the_should_be_displayed_on_the_page(String message) throws Exception {
        Assert.assertEquals(mobilefirstHomePage.message(),message);

    }


}
