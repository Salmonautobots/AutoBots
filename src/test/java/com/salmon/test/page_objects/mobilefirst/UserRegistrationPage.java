package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import com.salmon.test.models.cucumber.RegistrationModel;
import org.openqa.selenium.By;

import java.util.List;

public class UserRegistrationPage extends PageObject {

    private By firstName = By.cssSelector("#registration-form-fname");
    private By lastName = By.cssSelector("#registration-form-lname");
    private By phone = By.cssSelector("#registration-form-phone");
    private By email = By.cssSelector("#registration-form-email");
    private By confirmEmail = By.cssSelector("#registration-form-email-confirm");
    private By password = By.cssSelector("#registration-form-password");
    private By confirmPassword = By.cssSelector("#registration-form-password-confirm");
    private By createAccount = By.xpath(".//*[@class='btn btn-block btn-primary'][contains(text(),'Create Account')]");


    public void userRegistration(List<RegistrationModel> userdata) {

        for (RegistrationModel register : userdata) {

            waitForExpectedElement(firstName).sendKeys(register.getFirstName());
            waitForExpectedElement(lastName).sendKeys(register.getLastName());
            waitForExpectedElement(phone).sendKeys(register.getMobileNumber());
            String emailRandom = RandomGenerator.randomEmailAddress(10).toLowerCase();
            waitForExpectedElement(email).sendKeys(emailRandom);
            waitForExpectedElement(confirmEmail).sendKeys(emailRandom);
            waitForExpectedElement(password).sendKeys(register.getPassword());
            waitForExpectedElement(confirmPassword).sendKeys(register.getPassword());

            waitForExpectedElement(createAccount).click();
        }

    }
}
