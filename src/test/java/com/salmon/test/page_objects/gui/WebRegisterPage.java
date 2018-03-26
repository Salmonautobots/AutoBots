package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.Props;
import com.salmon.test.models.cucumber.RegistrationModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.salmon.test.framework.helpers.utils.RandomGenerator.randomEmailAddress;

/**
 * Created by aherappa on 13/12/2017.
 */

public class WebRegisterPage extends PageObject {

    private By createAccountButton = By.cssSelector(" Header signin link css path should be defined here ");
    private By title = By.name("Login element name should be defined here");
    private By firstName = By.id("Password element id should be defined here");
    private By lastName = By.xpath("SignIn button element xpath path should be defined");
    private By emailAddress = By.linkText("Welcome text Link text path should be defined here");
    private By password = By.id("Password element id should be defined here");
    private By confirmPassword = By.xpath("SignIn button element xpath path should be defined");
    private By mobileNumber = By.linkText("Welcome text Link text path should be defined here");
    private By registerBtn = By.linkText("Welcome text Link text path should be defined here");
    private By registerSuccessMsg = By.linkText("Welcome text Link text path should be defined here");
    private By newsLetterEmail = By.cssSelector("Welcome text Link text path should be defined here");
    private By newsSignUpButton = By.cssSelector("Welcome text Link text path should be defined here");
    private By newsLetterThankYou = By.cssSelector("Welcome text Link text path should be defined here");
    private By errorFirstName = By.cssSelector("Welcome text Link text path should be defined here");
    private By errorLastName = By.cssSelector("Welcome text Link text path should be defined here");
    private By errorTitle = By.cssSelector("Welcome text Link text path should be defined here");
    private By errorMobileNo = By.cssSelector("Welcome text Link text path should be defined here");
    private By errorPassword = By.cssSelector("Welcome text Link text path should be defined here");
    private By errorConfirmPassword = By.cssSelector("Welcome text Link text path should be defined here");
    private By errorEmail = By.cssSelector("Welcome text Link text path should be defined here");
    private By termsAndConditionsCheckBox = By.cssSelector("path should be defined here");
    private By confirmEmailText = By.cssSelector("path should be defined here");
    private By birthDay = By.cssSelector("path should be defined here");


    /* This method to click on Create Account Button*/
    public void clickOnCreateAccountBtn() {
        waitForExpectedElement(createAccountButton).click();
    }


    /* This method will be used to get the data from RegistrationModel class*/
    public void enterRegistrationDeatilsMandatory(RegistrationModel registration) {
        waitForExpectedElement(title).sendKeys(registration.getTitle());
        waitForExpectedElement(firstName).sendKeys(registration.getFirstName());
        waitForExpectedElement(lastName).sendKeys(registration.getLastName());
        waitForExpectedElement(password).sendKeys(registration.getPassword());
        waitForExpectedElement(confirmPassword).sendKeys(registration.getConfirmPassword());
        waitForExpectedElement(mobileNumber).sendKeys(registration.getMobileNumber());
        waitForExpectedElement(emailAddress).sendKeys(randomEmailAddress(6));
        waitForExpectedElement(registerBtn).click();
    }

    /* This method will be used to get the error message from each text field on registration page*/
    public String getAppropriateErrorMessage(String fieldName) {
        String fieldErrorText;
        switch (fieldName) {
            case "title":
                fieldErrorText = waitForExpectedElement(errorTitle).getText();
                break;
            case "firstName":
                fieldErrorText = waitForExpectedElement(errorFirstName).getText();
                break;
            case "lastName":
                fieldErrorText = waitForExpectedElement(errorLastName).getText();
                break;
            case "emailAddress":
                fieldErrorText = waitForExpectedElement(errorEmail).getText();
                break;
            case "password":
                fieldErrorText = waitForExpectedElement(errorPassword).getText();
                break;
            case "confirmPassword":
                fieldErrorText = waitForExpectedElement(errorConfirmPassword).getText();
                break;
            default:
                fieldErrorText = waitForExpectedElement(errorMobileNo).getText();
        }
        return fieldErrorText;
    }


    /* This method will be used to get the data from MESSAGE PROPERTY to enter in registartion form*/
    public void enterRegistrationDeatils() {
        Select dropDown = new Select(waitForExpectedElement(title));
        dropDown.selectByVisibleText("Mrs");
        waitForExpectedElement(firstName).sendKeys(Props.getMessage(""));
        waitForExpectedElement(lastName).sendKeys(Props.getMessage(""));
        waitForExpectedElement(password).sendKeys(Props.getMessage(""));
        waitForExpectedElement(confirmPassword).sendKeys(Props.getMessage(""));
        waitForExpectedElement(mobileNumber).sendKeys(Props.getMessage(""));
        waitForExpectedElement(emailAddress).sendKeys(randomEmailAddress(6));
    }


    /* This method to click on Register Button on registration page*/
    public void clickOnRegisterButton() {
        waitForExpectedElement(registerBtn).click();
    }

    /* This method is to get Registration message text after sign up*/
    public String getRegisterSuccessMessage() {
        return waitForExpectedElement(registerSuccessMsg).getText();
    }

    /* This method is to enter email addresses to the email field and here email id is defined in the scenario*/
    public void enterNewsLetterEmailID(String emailId) {
        waitForExpectedElement(newsLetterEmail).sendKeys(emailId);
    }


    //Other methods
    public void acceptTermsAndConditions(boolean yesOrNo) {
        WebElement termsAndConditionsWebElement = getWebDriver().findElement(termsAndConditionsCheckBox);
        boolean selected = termsAndConditionsWebElement.isSelected();
        if (yesOrNo && !selected) {
            termsAndConditionsWebElement.click();
        } else if (!yesOrNo && selected) {
            termsAndConditionsWebElement.click();
        }
    }


    public WebElement confirmEmailAddressText() {
        return getWebDriver().findElement(confirmEmailText);
    }


    public Select birthDayText() {
        return new Select(waitForExpectedElement(birthDay));
    }
}
