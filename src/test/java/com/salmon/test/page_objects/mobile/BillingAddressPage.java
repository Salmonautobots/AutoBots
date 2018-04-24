package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BillingAddressPage extends PageObject {

    private By selectCreditCard = By.cssSelector("#creditCardList");
    private By nameOnCard = By.cssSelector("input[id*='Card_owner']");
    private By type = By.cssSelector("select[id*='Card_type']");
    private By cardNumber = By.cssSelector("input[id*='Card_number']");
    private By cardExpirationMonth = By.cssSelector("select[id*='expiration_month']");
    private By cardExpirationYear = By.cssSelector("select[id*='expiration_year']");
    private By cardSecurityCode = By.cssSelector("input[id*='cvn']");
    private By continueToPlaceOrderButton = By.cssSelector(".button-fancy-large");

    public void selectCreditCard() throws InterruptedException {
        Thread.sleep(3500);
      List<WebElement>list = webDriver.findElement(selectCreditCard).findElements(By.tagName("option"));

        for(WebElement ls:list){
            if (ls.getText().contains("Visa")){
                ls.click();
                Thread.sleep(2500);
                break;
            }

        }

    }

    public void enterCreditCardDetails(DataTable dt){

        List<List<String>> ls = dt.raw();
        waitForExpectedElement(nameOnCard).sendKeys(ls.get(1).get(0));
        waitForExpectedElement(type).sendKeys(ls.get(1).get(1));
        waitForExpectedElement(cardNumber).sendKeys(ls.get(1).get(2));
        waitForExpectedElement(cardExpirationMonth).sendKeys(ls.get(1).get(3));
        waitForExpectedElement(cardExpirationYear).sendKeys(ls.get(1).get(4));
        waitForExpectedElement(cardSecurityCode).sendKeys(ls.get(1).get(5));
        waitForExpectedElement(continueToPlaceOrderButton).click();

    }

    public void clickPlaceOrder() throws InterruptedException {

        Thread.sleep(2500);
        waitForExpectedElement(continueToPlaceOrderButton).click();
    }

}