package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import com.salmon.test.models.cucumber.CreditCardModel;
import org.openqa.selenium.By;

import java.util.List;

public class mobilefirstPaymentPage extends PageObject {
    private By cardNumber = By.cssSelector("#cardNumber");
    private By expirationMonth = By.cssSelector("#expirationMonth");
    private By expirationYear = By.cssSelector("#expirationYear");
    private By securityCode = By.cssSelector("#securityCode");
    private By email = By.cssSelector("#email");
    private By phoneNumber = By.cssSelector("#phoneNumber");
    private By buttonPlaceOrder = By.cssSelector(".btn.btn-primary.btn-block.submit-payment");

    public void enterPaymentDetails(List<CreditCardModel>creditCardModels){

        for (CreditCardModel creditCardModel:creditCardModels){

            waitForExpectedElement(cardNumber).sendKeys(creditCardModel.getNumber());
            waitForExpectedElement(expirationMonth).sendKeys(creditCardModel.getExpiryMonth());
            waitForExpectedElement(expirationYear).sendKeys(creditCardModel.getExpiryYear());
            waitForExpectedElement(securityCode).sendKeys(creditCardModel.getSecurityCode());
            waitForExpectedElement(email).sendKeys(creditCardModel.getEmail());
            waitForExpectedElement(phoneNumber).sendKeys(creditCardModel.getNumber());
        }

    }

    public void clickPlaceOrder(){
        waitForExpectedElement(buttonPlaceOrder).click();

    }

}
