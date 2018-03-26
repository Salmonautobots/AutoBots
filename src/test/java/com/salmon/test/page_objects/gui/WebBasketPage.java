package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by aherappa on 21/12/2017.
 */
public class WebBasketPage extends PageObject {

    //private By whatWeDo = By.cssSelector(".sibling a[href='/en/what-we-do/']");
    private By miniBasketIcon=By.cssSelector(" Header signin link css path should be defined here ");
    private By basketProductName = By.name("Login element name should be defined here");
    private By basketProductPrice = By.id("Password element id should be defined here");
    private By basketCheckoutBtn = By.name("Login element name should be defined here");
    private By basketContinueShoppingBtn = By.id("Password element id should be defined here");
    private By basketItemRemoveIcon = By.id("Password element id should be defined here");


    /* This method to click on mini basket icon on Header*/
    public void clickOnMiniBasketIconHeader()
    {
        waitForExpectedElement(miniBasketIcon).click();
    }

    /* This method to get the product name from the basket*/
    public String getBasketProductName()
    {
        return waitForExpectedElement(basketProductName).getText();
    }

    /* This method to get the product price from the basket*/
    public String getBasketProductPrice()
    {
        return waitForExpectedElement(basketProductPrice).getText();
    }

    /* This method to see Checkout button is displayed*/
    public boolean isCheckoutBtnDisplayed()
    {
        return waitForExpectedElement(basketCheckoutBtn).isDisplayed();
    }

    /* This method to see continue shopping button is displayed*/
    public boolean isContinueShoppingBtnDisplayed()
    {
        return waitForExpectedElement(basketContinueShoppingBtn).isDisplayed();
    }

    /* This method for clicking on Checkout button on basket*/
    public boolean clickOnCheckoutBtn()
    {
        return waitForExpectedElement(basketCheckoutBtn).isDisplayed();
    }



    public void checkEmptyBasketDisplayed(){
        if(isElementPresent(basketItemRemoveIcon)){
            waitForExpectedElement(basketItemRemoveIcon).click();
        }
    }

}
