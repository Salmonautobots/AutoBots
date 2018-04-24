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
    private By password = By.cssSelector("input[id*='login_password']");
    private By returningUserEmail = By.cssSelector("input[id*='login_username']");
    private By returningUserPassword = By.cssSelector("input[id*='login_password']");
    private By loginButton = By.cssSelector("button[name*='login_login']");
    private By myAccountHeader = By.cssSelector("#primary>h1");

    String newsurname;

    public void loginWithExistingUser() {
        waitForExpectedElement(returningUserEmail).sendKeys(Props.getProp("existingusername"));
        waitForExpectedElement(returningUserPassword).sendKeys(Props.getProp("existingpassword"));
        waitForExpectedElement(loginButton).click();
    }

    public void selectSection(String section) {

        List<WebElement> ls = webDriver.findElements(myAccountAllSections);
        for (WebElement ws : ls) {
            if (ws.getText().contains(section)) {
                ws.click();
                break;
            }
        }
    }

    public void changeSurname() {

        String randomlastname = RandomGenerator.randomAlphabetic(6);
        newsurname = randomlastname;
        waitForExpectedElement(lastname).sendKeys(randomlastname);
        waitForExpectedElement(confirmemail).sendKeys(Props.getProp("existingusername"));
        waitForExpectedElement(password).sendKeys(Props.getProp("existingpassword"));
        waitForExpectedElement(applyButton).click();
    }

    public boolean confirmSurnameUpdate() {
        if (waitForExpectedElement(myAccountHeader).getText().contains(newsurname)) {
            return true;
        }
        return false;
    }
}
