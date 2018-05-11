package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class mobilefirstPDPPage extends PageObject {

    By colourComponent = By.cssSelector("div[data-attr='color']");
    By selectedColour = By.cssSelector("span[class='color-value swatch-circle swatch-value selected selectable']");
    By sizeSelect = By.cssSelector("select[class='custom-select form-control select-size']");
    By quantitySelect = By.cssSelector("select[class='quantity-select custom-select form-control']");
    By addToCartButton = By.cssSelector("button[class='add-to-cart btn btn-primary']");
    By miniCart = By.cssSelector("i[class='minicart-icon fa fa-shopping-bag']");
    By bagIcon = By.cssSelector("i[class='minicart-icon fa fa-shopping-bag']");
    By shoppingCart = By.cssSelector("Shopping cart = span[class='minicart-quantity']");

    public void test(){

        System.out.println("print me");
    }
}
