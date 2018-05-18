package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class mobilefirstPLPPage extends PageObject {

    String appliedCriteria;
    String filterHead;

    private By searchRerults = By.cssSelector("div[class='pdp-link']");
    private By searchRerultString = By.cssSelector(".result-count.text-center.col-12.col-md-9.col-sm-6.order-sm-2>span");
    private By priceFilter = By.cssSelector("div[class='pdp-link']");
    private By buttonFilter = By.cssSelector(".btn.btn-primary.filter-results.col-12");
    private By filterCriteria = By.cssSelector(".col-sm-4.col-md-12>a>span");
    private By buttonClose = By.cssSelector(".pull-right.close");
    private By appliedFilter = By.cssSelector(".filter-value>a");
    private By selectFilterHeader = By.cssSelector(".card-header");

    public void clickButtonFilter() throws InterruptedException {
        waitForExpectedElement(buttonFilter).click();
        Thread.sleep(2500);
    }

    public void close() {
        waitForExpectedElement(buttonClose).click();
    }

    public void applyFilter(String filterHead, String appliedCriteria) throws InterruptedException {

        this.filterHead = filterHead;
        this.appliedCriteria = appliedCriteria;

        waitForExpectedElement(selectFilterHeader);
        List<WebElement> ls = webDriver.findElements(selectFilterHeader);
        for (WebElement ws : ls) {
            if (ws.getText().contains(filterHead)) {
                ws.click();
                break;
            }
        }

        waitForExpectedElement(filterCriteria);
        List<WebElement> filterString = webDriver.findElements(filterCriteria);
        for (WebElement filter : filterString) {
            if (filter.getText().contains(appliedCriteria)) {
                filter.click();
                System.out.println("clicked");
            }

        }
        System.out.println("all done");
    }

    public String checkAppliedFilter() {
        return waitForExpectedElement(appliedFilter).getText();
    }

    public String filterResults() {
        return waitForExpectedElement(searchRerultString).getText();
    }
}