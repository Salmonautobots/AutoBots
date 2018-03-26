package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

/**
 * Created by aherappa on 19/12/2017.
 */

public class WebHomePage extends PageObject {


    //private By whatWeDo = By.cssSelector(".sibling a[href='/en/what-we-do/']");
    private By newsLetterEmail = By.cssSelector(" Header signin link css path should be defined here ");
    private By newsSignUpButton = By.name("Login element name should be defined here");
    private By newsLetterThankYou = By.id("Password element id should be defined here");


    /* This method to enter email address which is mentioned in scenario to the newsletter email field */
    public void enterNewsLetterEmailID(String emailId) {
        waitForExpectedElement(newsLetterEmail).sendKeys(emailId);
    }

    /* This method to click on news letter signup Button on page*/
    public void clickNewsSignUpButton() {
        waitForExpectedElement(newsSignUpButton).click();
    }

    /* This method to get the message from newsletter section*/
    public String getNewsLetterThankYouMessage() {
        return waitForExpectedElement(newsLetterThankYou).getText();
    }


}
