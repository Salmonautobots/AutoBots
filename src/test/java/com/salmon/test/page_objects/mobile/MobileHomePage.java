package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.AndroidObject;
import io.appium.java_client.android.AndroidElement;
import com.salmon.test.framework.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MobileHomePage extends PageObject{

    private By category = By.cssSelector(".has-sub-menu");
    private By subCategory = By.cssSelector(".menu-vertical>li>a");
    private By womanProduct = By.cssSelector("img[alt*='Crochet Yoke Tank.']");
    private By productsize = By.cssSelector("li[class='selectable']");
    private By seardhBox = By.cssSelector("#q");
    private By productSuggestion = By.cssSelector(".product-name");
    private By searchIcon = By.cssSelector("i[class='fa fa-search']");
    private By productImage = By.cssSelector(".thumb-link>img");
    private By errorMessageComponent = By.cssSelector("div[class='section-header']");
    private By storeFinderIcon = By.cssSelector("i[class='fa fa-map-marker']");

public void clickSearchIcon(){
    waitForExpectedElement(searchIcon).click();
    //waitForExpectedElement(searchIcon,10).click();
}


    public WebElement getStoreFinderIcon(){return waitForExpectedElement(storeFinderIcon);}
    public WebElement getErrorMessageComponent(){return waitForExpectedElement(errorMessageComponent);}
    public WebElement getProductImage() {return waitForExpectedElement(productImage);}
    public WebElement getSearchIcon(){return waitForExpectedElement(searchIcon);}
    public WebElement getProductSuggestion (){return waitForExpectedElement(productSuggestion);}
    public WebElement getSearchBox (){return waitForExpectedElement(seardhBox);}
    public WebElement getCategory(){return waitForExpectedElement(category);}
    public WebElement getSubCategory(){return waitForExpectedElement(subCategory);}
    public WebElement getProductsize(){return waitForExpectedElement(productsize);}
    public WebElement getWomanProduct(){return waitForExpectedElement(womanProduct);}


    public void clickCategory(String categoryname) throws InterruptedException {

        Thread.sleep(2000);
        List<WebElement> ls = webDriver.findElements((category));
        System.out.println(ls);
        System.out.println(ls.size());
        //sys out lines should be taken out before committing the code. If you want to print something to the console use logging.

        for (WebElement ws : ls) {
            String catname = ws.getText();

            if (catname.contains(categoryname)) {
                ws.click();
                System.out.println("success");
            }
        }
    }

    public void clickSize(String size){

        List<WebElement>ls = webDriver.findElements((productsize));
        for(WebElement ws:ls){

            System.out.println(ws.getText());

            /*if(ws.getAttribute("title").contains(size)){
                ws.click();
            */}

    }

    public void clickSearchedProduct(String productname) throws InterruptedException {
        getSearchBox().sendKeys(productname);
        Thread.sleep(1500);
        getProductSuggestion().click();

    }

    public boolean checkInvalidSearchErrors(String invalidSearchCriteria){
        if (invalidSearchCriteria.isEmpty()){
                if(getErrorMessageComponent().getText().contains("WE'RE SORRY, NO PRODUCTS WERE FOUND FOR YOUR SEARCH: ENTER KEYWORD OR ITEM NO.")){
                    return true;
                }
                return false;
            }
            if (!invalidSearchCriteria.isEmpty()){

                if (getErrorMessageComponent().getText().contains("WE'RE SORRY, NO PRODUCTS WERE FOUND FOR YOUR SEARCH:")){
                    return true;
                }
                return false;
        }
        return false;
    }
}

