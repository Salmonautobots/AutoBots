package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.Props;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountsPage extends PageObject {

    private By personalDetailsIcon = By.cssSelector(".fa.fa-user");
    private By myAccountAllSections = By.cssSelector(".account-options>li>a");
    private By firstname = By.cssSelector("input[id*='customer_firstname']");
    private By lastname = By.cssSelector("input[id*='customer_lastname']");
    private By email = By.cssSelector("input[id*='customer_email']");
    private By confirmemail = By.cssSelector("input[id*='customer_emailconfirm']");
    private By applyButton = By.cssSelector("button[name*='profile_confirm']");
    private By password =  By.cssSelector("input[id*='login_password']");
    private By returningUserEmail = By.cssSelector("input[id*='login_username']");
    private By returningUserPassword = By.cssSelector("input[id*='login_password']");
    private By loginButton = By.cssSelector("button[name*='login_login']");
    private By myAccountHeader = By.cssSelector("#primary>h1");

    String newsurname;

    public void loginWithExistingUser(){
/*
        String username = Props.getProp("existingusername");
        String password = Props.getProp("existingpassword");
*/

        //waitForExpectedElement(returningUserEmail).sendKeys(Props.getProp("existingusername"));
        //waitForExpectedElement(returningUserPassword).sendKeys(Props.getProp("existingpassword"));
        waitForExpectedElement(returningUserEmail).sendKeys("ydeo@salmon.com");
        waitForExpectedElement(returningUserPassword).sendKeys("Salmon$123");
        waitForExpectedElement(loginButton).click();
    }

    public void selectSection(String section){

        List<WebElement> ls = webDriver.findElements(myAccountAllSections);
        for(WebElement ws:ls){
                if(ws.getText().contains(section)){
                ws.click();
                break;
            }
        }
    }

    public void changeSurname(){

        String rn =  RandomGenerator.randomAlphabetic(6);
        newsurname = rn;
        waitForExpectedElement(lastname).sendKeys(rn);
        waitForExpectedElement(confirmemail).sendKeys("ydeo@salmon.com");
        waitForExpectedElement(password).sendKeys("Salmon$123");
        waitForExpectedElement(applyButton).click();
    }

    public boolean confirmSurnameUpdate (){
        if (waitForExpectedElement(myAccountHeader).getText().contains(newsurname)){
            return true;
        }
        return false;
    }
}
