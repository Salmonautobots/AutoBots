package com.salmon.test.page_objects.WCS9;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;

public class UserRegistrationPage extends PageObject {

    private By logonID = By.cssSelector("#WC_UserRegistrationAddForm_FormInput_logonId_In_Register_1_1");
    private By password = By.cssSelector("#WC_UserRegistrationAddForm_FormInput_logonPassword_In_Register_1");
    private By verifyPassword = By.cssSelector("#WC_UserRegistrationAddForm_FormInput_logonPasswordVerify_In_Register_1");
    private By firstName = By.cssSelector("#WC_UserRegistrationAddForm_NameEntryForm_FormInput_firstName_1");
    private By lastName = By.cssSelector("#WC_UserRegistrationAddForm_NameEntryForm_FormInput_lastName_1");
    private By streetAddress = By.cssSelector("#WC_UserRegistrationAddForm_AddressEntryForm_FormInput_address1_1");
    private By city = By.cssSelector("#WC_UserRegistrationAddForm_AddressEntryForm_FormInput_address1_1");
    private By country = By.cssSelector("#WC_UserRegistrationAddForm_AddressEntryForm_FormInput_country_1-button");
    private By stateProvince=By.cssSelector("#WC_UserRegistrationAddForm_AddressEntryForm_FormInput_state_1-button");
    private By zip=By.cssSelector("#WC_UserRegistrationAddForm_AddressEntryForm_FormInput_zipCode_1");
    private By email = By.cssSelector("#WC_UserRegistrationAddForm_FormInput_email1_In_Register_1");

}
