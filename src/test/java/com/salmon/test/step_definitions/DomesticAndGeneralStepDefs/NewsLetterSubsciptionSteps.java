package com.salmon.test.step_definitions.DomesticAndGeneralStepDefs;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.page_objects.DomesticAndGeneral.dgHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class NewsLetterSubsciptionSteps {

    dgHomePage dgHomePage;

    public NewsLetterSubsciptionSteps(dgHomePage dgHomePage){
        this.dgHomePage = dgHomePage;
    }

    @When("^the user is on the D&G home page$")
    public void the_user_is_on_the_D_G_home_page() throws Throwable {
        UrlBuilder.startAtHomePage();
    }

    @When("^enteres \"([^\"]*)\"$")
    public void enteres(String email) throws Throwable {
            dgHomePage.enterEmail(email);
    }

    @When("^clicks signup$")
    public void clicks_signup() throws Throwable {

            dgHomePage.clickSignUp();
    }

    @Then("^the signup should be successful$")
    public void the_signup_should_be_successful() throws Throwable {
        Thread.sleep(5000);
        Assert.assertEquals("Thank you, you have subscribed",dgHomePage.successMessage());
    }

}
