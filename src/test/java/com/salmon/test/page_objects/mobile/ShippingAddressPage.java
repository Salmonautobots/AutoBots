package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import com.salmon.test.models.cucumber.AddressModel;
import org.openqa.selenium.By;



public class ShippingAddressPage extends PageObject {

    private By selectAddressType = By.cssSelector("select[id*='singleshipping_addressList']");
    private By useThisAddressForBilingCheckBox = By.cssSelector("input[id*='singleshipping_shippingAddress_useAsBillingAddress']");
    private By continueToBillingButton = By.cssSelector(".button-fancy-large");
    private By selectMainAddress = By.cssSelector("option[value = 'Main Address']");
    private By address1 = By.cssSelector("input[id*='address1']");
    private By city = By.cssSelector("input[id*='city']");
    private By postcode = By.cssSelector("input[id*='postal']");
    private By phone = By.cssSelector("input[id*='phone']");
    private By firstname = By.cssSelector("input[id*='firstName']");
    private By lastname = By.cssSelector("input[id*='lastName']");

    public void setSelectAddressType() {
        waitForExpectedElement(selectMainAddress).click();
    }

    public void selectContinueToBillingButton() {
        waitForExpectedElement(continueToBillingButton).click();
    }

    public void checkUseThisAddressForBilingCheckBox() {
        waitForExpectedElement(useThisAddressForBilingCheckBox).click();
    }

    public void enterDataModelNewUserDetails(AddressModel addressModel) {

        waitForExpectedElement(firstname).sendKeys(addressModel.getFirstName());
        waitForExpectedElement(lastname).sendKeys(addressModel.getLastName());
        waitForExpectedElement(address1).sendKeys(addressModel.getAddress1());
        waitForExpectedElement(city).sendKeys(addressModel.getCity());
        waitForExpectedElement(postcode).sendKeys(addressModel.getPostCode());
        waitForExpectedElement(phone).sendKeys(addressModel.getPhone());
    }

}