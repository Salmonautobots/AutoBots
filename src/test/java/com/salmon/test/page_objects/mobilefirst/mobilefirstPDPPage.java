package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;

public class mobilefirstPDPPage extends PageObject {

    String productName;

    By colourComponent = By.cssSelector("div[data-attr='color']");
    By selectedColour = By.cssSelector(".color-value.swatch-circle.swatch-value.selectable");
    By sizeSelect = By.cssSelector("select[class='custom-select form-control select-size']");
    By quantitySelect = By.cssSelector("select[class='quantity-select custom-select form-control']");
    By addToCartButton = By.cssSelector("button[class='add-to-cart btn btn-primary']");
    By miniCart = By.cssSelector("i[class='minicart-icon fa fa-shopping-bag']");
    By bagIcon = By.cssSelector("i[class='minicart-icon fa fa-shopping-bag']");
    By shoppingCart = By.cssSelector("Shopping cart = span[class='minicart-quantity']");
    By successAlert = By.cssSelector(".alert.alert-success.add-to-basket-alert.text-center");


    public void selectSize(String size){
        waitForExpectedElement(sizeSelect).sendKeys(size);
    }

    public void selectQuantity(String quantity){
        waitForExpectedElement(quantitySelect).sendKeys(quantity);
    }

    public void selectColour() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor)webDriver;
        js.executeScript("window.scrollBy(0,150)");
        List<WebElement>colours = webDriver.findElements(By.cssSelector(".color-value.swatch-circle.swatch-value.selectable"));
        for(WebElement colour:colours){
            colour.click();

        }
    }

    public void addToCart() throws InterruptedException {
        waitForExpectedElement(addToCartButton).click();
    }

    public boolean checkSuccessAlert(){
        return waitForExpectedElement(successAlert).isDisplayed();
    }

    public void clickMiniCart(){
        waitForExpectedElement(miniCart).click();
    }


}
