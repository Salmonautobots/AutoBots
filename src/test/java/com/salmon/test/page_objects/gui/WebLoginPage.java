package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.Props;
import org.openqa.selenium.By;

/**
 * Created by aherappa on 07/12/2017.
 */

public class WebLoginPage extends PageObject {

    //private By whatWeDo = By.cssSelector(".sibling a[href='/en/what-we-do/']");
    private By headerSignInLInk = By.cssSelector(" Header signin link css path should be defined here ");
    private By loginIdText = By.name("Login element name should be defined here");
    private By passwordText = By.id("Password element id should be defined here");
    private By signInButton = By.xpath("SignIn button element xpath path should be defined");
    private By welcomeText = By.linkText("Welcome text Link text path should be defined here");


    /* This method to click on Signin Link on Header*/
    public void clickOnSignInHeaderLink() {
        waitForExpectedElement(headerSignInLInk).click();
    }


    /* This method to enter valid username to username field*/
    /* "username" variable should be defined variable in Message property file,
         good practice not hardcode text in method*/
    public void enterValidUsername() {
        waitForExpectedElementToClear(loginIdText).sendKeys(Props.getMessage("username"));
    }

    /* This method to enter valid password to password field*/
    /* "password" variable should be defined variable in Message property file,
         good practice not hardcode text in method*/
    public void enterValidPassword() {
        waitForExpectedElementToClear(passwordText).sendKeys(Props.getMessage("password"));
    }

    /* This method to click on SignIn Button on login page*/
    public void clickOnSignInButton() {
        waitForExpectedElement(signInButton).click();
    }

    /* This method  will allow user to login in one method on login Page*/
    public void defaultLogin() {
        waitForExpectedElementToClear(loginIdText).sendKeys(Props.getMessage("username"));
        waitForExpectedElementToClear(passwordText).sendKeys(Props.getMessage("password"));
        waitForExpectedElement(signInButton).click();
    }

    /* This method is to get welcome message text after sign in*/
    public String getWelcomeMessageText() {
        return waitForExpectedElement(welcomeText).getText();
    }


}
