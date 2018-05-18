package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.Props;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class mobilefirstMyAccountPage extends PageObject {

    String lastname;

    private By vontainerProfile = By.cssSelector("");
    //private By editLink = By.cssSelector(".//a[contains(text(),'Edit')]");
    private By editLink = By.cssSelector("a[href='/s/MobileFirst/profile?lang=en_US']");
    private By firstName = By.cssSelector("#firstName");
    private By lasttName = By.cssSelector("#lastName");
    private By confirmEmail = By.cssSelector("#confirmEmail");
    private By password = By.cssSelector("#password");
    private By saveButton = By.cssSelector(".btn.btn-save.btn-block.btn-primary");
    private By textProfile = By.xpath("//*[contains(text(),'Profile')]");
    private By profileLastName = By.xpath(".//*[@id='ext-gen45']/body/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/dl[2]/dd");

    public WebElement getTextProfile(){
        return waitForExpectedElement(textProfile);
    }

    public void clickEditLink(){
        waitForExpectedElement(editLink).click();
    }

    public void editLastName(){
        lastname = new String(RandomGenerator.randomAlphabetic(10));
        System.out.println(lastname);
        waitForExpectedElement(lasttName).clear();
        waitForExpectedElement(lasttName).sendKeys(lastname);
    }

    public void setConfirmEmail(){
        waitForExpectedElement(confirmEmail).sendKeys(Props.getProp("existingusername"));
    }

    public void setPassword(){
        waitForExpectedElement(password).sendKeys(Props.getProp("password"));
    }

    public void clickSaveButton(){
        waitForExpectedElement(saveButton).click();
    }

    public boolean confirmUpdates() {
        System.out.println("now text is" + waitForExpectedElement(profileLastName).getText());

       if(!waitForExpectedElement(profileLastName).getText().equals(lastname)){
            return false;
        }
        return true;
    }

}
