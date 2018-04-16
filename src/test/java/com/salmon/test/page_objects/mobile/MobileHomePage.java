package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.AndroidObject;
import io.appium.java_client.android.AndroidElement;
import com.salmon.test.framework.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MobileHomePage extends PageObject{

    private By category = By.cssSelector(".has-sub-menu");
    private By subCategory = By.cssSelector(".menu-vertical>li>a");
    private By womanProduct = By.cssSelector("img[alt*='Crochet Yoke Tank.']");
    private By productsize = By.cssSelector("li[class='selectable']");

    public WebElement getCategory(){return waitForExpectedElement(category);}
    public WebElement getSubCategory(){return waitForExpectedElement(subCategory);}
    public WebElement getProductsize(){return waitForExpectedElement(productsize);}
    public WebElement getWomanProduct(){return waitForExpectedElement(womanProduct);}


    public void clickCategory(String categoryname) throws InterruptedException {

        Thread.sleep(2000);
        List<WebElement> ls = webDriver.findElements((category));
        System.out.println(ls);
        System.out.println(ls.size());

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

            if(ws.getAttribute("title").contains(size)){
                ws.click();
            }
        }
    }

}
