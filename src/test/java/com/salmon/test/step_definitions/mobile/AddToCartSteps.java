package com.salmon.test.step_definitions.mobile;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.mobile.MobileHomePage;
import com.salmon.test.page_objects.mobile.MobilePDPPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.validation.constraints.AssertTrue;
import java.util.List;

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
        //mobileHomePage.getCategory().click();
        mobileHomePage.clickCategory(category);
    }

    @When("^I search the procust \"([^\"]*)\"$")
    public void i_search_the_procust(String productname) throws Exception {
        mobileHomePage.clickSearchedProduct(productname);
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
        //mobileHomePage.clickSize("M");
        mobilePDPPage.selectColourOrSizeSwatch(size);
        Thread.sleep(2500);
    }

    @When("^enter quantity as \"([^\"]*)\"$")
    public void enter_quantity_as(String quantity)throws Exception{
//        Thread.sleep(5000);
        //mobilePDPPage.getQuantity().clear();
        mobilePDPPage.getQuantity().sendKeys(quantity);
        System.out.println("success");
    }

    @When("^clicks on ADD TO CART button$")
    public void clicks_on_ADD_TO_CART_button() throws Exception{

        //mobilePDPPage.getAddToCartButton().click();
        mobilePDPPage.addToBag();
        System.out.println("added successfully");
    }

    @Then("^the product should be added to the cart$")
    public void the_product_should_be_added_to_the_cart() throws Exception {
        mobilePDPPage.mouseoverCart(mobilePDPPage.getCart());
       Assert.assertTrue(mobilePDPPage.checkAddedProductsInMiniBasket());
    }

    @When("^select colour as \"([^\"]*)\"$")
    public void select_colour_as(String colour) throws Exception {
        Thread.sleep(3500);
        mobilePDPPage.selectColourOrSizeSwatch(colour);
    }

}