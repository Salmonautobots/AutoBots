package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.models.cucumber.CardDeatilsModel;
import com.salmon.test.page_objects.gui.WebBasketPage;
import com.salmon.test.page_objects.gui.WebCheckoutPage;
import com.salmon.test.page_objects.gui.WebProductDeatilsPage;
import com.salmon.test.page_objects.gui.WebSearchPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by aherappa on 08/01/2018.
 */

public class WebCheckoutSteps {

    private WebBasketPage basketPage;
    private WebProductDeatilsPage productDeatils;
    private WebSearchPage searchPage;
    private WebCheckoutPage checkoutPage;

    public WebCheckoutSteps(WebCheckoutPage checkoutPage, WebBasketPage basketPage, WebSearchPage searchPage, WebProductDeatilsPage productDeatils) {
        this.searchPage = searchPage;
        this.basketPage = basketPage;
        this.productDeatils = productDeatils;
        this.checkoutPage = checkoutPage;
    }

    @When("^I as an existing customer is on basket page with products to checkout$")
    public void iAsAnExistingCustomerIsOnBasketPageWithProductsToCheckout() throws Throwable {
        searchPage.enterSearchInput(Props.getMessage("Sku"));
        searchPage.clickOnSearchForm();
        assertThat(productDeatils.getCurrentPageTitle().contains(" we need to specify the index of PDP page"));
        basketPage.clickOnMiniBasketIconHeader();
        assertThat(basketPage.getCurrentPageTitle().contains("Mention the basket page title here"));
    }

    @When("^I click on the Checkout securely button$")
    public void iClickOnTheCheckoutSecurelyButton() throws Throwable {
        basketPage.clickOnCheckoutBtn();
    }

    @When("^I enter valid delivery address and continue$")
    public void iEnterValidDeliveryAddressAndContinue() throws Throwable {
        checkoutPage.enterDeliveryAddressField();
        checkoutPage.clickOnContinueCheckoutBtn();
    }

    @When("^I enter payment card deatils and confirm payment$")
    public void iEnterPaymentCardDeatilsAndConfirmPayment(List<CardDeatilsModel> cardDeatils) throws Throwable {
        checkoutPage.selectTheCardTypeAsPayment();
        for (CardDeatilsModel cardDetail : cardDeatils) {
            checkoutPage.enterCardDeatils(cardDetail);
        }
        checkoutPage.clickOnContinuePaymentBtn();
    }

    @When("^I click on place order button on review page$")
    public void iClickOnPlaceOrderButtonOnReviewPage() throws Throwable {
        checkoutPage.clickOnPlaceOrderBtnOnReviewPage();
    }

    @Then("^I will be navigated to order confirmation page and successfully placed an order$")
    public void iWillBeNavigatedToOrderConfirmationPageAndSuccessfullyPlacedAnOrder() throws Throwable {
        checkoutPage.getCurrentPageTitle().contains("Order confirmation");
    }


}
