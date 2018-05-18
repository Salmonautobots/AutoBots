package com.salmon.test.step_definitions.mobilefirst;

import com.salmon.test.page_objects.mobilefirst.mobilefirstHomePage;
import com.salmon.test.page_objects.mobilefirst.mobilefirstPLPPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import javax.validation.constraints.AssertTrue;

public class mobilefirstBrowse {

    mobilefirstHomePage mobilefirstHomePage;
    mobilefirstPLPPage mobilefirstPLPPage;


    public mobilefirstBrowse(mobilefirstHomePage mobilefirstHomePage,mobilefirstPLPPage mobilefirstPLPPage){
        this.mobilefirstHomePage = mobilefirstHomePage;
        this.mobilefirstPLPPage = mobilefirstPLPPage;
    }

    String filterCriteria;
    String beforeResult;
    @When("^click ton the filter header \"([^\"]*)\" and filter \"([^\"]*)\"$")

    public void click_ton_the_filter_header_and_filter(String filterhead, String filterCriteria) throws Exception {

        this.filterCriteria = filterCriteria;
        beforeResult = mobilefirstPLPPage.filterResults();
        mobilefirstPLPPage.clickButtonFilter();
        mobilefirstPLPPage.applyFilter(filterhead,filterCriteria);
        mobilefirstPLPPage.close();
    }

    @Then("^the filter should be applied successfully$")
    public void the_filter_should_be_applied_successfully() throws Exception {
        Assert.assertEquals(mobilefirstPLPPage.checkAppliedFilter(),filterCriteria);
        Assert.assertNotEquals(beforeResult,mobilefirstPLPPage.filterResults());
    }
}
