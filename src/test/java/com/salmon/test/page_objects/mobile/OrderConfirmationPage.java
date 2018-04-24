package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class OrderConfirmationPage extends PageObject {

    private By ordernumberSection = By.cssSelector("h1[class='order-number']");

    public void orderNumberPrint(){

        System.out.println(waitForExpectedElement(ordernumberSection).findElement(By.cssSelector(".value")).getText());
    }


}
