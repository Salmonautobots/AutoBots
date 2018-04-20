package com.salmon.test.step_definitions.mobile;

import com.salmon.test.page_objects.mobile.MobileHomePage;
import com.salmon.test.page_objects.mobile.MobilePLPPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class BrowseSteps {

    String filtercriteria;
    MobileHomePage mobileHomePage;
    MobilePLPPage mobilePLPPage;

    public BrowseSteps(MobileHomePage mobileHomePage, MobilePLPPage mobilePLPPage) {
        this.mobileHomePage = mobileHomePage;
        this.mobilePLPPage = mobilePLPPage;
    }

    @When("^click on the \"([^\"]*)\" section$")
    public void click_on_the_section(String section) throws Exception {
        mobileHomePage.clickSectionArrow(section);
    }

    @When("^apply the filter \"([^\"]*)\" filter$")
    public void apply_the_filter_filter(String filtercriteria) throws Exception {
        this.filtercriteria = filtercriteria;
        mobilePLPPage.applyFilter(filtercriteria);
    }

    @Then("^the filter should be successfully applied and the matching result should be populated$")
    public void the_filter_should_be_successfully_applied_and_the_matching_result_should_be_populated() throws Exception {
        Assert.assertTrue(mobilePLPPage.checkAppliedFilter(filtercriteria));
    }
}
