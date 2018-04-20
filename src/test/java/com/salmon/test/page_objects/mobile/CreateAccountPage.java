package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import cucumber.api.DataTable;
import org.openqa.selenium.By;

import java.util.List;

public class CreateAccountPage extends PageObject {

    private By firstname = By.cssSelector("input[id*='customer_firstname']");
    private By lastname = By.cssSelector("input[id*='customer_lastname']");
    private By email = By.cssSelector("input[id*='customer_email']");
    private By confirmemail = By.cssSelector("input[id*='customer_emailconfirm']");
    private By password = By.cssSelector("input[id*='login_password']");
    private By confirmpassword = By.cssSelector("input[id*='login_passwordconfirm']");
    private By applyButton = By.cssSelector("button[name*='profile_confirm']");
    private By myAccountHeader = By.cssSelector("#primary>h1");

    public void registerUser(DataTable dt) {

        List<List<String>> ls = dt.raw();
        System.out.println(ls);

        waitForExpectedElement(firstname).sendKeys(ls.get(1).get(0));
        waitForExpectedElement(lastname).sendKeys(ls.get(1).get(1));
        String emailadd = RandomGenerator.randomEmailAddress(20);
        waitForExpectedElement(email).sendKeys(emailadd);
        waitForExpectedElement(confirmemail).sendKeys(emailadd);
        waitForExpectedElement(password).sendKeys(ls.get(1).get(2));
        waitForExpectedElement(confirmpassword).sendKeys(ls.get(1).get(2));
        waitForExpectedElement(applyButton).click();
    }

    public boolean myAccountNavigate() {

        if (waitForExpectedElement(myAccountHeader).isDisplayed()) {
            return true;
        }
        return false;
    }

}