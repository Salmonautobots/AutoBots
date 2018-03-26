package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.models.cucumber.RegistrationModel;
import com.salmon.test.page_objects.gui.WebRegisterPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.Assert.assertEquals;

/**
 * Created by aherappa on 13/12/2017.
 */

public class WebRegisterSteps {
    private WebRegisterPage registerPage;


    public WebRegisterSteps(WebRegisterPage registerPage) {
        this.registerPage = registerPage;
    }


    @When("^I click on create account button$")
    public void iClickOnCreateAccountButton() throws Throwable {
        registerPage.clickOnCreateAccountBtn();
        assertEquals(Props.getMessage("registerPageTitle"), registerPage.getCurrentPageTitle());
    }

    @When("^I enter all valid the details on the registration page$")
    public void iEnterAllValidTheDetailsOnTheRegistrationPage() throws Throwable {
        registerPage.enterRegistrationDeatils();

    }

    @When("^I click on register button$")
    public void iClickOnRegisterButton() throws Throwable {
        registerPage.clickOnRegisterButton();
    }


    @Then("^I should see successfully registered message on website$")
    public void iShouldSeeSuccessfullyRegisteredMessageOnWebsite() throws Throwable {
        assertEquals(Props.getMessage("registerSuccessMsg"), registerPage.getRegisterSuccessMessage());
    }

    @Then("^I see error message for mandatory fields on registration page$")
    public void iSeeErrorMessageForMandatoryFieldsOnRegistrationPage(List<RegistrationModel> registerDeatils) throws Throwable {
        for (RegistrationModel registerUser : registerDeatils) {
            registerPage.enterRegistrationDeatilsMandatory(registerUser);
            switch (registerUser.getErrorMsg()) {
                case "errorTitleIsMandatory":
                    assertThat(registerPage.getAppropriateErrorMessage("title")).isEqualToIgnoringCase(Props.getMessage("errorMessage"));
                    break;
                case "errorFirstNameIsMandatory":
                    assertThat(registerPage.getAppropriateErrorMessage("firstName")).isEqualToIgnoringCase(Props.getMessage("errorMessage"));
                    break;
                case "errorLastNameIsMandatory":
                    assertThat(registerPage.getAppropriateErrorMessage("lastName")).isEqualToIgnoringCase(Props.getMessage("errorMessage"));
                    break;
                case "errorPasswordIsMandatory":
                    assertThat(registerPage.getAppropriateErrorMessage("password")).isEqualToIgnoringCase(Props.getMessage("errorMessage"));
                    break;
                case "errorEmailAddressIsMandatory":
                    Assertions.assertThat(registerPage.getAppropriateErrorMessage("emailAddress")).isEqualToIgnoringCase(Props.getMessage("errorMessage"));
                    break;
                case "errorConfirmPasswordIsMandatory":
                    Assertions.assertThat(registerPage.getAppropriateErrorMessage("confirmPassword")).isEqualToIgnoringCase(Props.getMessage("errorMessage"));
                    break;
                case "errorMobileNumberIssMandatory":
                    Assertions.assertThat(registerPage.getAppropriateErrorMessage("mobileNo")).isEqualToIgnoringCase(Props.getMessage("errorMessage"));
                    break;

            }

        }

    }
}