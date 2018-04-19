package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;


public class MobilePDPPage extends PageObject {

    private By quantity = By.cssSelector("#Quantity");
    private By addToCartButton = By.cssSelector("#add-to-cart");
    private By colour_or_size_Swatch = By.cssSelector("a[class='swatchanchor']");
    private By cart = By.cssSelector(".minicart-icon.fa.fa-shopping-cart");
    private By productMiniCartName = By.cssSelector(".mini-cart-name>a");
    private By productName = By.cssSelector(".product-name");

    public void addQuantity(String totalquantity) {
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
                Thread.sleep(1500);
                ws.click();
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
}