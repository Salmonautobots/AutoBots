package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.List;


public class MobilePDPPage extends PageObject {

    private By quantuty = By.cssSelector("#Quantity");
    private By addToCartButton = By.cssSelector("#add-to-cart");
    private By productInMiniCart = By.cssSelector(".mini-cart-name>a");
    private By colour_or_size_Swatch = By.cssSelector("a[class='swatchanchor']");
    private By cart = By.cssSelector(".minicart-icon.fa.fa-shopping-cart");
    private By productMiniCartName = By.cssSelector(".mini-cart-name>a");
    private By productName = By.cssSelector(".product-name");

    public WebElement getProductName() {
        return waitForExpectedElement(productName);
    }

    public WebElement getCart() {
        return waitForExpectedElement(cart);
    }

    public WebElement getProductMiniCartName() {
        return waitForExpectedElement(productMiniCartName);
    }

    public WebElement getQuantity() {
        return waitForExpectedElement(quantuty);
    }

    public WebElement getAddToCartButton() {
        return waitForExpectedElement(addToCartButton, 4000);
    }

    public WebElement getColourOrSizeSwatch() {
        return webDriver.findElement(colour_or_size_Swatch);
    }

    public void addToBag() {
        elementToBeClickable(getAddToCartButton()).click();
    }

    public void selectColourOrSizeSwatch(String input) throws InterruptedException {
        List<WebElement> ls = webDriver.findElements(colour_or_size_Swatch);
        for (WebElement ws : ls) {
            if (ws.getAttribute("title").contains(input)) {
                Thread.sleep(3000);
                ws.click();
                break;
            }
        }
    }

    public void mouseoverCart(WebElement wb) throws InterruptedException {
            mouseoverElement(wb);
    }

    public boolean checkAddedProductsInMiniBasket() {

        if (getProductMiniCartName().getText().contains(getProductName().getText())) {
            return true;
        }
        return false;
    }
}