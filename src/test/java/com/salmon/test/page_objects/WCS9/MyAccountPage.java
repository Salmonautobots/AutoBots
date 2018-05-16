package com.salmon.test.page_objects.WCS9;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class MyAccountPage extends PageObject {

    private By accountTitle = By.cssSelector(".myaccount_desc_title");
    private By linkEdit = By.cssSelector("#WC_MyAccountCenterLinkDisplay_inputs_1");
    private By firstName = By.cssSelector("#WC_UserRegistrationUpdateForm_NameEntryForm_FormInput_firstName_1");
    private By lastName = By.cssSelector("#WC_UserRegistrationUpdateForm_NameEntryForm_FormInput_lastName_1");
    private By allButtons = By.cssSelector("div[class='button_text']");

}
