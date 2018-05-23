package com.salmon.test.page_objects.DomesticAndGeneral;Indians In London (IIL - Orkut )

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class dgHomePage extends PageObject {

    private By email = By.cssSelector("#newsletterEmail");
    private By signUpButton = By.cssSelector("#newsletterForm>button");
    private By successMessage = By.cssSelector("#newsletterMessage");

    public void enterEmail(String emailaddress){
        waitForExpectedElement(email).sendKeys(emailaddress);
    }

    public void clickSignUp(){
        waitForExpectedElement(signUpButton).click();
    }

    public String successMessage(){
        return waitForExpectedElement(successMessage).getText();
    }
}
