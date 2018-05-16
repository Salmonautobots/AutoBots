package com.salmon.test.page_objects.mobilefirst;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class MyAccountPage extends PageObject {

    private By editLink = By.cssSelector(".pull-right");
    private By firstName = By.cssSelector("#firstName");
    private By confirmEmail = By.cssSelector("#confirmEmail");
    private By password = By.cssSelector("#password");
    private By saveButton = By.cssSelector("#.btn.btn-save.btn-block.btn-primary");

}
