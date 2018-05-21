package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class mobilefirstCartPage extends PageObject {

    private By productName = By.cssSelector(".line-item-name");
    private By buttonCheckout = By.cssSelector(".btn.btn-primary.btn-block.checkout-btn");


    public String checkProductName(){
        return waitForExpectedElement(productName).getText();
    }

    public void clickCheckOut(){
        waitForExpectedElement(buttonCheckout).click();
    }


}
