package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class PickAPathPage extends PageObject {
    private By userEmail = By.cssSelector("input[id*='login_username']");
    private By userPassword = By.cssSelector("input[id*='login_password']");
    private By loginButton = By.cssSelector("button[name*='login_login']");
    private By createAccountNow = By.cssSelector("button[value='Create Account']");

    public void clickCreateAccountNow(){

        waitForExpectedElement(createAccountNow).click();
    }


}
