package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class StoreFinderPage extends PageObject {

    private By searchComponent = By.cssSelector("#storeSearchInput");
    private By searchButton = By.cssSelector("#postcodeSearchSubmit");
    private By addressContainer = By.cssSelector("#resultContainer>li>article>address");

    public void searchStore(String postcode) {
        waitForExpectedElement(searchComponent).sendKeys(postcode);
        waitForExpectedElement(searchButton).click();
    }

    public boolean storeResultsCheck(String postcode) throws InterruptedException {
        Thread.sleep(2000);
        waitForExpectedElement(addressContainer);
        List<WebElement> ls = webDriver.findElements(addressContainer);
        for (WebElement lst : ls) {

            if (lst.getText().toLowerCase().contains(postcode)) {
                return true;
            }
        }
        return false;
    }
}