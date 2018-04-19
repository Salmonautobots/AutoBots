package com.salmon.test.step_definitions.mobile;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.mobile.MobileHomePage;
import com.salmon.test.page_objects.mobile.MobilePDPPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class AddToCartSteps {

    private MobileHomePage mobileHomePage;
    private MobilePDPPage mobilePDPPage;

    public AddToCartSteps(MobileHomePage mobileHomePage, MobilePDPPage mobilePDPPage){
        this.mobileHomePage = mobileHomePage;
        this.mobilePDPPage = mobilePDPPage;
    }

    @Given("^the user is on the home page$")
    public void the_user_is_on_the_home_page() throws Exception {
        UrlBuilder.startAtHomePage();
    }

    @When("^user selects \"([^\"]*)\" category$")
    public void user_selects_category(String category) throws Exception {
        mobileHomePage.clickCategory(category);
    }

    @When("^I search the product \"([^\"]*)\"$")
    public void i_search_the_product(String productname) throws Exception {
        mobileHomePage.clickSearchedProduct(productname);
    }

    @Then("^the product should be added to the cart$")
    public void the_product_should_be_added_to_the_cart() throws Exception {
        mobilePDPPage.mouseoverCart(mobilePDPPage.getCart());
       Assert.assertTrue(mobilePDPPage.checkAddedProductsInMiniBasket());
    }

    @When("^add the product to the cart with size \"([^\"]*)\", colour \"([^\"]*)\" and quantity \"([^\"]*)\"$")
    public void add_the_product_to_the_cart_with_size_colour_and_quantity(String size, String colour, String quantity) throws Exception {
        mobilePDPPage.selectColourOrSizeSwatch(size);
        mobilePDPPage.selectColourOrSizeSwatch(colour);
        mobilePDPPage.addQuantity(quantity);
        mobilePDPPage.addToBag();
    }

}