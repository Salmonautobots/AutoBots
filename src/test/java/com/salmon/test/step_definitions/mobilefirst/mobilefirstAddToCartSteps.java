package com.salmon.test.step_definitions.mobilefirst;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.mobilefirst.mobilefirstHomePage;
import com.salmon.test.page_objects.mobilefirst.mobilefirstPDPPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class mobilefirstAddToCartSteps {

    mobilefirstHomePage mobilefirstHomePage;
    mobilefirstPDPPage mobilefirstPDPPage;

        public mobilefirstAddToCartSteps(mobilefirstHomePage mobilefirstHomePage, mobilefirstPDPPage mobilefirstPDPPage ){

            this.mobilefirstHomePage = mobilefirstHomePage;
            this.mobilefirstPDPPage = mobilefirstPDPPage;
        }

    @Given("^the user is on the mobilefirst home page$")
    public void theUserIsOnTheMobilefirstHomePage() throws Exception {
        UrlBuilder.startAtHomePage();
    }

    @Given("^click on mobilefirst menu icon$")
    public void click_on_mobilefirst_menu_icon() throws Exception {

    }

    @When("^I search and select the \"([^\"]*)\"$")
    public void i_search_and_select_the(String arg1) throws Exception {

    }

    @When("^add the product to the cart with size \"([^\"]*)\"  and quantity \"([^\"]*)\"$")
    public void add_the_product_to_the_cart_with_size_and_quantity(String arg1, String arg2) throws Exception {

    }

    @Then("^the product should be added to the basket$")
    public void the_product_should_be_added_to_the_basket() throws Exception {

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