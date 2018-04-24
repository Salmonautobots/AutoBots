package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class FullCartPage extends PageObject {

    private By checkoutButton = By.cssSelector(".button-fancy-large");

    public void clickCheckoutButton(){
        waitForExpectedElement(checkoutButton).click();
    }
}
