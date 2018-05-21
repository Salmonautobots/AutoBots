package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class mobilefirstPickAPathPage extends PageObject {

    private By email = By.cssSelector("#login-form-email");
    private By password = By.cssSelector("#login-form-password");
    private By buttonRegisteredLogin = By.cssSelector("button[class='btn btn-block btn-primary']");
    private By buttonCheckoutAsGuest = By.cssSelector("a[class='btn btn-block btn-primary checkout-as-guest']");


    public void clickButtonCheckOutAsGuest(){
        waitForExpectedElement(buttonCheckoutAsGuest).click();
    }

}
