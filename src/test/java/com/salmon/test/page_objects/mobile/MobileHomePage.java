package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import com.salmon.test.framework.helpers.Props;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MobileHomePage extends PageObject{

    private By section = By.cssSelector(".has-sub-menu");
    private By category = By.cssSelector(".menu-vertical>li>a");
    private By subCategory = By.cssSelector(".menu-vertical>li>a");
    private By productsize = By.cssSelector("li[class='selectable']");
    private By searchBox = By.cssSelector("#q");
    private By productSuggestion = By.cssSelector(".product-name");
    private By searchIcon = By.cssSelector("i[class='fa fa-search']");
    private By productImage = By.cssSelector(".thumb-link>img");
    private By errorMessageComponent = By.cssSelector("div[class='section-header']");
    private By storeFinderIcon = By.cssSelector("i[class='fa fa-map-marker']");
    private By toggleMenu = By.cssSelector(".menu-toggle");
    private By registrationlink = By.cssSelector("a[title='Go to: Register']");
    private By arrowIcon = By.cssSelector("i[class='menu-item-toggle fa fa-chevron-right']");
    private By loginlink = By.cssSelector("a[title='Go to: Login']");


    public void clickUserRegistrationLink(){
        waitForExpectedElement(registrationlink).click();
    }

    public void clickLoginLink(){waitForExpectedElement(loginlink).click();}

     public void searchString(String searchCriteria){
        waitForExpectedElement(searchBox).sendKeys(searchCriteria);
        waitForExpectedElement(searchIcon).click();
    }

    public boolean checkProductImage(){
        if(waitForExpectedElement(productImage).isDisplayed()){
            return true;
        }
        return false;
    }

    public void clickStoreFinderIcon(){
        waitForExpectedElement(storeFinderIcon).click();
    }

    public void clickSectionArrow(String section) throws InterruptedException {
        List<WebElement> ls = webDriver.findElements((this.section));
        for (WebElement ws : ls) {
            String catname = ws.getText();
            if (catname.contains(section)) {
                ws.click();
                break;
            }
        }
    }

    public void clickCategory(String categoryname) throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> ls = webDriver.findElements((category));
        for (WebElement ws : ls) {
            String catname = ws.getText();
            System.out.println(ws.getText());
            if (catname.contains(categoryname)) {
                ws.click();
            }
        }
    }

    public void clickSize(String size){
        List<WebElement>ls = webDriver.findElements((productsize));
        for(WebElement ws:ls){
        }

    }

    public void clickSearchedProduct(String productname) throws InterruptedException {
        waitForExpectedElement(searchBox).sendKeys(productname);
        waitForExpectedElement(productSuggestion,20).click();
    }

    public boolean checkInvalidSearchErrors(String invalidSearchCriteria){
        if (invalidSearchCriteria.isEmpty()){
                if(waitForExpectedElement(errorMessageComponent).getText().contains("WE'RE SORRY, NO PRODUCTS WERE FOUND FOR YOUR SEARCH: ENTER KEYWORD OR ITEM NO.")){
                    return true;
                }
                return false;
            }
            if (!invalidSearchCriteria.isEmpty()){

                if (waitForExpectedElement(errorMessageComponent).getText().contains("WE'RE SORRY, NO PRODUCTS WERE FOUND FOR YOUR SEARCH:")){
                    return true;
                }
                return false;
        }
        return false;
    }

    public void clickToggleMenuClick(){
        waitForExpectedElement(toggleMenu).click();
    }
}