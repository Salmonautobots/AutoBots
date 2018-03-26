package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.page_objects.gui.WebSearchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by aherappa on 19/12/2017.
 */

public class WebSearchSteps {

    private WebSearchPage searchPage;

    public WebSearchSteps(WebSearchPage searchPage) {
        this.searchPage = searchPage;
    }

    @When("^I search for a product sku$")
    public void iSearchForAProductSku() throws Throwable {
        searchPage.enterSearchInput(Props.getMessage("Sku"));
        searchPage.clickOnSearchForm();
    }

    @Then("^I navigate to product deatils page of the searched sku$")
    public void iNavigateToProductDeatilsPageOfTheSearchedSku() throws Throwable {
        assertThat(searchPage.getCurrentUrl().contains("PDP"));
    }

    @When("^I enter the search keyword \"([^\"]*)\" on search box$")
    public void iEnterTheSearchKeywordOnSearchBox(String searchKeyword) throws Throwable {
        searchPage.enterSearchInput(searchKeyword);
    }

    @When("^I click on search button$")
    public void iClickOnSearchButton() throws Throwable {
        searchPage.clickOnSearchForm();
    }

    @Then("^I navigated to that correct \"([^\"]*)\" search results page$")
    public void iNavigatedToThatCorrectSearchResultsPage(String searchKeyword) throws Throwable {
        assertThat(searchPage.getCurrentPageTitle().contains(searchKeyword));
    }
}
