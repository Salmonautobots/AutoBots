package com.salmon.test.step_definitions.mobile;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.mobile.MobileHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartSteps {

    private MobileHomePage mobileHomePage;

    public AddToCartSteps(MobileHomePage mobileHomePage){
        this.mobileHomePage = mobileHomePage;
    }

    @Given("^the user is on the home page$")
    public void the_user_is_on_the_home_page() throws Exception {
        UrlBuilder.startAtHomePage();
    }

    @When("^user selects \"([^\"]*)\" category$")
    public void user_selects_category(String category) throws Exception {
        //mobileHomePage.getCategory().click();
        mobileHomePage.clickCategory(category);
    }

    @When("^subcategory as \"([^\"]*)\"$")
    public void subcategory_as(String subcategory) throws Exception {
        mobileHomePage.getSubCategory().click();
    }

    @When("^click on the product \"([^\"]*)\"$")
    public void click_on_the_product(String productname) throws Exception {
        mobileHomePage.getWomanProduct().click();
    }

    @When("^select size as \"([^\"]*)\"$")
    public void select_size_as(String size) throws Exception {
        mobileHomePage.clickSize("M");
    }

    @When("^enter quantity as \"([^\"]*)\"$")
    public void enter_quantity_as(String arg1) throws Exception {

    }

    @When("^clicks on ADD TO CART button$")
    public void clicks_on_ADD_TO_CART_button() throws Exception {

    }

    @Then("^the product should be added to the cart$")
    public void the_product_should_be_added_to_the_cart() throws Exception {

    }

}