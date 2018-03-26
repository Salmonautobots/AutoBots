package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.Props;
import org.openqa.selenium.By;

/**
 * Created by aherappa on 19/12/2017.
 */


public class WebSearchPage extends PageObject {

    //private By whatWeDo = By.cssSelector(".sibling a[href='/en/what-we-do/']");
    private By searchForm = By.cssSelector(" Header signin link css path should be defined here ");
    private By searchButton = By.name("Login element name should be defined here");
    private By passwordText = By.id("Password element id should be defined here");

    /* This method is enter search input */
    public void enterSearchInput(String productCode) {
        waitForExpectedElement(searchForm).sendKeys(productCode);
    }

    /* This method is click on search button*/
    public void clickOnSearchForm() {
        waitForExpectedElement(searchButton).click();
    }

}
