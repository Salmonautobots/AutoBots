package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.page_objects.gui.WebBasketPage;
import com.salmon.test.page_objects.gui.WebProductDeatilsPage;
import com.salmon.test.page_objects.gui.WebSearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


/**
 * Created by aherappa on 21/12/2017.
 */

public class WebBasketPageSteps {

    private WebBasketPage basketPage;
    private WebProductDeatilsPage productDeatils;
    private WebSearchPage searchPage;

    public WebBasketPageSteps(WebBasketPage basketPage, WebSearchPage searchPage, WebProductDeatilsPage productDeatils) {
        this.searchPage = searchPage;
        this.basketPage = basketPage;
        this.productDeatils = productDeatils;
    }

    @Given("^I navigate to the basket Page$")
    public void iNavigateToTheBasketPage() throws Throwable {
        searchPage.enterSearchInput(Props.getMessage("Sku"));
        searchPage.clickOnSearchForm();
        assertThat(productDeatils.getCurrentPageTitle().contains(" we need to specify the index of PDP page"));
        basketPage.clickOnMiniBasketIconHeader();
        assertThat(basketPage.getCurrentPageTitle().contains("Mention the basket page title here"));
    }

    @Then("^I can see the added Product name in the basket$")
    public void iCanSeeTheAddedProductNameInTheBasket() throws Throwable {
        assertThat(basketPage.getBasketProductName().equalsIgnoreCase(Props.getProp("BasketProductName")));
    }

    @Then("^I can see the added product price in the basket$")
    public void iCanSeeTheAddedProductPriceInTheBasket() throws Throwable {
        assertThat(basketPage.getBasketProductPrice().equalsIgnoreCase(Props.getProp("BasketProductPrice")));
    }

    @Then("^I can see checkout securely button$")
    public void iCanSeeCheckoutSecurelyButton() throws Throwable {
        basketPage.isCheckoutBtnDisplayed();
    }

    @Then("^I can see continue shopping button$")
    public void iCanSeeContinueShoppingButton() throws Throwable {
        basketPage.isContinueShoppingBtnDisplayed();
    }

    @Given("^I clear the basket page$")
    public void iClearTheBasketPage() throws Throwable {
        basketPage.checkEmptyBasketDisplayed();
        assertThat(basketPage.getCurrentPageTitle()).contains(" Basket empty messge");

    }

    @Given("^I add items to the basket Page$")
    public void iAddItemsToTheBasketPage() throws Throwable {
        searchPage.enterSearchInput(Props.getMessage("Sku"));
        searchPage.clickOnSearchForm();
        assertThat(productDeatils.getCurrentPageTitle().contains(" we need to specify the index of PDP page"));
        basketPage.clickOnMiniBasketIconHeader();
        assertThat(basketPage.getCurrentPageTitle().contains("Mention the basket page title here"));
    }
}
