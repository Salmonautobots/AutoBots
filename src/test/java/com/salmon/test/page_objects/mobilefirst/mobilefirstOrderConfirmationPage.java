package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class mobilefirstOrderConfirmationPage extends PageObject {

    private By orderNumber = By.cssSelector(".summary-details.order-number");

    public String getOrderNumber(){

        return waitForExpectedElement(orderNumber).getText();
    }
}
