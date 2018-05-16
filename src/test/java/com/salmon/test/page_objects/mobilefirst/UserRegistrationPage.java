package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class UserRegistrationPage extends PageObject {

    private By firstName = By.cssSelector("#registration-form-fname");
    private By lastName = By.cssSelector("#registration-form-lname");
    private By phone = By.cssSelector("#registration-form-phone");
    private By email = By.cssSelector("#registration-form-email");
    private By confirmEmail = By.cssSelector("#registration-form-email-confirm");
    private By password = By.cssSelector("#registration-form-password");
    private By confirmPassword = By.cssSelector("#registration-form-password-confirm");
    private By createAccount = By.cssSelector("#registration-form-password-confirm");

}
