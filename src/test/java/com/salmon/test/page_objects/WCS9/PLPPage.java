package com.salmon.test.page_objects.WCS9;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class PLPPage extends PageObject {

    private By searchCount = By.cssSelector("span[id*='searchTotalCount']");
    private By lowestPrice = By.cssSelector("#low_price_input");
    private By highestPrice = By.cssSelector("#high_price_input");
    private By searchGo = By.cssSelector("#price_range_go");

}
