package com.salmon.test.step_definitions.mobilefirst;

import com.salmon.test.models.cucumber.AddressModel;
import com.salmon.test.models.cucumber.CreditCardModel;
import com.salmon.test.page_objects.mobilefirst.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class mobilefirstCheckoutSteps {

    mobilefirstPDPPage mobilefirstPDPPage;
    mobilefirstCartPage mobilefirstCartPage;
    mobilefirstPickAPathPage mobilefirstPickAPathPage;
    mobilefirstShippingPage mobilefirstShippingPage;
    mobilefirstPaymentPage mobilefirstPaymentPage;
    mobilefirstOrderConfirmationPage mobilefirstOrderConfirmationPage;

    public mobilefirstCheckoutSteps(mobilefirstOrderConfirmationPage mobilefirstOrderConfirmationPage, mobilefirstPaymentPage mobilefirstPaymentPage,mobilefirstShippingPage mobilefirstShippingPage,mobilefirstPickAPathPage mobilefirstPickAPathPage,mobilefirstCartPage mobilefirstCartPage,mobilefirstPDPPage mobilefirstPDPPage){
        this.mobilefirstPDPPage = mobilefirstPDPPage;
        this.mobilefirstCartPage = mobilefirstCartPage;
        this.mobilefirstPickAPathPage = mobilefirstPickAPathPage;
        this.mobilefirstShippingPage = mobilefirstShippingPage;
        this.mobilefirstPaymentPage = mobilefirstPaymentPage;
        this.mobilefirstOrderConfirmationPage = mobilefirstOrderConfirmationPage;
    }

    @When("^checkout from the cart page$")
    public void checkout_from_the_cart_page() throws Throwable {
        mobilefirstPDPPage.clickMiniCart();
        mobilefirstCartPage.clickCheckOut();
    }

    @When("^checkout as a guest user$")public void checkout_as_a_guest_user() throws Throwable {
        mobilefirstPickAPathPage.clickButtonCheckOutAsGuest();
    }

    @When("^enter shipping details$")
    public void enter_shipping_details(List<AddressModel> addressModelList) throws Throwable {
        mobilefirstShippingPage.enterShippingDetails(addressModelList);
        mobilefirstShippingPage.clickPaymentButton();
    }

    @When("^enter payment details and click place an order$")
    public void enter_payment_details_and_click_place_an_order(List<CreditCardModel>creditCardModels) throws Throwable {
        mobilefirstPaymentPage.enterPaymentDetails(creditCardModels);
        mobilefirstPaymentPage.clickPlaceOrder();
        mobilefirstPaymentPage.clickPlaceOrder();
    }

    @Then("^the order confirmation page should be displayed$")
    public void the_order_confirmation_page_should_be_displayed() throws Throwable {
        Assert.assertTrue(true, mobilefirstOrderConfirmationPage.getOrderNumber());

    }
}
