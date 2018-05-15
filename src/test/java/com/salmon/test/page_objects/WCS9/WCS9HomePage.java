package com.salmon.test.page_objects.WCS9;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class WCS9HomePage extends PageObject {

    private By search = By.cssSelector("#searchTermWrapper");
    private By searchButton = By.cssSelector(".submitButton");
    private By searchResults = By.cssSelector("a[id*='WC_CatalogEntryDBThumbnailDisplay']");



}
