package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by aherappa on 19/12/2017.
 */

public class WebProductDeatilsPage extends PageObject {

    //private By whatWeDo = By.cssSelector(".sibling a[href='/en/what-we-do/']");
    private By productName = By.cssSelector(" css path should be defined here ");
    private By productPrice = By.name("element name should be defined here");
    private By addToCart = By.id(" element id should be defined here");
    private By addedItemMessage = By.xpath("element xpath path should be defined");
    private By miniBasketCount = By.linkText("Link text path should be defined here");


    /*Product name is displayed */
    public boolean isProductNameDisplayed() {
        return waitForExpectedElement(productName).isDisplayed();
    }

    /*  To get the ProductName from PDP*/
    public String getProductName() {
        return waitForExpectedElement(productName).getText();
    }

    /*Product Price is displayed */
    public boolean isProductPriceDisplayed() {
        return waitForExpectedElement(productPrice).isDisplayed();
    }

    /*  To get the ProductPrice from PDP*/
    public String getProductPrice() {
        return waitForExpectedElement(productPrice).getText();
    }

    /* Add to cart button is displayed */
    public boolean isAddToCartButtonDisplayed() {
        return waitForExpectedElement(addToCart).isDisplayed();
    }

    /* Click on Add to cart button function */
    public void clickOnAddToCartButton() {
        waitForExpectedElement(addToCart).click();
    }

    /*  To get the Added item to cart success message from PDP*/
    public String getAddedItemMessage() {
        return waitForExpectedElement(addedItemMessage).getText();
    }

    /*  To get the count of items from mini cart */
    public String getMiniBasketCount() {
        return waitForExpectedElement(miniBasketCount).getText();
    }
}


