package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import cucumber.api.DataTable;
import org.openqa.selenium.By;

import java.util.List;

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

    public void setSelectAddressType(){
        waitForExpectedElement(selectMainAddress).click();
    }

    public void selectContinueToBillingButton(){
        waitForExpectedElement(continueToBillingButton).click();
    }

    public void checkUseThisAddressForBilingCheckBox(){
        waitForExpectedElement(useThisAddressForBilingCheckBox).click();
    }

    public void enterNewUserDetails(DataTable dt){

        List<List<String>> ls = dt.raw();
        waitForExpectedElement(firstname).sendKeys(ls.get(1).get(0));
        waitForExpectedElement(lastname).sendKeys(ls.get(1).get(1));
        waitForExpectedElement(address1).sendKeys(ls.get(1).get(2));
        waitForExpectedElement(city).sendKeys(ls.get(1).get(3));
        waitForExpectedElement(postcode).sendKeys(ls.get(1).get(4));
        waitForExpectedElement(phone).sendKeys(ls.get(1).get(5));

    }


}
