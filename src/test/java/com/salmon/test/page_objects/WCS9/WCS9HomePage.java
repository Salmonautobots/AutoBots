package com.salmon.test.page_objects.WCS9;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class WCS9HomePage extends PageObject {

    String searchCriteria;

    private By search = By.cssSelector("#searchTermWrapper");
    private By searchButton = By.cssSelector(".submitButton");
    private By searchResults = By.cssSelector("a[id*='WC_CatalogEntryDBThumbnailDisplay']");

    public void search(String searchCriteria) throws InterruptedException {

        this.searchCriteria = searchCriteria;
        System.out.println(waitForExpectedElement(search).isDisplayed());
        System.out.println(waitForExpectedElement(search).isEnabled());
        waitForExpectedElement(search).click();
        System.out.println("yash success");
        Thread.sleep(2500);
       //waitForExpectedElement(search).sendKeys(searchCriteria);

        Actions actions = new Actions(webDriver);
        actions.moveToElement(waitForExpectedElement(search)).click();
        actions.sendKeys(searchCriteria);
        actions.click(waitForExpectedElement(searchButton));
        actions.build().perform();
        /*

        waitForExpectedElement(searchButton).click();
        waitForExpectedElement(searchResults);*/
    }


    public boolean validSearch(){

        List<WebElement>searchresult =webDriver.findElements(searchResults);
        for (WebElement result:searchresult){
            if (result.getText().contains(searchCriteria)){
                return true;
            }

        }
        return false;
    }
}
