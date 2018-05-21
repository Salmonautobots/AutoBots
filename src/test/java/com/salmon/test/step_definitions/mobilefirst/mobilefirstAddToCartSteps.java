package com.salmon.test.step_definitions.mobilefirst;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.mobilefirst.mobilefirstCartPage;
import com.salmon.test.page_objects.mobilefirst.mobilefirstHomePage;
import com.salmon.test.page_objects.mobilefirst.mobilefirstPDPPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class mobilefirstAddToCartSteps {

    String productname;

    mobilefirstHomePage mobilefirstHomePage;
    mobilefirstPDPPage mobilefirstPDPPage;
    mobilefirstCartPage mobilefirstCartPage;

        public mobilefirstAddToCartSteps(mobilefirstHomePage mobilefirstHomePage, mobilefirstPDPPage mobilefirstPDPPage,mobilefirstCartPage mobilefirstCartPage){

            this.mobilefirstHomePage = mobilefirstHomePage;
            this.mobilefirstPDPPage = mobilefirstPDPPage;
            this.mobilefirstCartPage = mobilefirstCartPage;
        }

    @Given("^the user is on the mobilefirst home page$")
    public void theUserIsOnTheMobilefirstHomePage() throws Exception {
        UrlBuilder.startAtHomePage();
    }

    @When("^I search and select the \"([^\"]*)\"$")
    public void i_search_and_select_the(String productname) throws Exception {
        this.productname = productname;
        mobilefirstHomePage.search(productname);
        mobilefirstHomePage.selectProduct();
    }

    @When("^add the product to the cart with size \"([^\"]*)\"  and quantity \"([^\"]*)\"$")
    public void add_the_product_to_the_cart_with_size_and_quantity(String size, String quantity) throws Exception {
        mobilefirstPDPPage.selectSize(size);
        mobilefirstPDPPage.selectQuantity(quantity);
        mobilefirstPDPPage.selectColour();
        mobilefirstPDPPage.addToCart();
    }

    @Then("^the product should be added to the basket$")
    public void the_product_should_be_added_to_the_basket() throws Exception {
        mobilefirstPDPPage.checkSuccessAlert();
        mobilefirstPDPPage.clickMiniCart();
        Assert.assertEquals(productname,mobilefirstCartPage.checkProductName());
    }

    @And("^confirms the consent window$")
    public void confirmsTheConsentWindow() throws Exception {
        mobilefirstHomePage.confirmConsentWindow();
    }

    @And("^clicks on mobilefirst menu icon$")
    public void clicksOnMobilefirstMenuIcon() throws Exception {
        mobilefirstHomePage.clickMenuOption();
    }
}
