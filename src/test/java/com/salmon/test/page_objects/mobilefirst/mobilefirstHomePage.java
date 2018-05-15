package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class mobilefirstHomePage extends PageObject {

    public String searchcriteria;

    private By search = By.cssSelector("div[class='search-mobile d-sm-none']");
    private By confirmButton = By.cssSelector(".affirm.btn.btn-primary");
    private By consentWIndow = By.cssSelector("div[class='modal-header']");
    private By menuOption = By.cssSelector("button[class='navbar-toggler d-md-none']");
    private By searchResult = By.cssSelector("a[class='link']");
    private By container = By.cssSelector("nav[role='navigation']");
    private By errormessage = By.cssSelector(".result-count.col>span");
    private By searchKeywords = By.cssSelector(".search-keywords");

    public void confirmConsentWindow() throws InterruptedException {
        webDriver.switchTo().defaultContent();
        waitForExpectedElement(confirmButton).click();
        Thread.sleep(2000);
    }

    public void clickMenuOption() {
        waitForExpectedElement(menuOption).click();
    }

    public void search(String searchcriteria) throws InterruptedException, AWTException {
        this.searchcriteria = searchcriteria;
        waitForExpectedElement(search).click();
        waitForExpectedElement(search).sendKeys(searchcriteria);
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }

    public boolean getSearchResults() {
        waitForExpectedElement(searchResult);
        List<WebElement> productList = webDriver.findElements(searchResult);

        for (WebElement ls : productList) {

            if (ls.getText().contains(searchcriteria)) {
                return true;
            }
        }
        return false;
    }

    public String message() {

        waitForExpectedElement(errormessage);
        String generatedMessage = waitForExpectedElement(errormessage).getText()+waitForExpectedElement(searchKeywords).getText();
        System.out.println("the message is "+generatedMessage);
        return generatedMessage;
    }
}