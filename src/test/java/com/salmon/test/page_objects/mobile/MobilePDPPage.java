package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;


public class MobilePDPPage extends PageObject {

    private By quantity = By.cssSelector("#Quantity");
    private By addToCartButton = By.cssSelector("#add-to-cart");
    private By colour_or_size_Swatch = By.cssSelector("a[class='swatchanchor']");
    private By cart = By.cssSelector(".minicart-icon.fa.fa-shopping-cart");
    private By productMiniCartName = By.cssSelector(".mini-cart-name>a");
    private By productName = By.cssSelector(".product-name");
    private By viewCart = By.cssSelector(".button.mini-cart-link-cart");


    public void addQuantity(String totalquantity) throws InterruptedException {
   /*     waitForExpectedElement(quantity).click();
        Actions actions = new Actions(webDriver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").build().perform();*/
        waitForExpectedElement(quantity).sendKeys(totalquantity);
    }

    public void addToBag() {
        elementToBeClickable(addToCartButton).click();
    }

    public WebElement getCart() {
        return waitForExpectedElement(cart);
    }

    public void selectColourOrSizeSwatch(String input) throws InterruptedException {
        List<WebElement> ls = webDriver.findElements(colour_or_size_Swatch);
        for (WebElement ws : ls) {
            if (ws.getAttribute("title").contains(input)) {
                ws.click();
                Thread.sleep(5000);
                break;
            }
        }
    }

    public void mouseoverCart(WebElement wb) throws InterruptedException {
        mouseoverElement(wb);
    }

    public boolean checkAddedProductsInMiniBasket() {
        if (waitForExpectedElement(productMiniCartName).getText().contains(waitForExpectedElement(productName).getText())) {
            return true;
        }
        return false;
    }

    public void clickViewCart(){
        waitForExpectedElement(viewCart).click();
    }
}