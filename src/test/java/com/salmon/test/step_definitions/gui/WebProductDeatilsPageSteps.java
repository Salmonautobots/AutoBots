package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.gui.WebProductDeatilsPage;
import com.salmon.test.page_objects.gui.WebSearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.Assert.assertEquals;

/**
 * Created by aherappa on 19/12/2017.
 */

public class WebProductDeatilsPageSteps {

    private WebSearchPage searchPage;
    private WebProductDeatilsPage productDeatils;


    public WebProductDeatilsPageSteps(WebSearchPage searchPage, WebProductDeatilsPage productDeatils) {
        this.searchPage = searchPage;

    }

    @Given("^I navigate to \"([^\"]*)\" Product deatils page$")
    public void iNavigateToProductDeatilsPage(String skuId) throws Throwable {
        UrlBuilder.startAtHomePage();
        searchPage.enterSearchInput(skuId);
        searchPage.clickOnSearchForm();
        assertThat(productDeatils.getCurrentPageTitle().contains(" we need to specify the index of PDP page"));
    }

    @Then("^I can see the Product name$")
    public void iCanSeeTheProductName() throws Throwable {
        productDeatils.isProductNameDisplayed();
        assertEquals(Props.getMessage("ProductName"), productDeatils.getProductName());
    }

    @Then("^I can see the Price$")
    public void iCanSeeThePrice() throws Throwable {
        productDeatils.isProductPriceDisplayed();
        assertEquals(Props.getMessage("Product price"), productDeatils.getProductPrice());
    }

    @Then("^I can see add to basket button$")
    public void iCanSeeAddToBasketButton() throws Throwable {
        productDeatils.isAddToCartButtonDisplayed();
    }

    @When("^I click on Add to basket button$")
    public void iClickOnAddToBasketButton() throws Throwable {
        productDeatils.clickOnAddToCartButton();
    }

    @Then("^I can see item is added to the basket message is displayed$")
    public void iCanSeeItemIsAddedToTheBasketMessageIsDisplayed() throws Throwable {
        assertEquals(Props.getMessage("added Cart Message"), productDeatils.getAddedItemMessage());
    }

    @Then("^i can see mini basket is updated with the item count$")
    public void iCanSeeMiniBasketIsUpdatedWithTheItemCount() throws Throwable {
        assertThat(Props.getMessage("miniBasketCount").equalsIgnoreCase(productDeatils.getMiniBasketCount()));
    }


}
