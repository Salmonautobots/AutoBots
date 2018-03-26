package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.Props;
import com.salmon.test.models.cucumber.CardDeatilsModel;
import org.openqa.selenium.By;

/**
 * Created by aherappa on 08/01/2018.
 */

public class WebCheckoutPage extends PageObject {

    //private By whatWeDo = By.cssSelector(".sibling a[href='/en/what-we-do/']");
    private By enterAddress = By.cssSelector(" Header signin link css path should be defined here ");
    private By continueCheckoutBtn = By.name("Login element name should be defined here");
    private By cardPayment = By.id("Password element id should be defined here");
    private By cardNumber = By.id("Password element id should be defined here");
    private By cardExpiryMonth = By.id("Password element id should be defined here");
    private By cardExpiryYear = By.id("Password element id should be defined here");
    private By cvvNumber = By.id("Password element id should be defined here");
    private By continuePayment = By.id("Password element id should be defined here");
    private By placeOrderBtn = By.id("Password element id should be defined here");

    public void enterDeliveryAddressField() {
        waitForExpectedElementToClear(enterAddress).sendKeys(Props.getMessage("Address1"));
    }

    public void clickOnContinueCheckoutBtn() {
        waitForExpectedElement(continueCheckoutBtn).click();
    }

    public void selectTheCardTypeAsPayment() {
        waitForExpectedElement(cardPayment).click();
    }

    public void enterCardDeatils(CardDeatilsModel cardDetail) {
        waitForExpectedElement(cardNumber).sendKeys(cardDetail.getCardNumber());
        waitForExpectedElement(cardExpiryMonth).sendKeys(cardDetail.getExpiryMonth());
        waitForExpectedElement(cardExpiryYear).sendKeys(cardDetail.getExpiryYear());
        waitForExpectedElement(cvvNumber).sendKeys(cardDetail.getCvv());
    }

    public void clickOnContinuePaymentBtn() {
        waitForExpectedElement(continuePayment).click();
    }

    public void clickOnPlaceOrderBtnOnReviewPage() {
        waitForExpectedElement(placeOrderBtn).click();
    }
}
