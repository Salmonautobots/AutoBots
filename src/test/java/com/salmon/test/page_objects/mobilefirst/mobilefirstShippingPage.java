package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import com.salmon.test.models.cucumber.AddressModel;
import gherkin.lexer.Pa;
import org.openqa.selenium.By;

import java.util.List;

public class mobilefirstShippingPage extends PageObject {

    By firstName = By.cssSelector("#shippingFirstName");
    By lastNamr = By.cssSelector("#shippingLastName");
    By address1 = By.cssSelector("#shippingAddressOne");
    By country = By.cssSelector("#shippingCountry");
    By state = By.cssSelector("#shippingState");
    By city = By.cssSelector("#shippingAddressCity");
    By zipCode = By.cssSelector("#shippingZipCode");
    By phoneNumber = By.cssSelector("#shippingPhoneNumber");
    By buttonPayment = By.cssSelector(".btn.btn-primary.btn-block.submit-shipping");


    public void enterShippingDetails(List<AddressModel>addressModels) {

        for (AddressModel addressModel : addressModels) {

            waitForExpectedElement(firstName).sendKeys(addressModel.getFirstName());
            waitForExpectedElement(lastNamr).sendKeys(addressModel.getLastName());
            waitForExpectedElement(address1).sendKeys(addressModel.getAddress1());
            waitForExpectedElement(country).sendKeys(addressModel.getCountry());
            waitForExpectedElement(state).sendKeys(addressModel.getState());
            waitForExpectedElement(city).sendKeys(addressModel.getCity());
            waitForExpectedElement(zipCode).sendKeys(addressModel.getPostCode());
            waitForExpectedElement(phoneNumber).sendKeys(addressModel.getPhone());
        }
    }

        public void clickPaymentButton(){
            waitForExpectedElement(buttonPayment).click();
        }
    }

