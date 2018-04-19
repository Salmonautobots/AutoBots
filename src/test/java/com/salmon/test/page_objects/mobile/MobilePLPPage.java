package com.salmon.test.page_objects.mobile;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MobilePLPPage extends PageObject {

    private By filterCriteria = By.cssSelector(".refinement-link");
    private By appliedFilter = By.cssSelector(".breadcrumb-refinement-value");

    public void applyFilter(String filter) {
        List<WebElement>ls = webDriver.findElements(filterCriteria);
        for(WebElement ws:ls){
            if(ws.getText().contains(filter)){
                ws.click();
            }
        }
    }

    public boolean checkAppliedFilter(String filter){
        if(waitForExpectedElement(appliedFilter).getText().contains(filter)){
            return true;
        }
        return false;
    }
}