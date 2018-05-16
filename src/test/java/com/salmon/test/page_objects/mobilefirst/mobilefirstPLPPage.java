package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class mobilefirstPLPPage extends PageObject {

    private By searchRerults = By.cssSelector("div[class='pdp-link']");
    private By searchRerultString = By.cssSelector(".result-count.text-center.col-12.col-md-9.col-sm-6.order-sm-2>span");
    private By priceFilter = By.cssSelector("div[class='pdp-link']");

}
