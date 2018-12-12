package org.anupam.bddframework.bddframework.Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.anupam.bddframework.bddframework.Pages.LoginPHPTravellers;
import org.anupam.bddframework.bddframework.Properties.WebProperties;
import org.anupam.bddframework.bddframework.StepDefinition.BddStepDefinition;
import org.springframework.beans.factory.annotation.Autowired;

@BddStepDefinition
public class LoginSteps {
    @Autowired
    LoginPHPTravellers loginPHPTravellers;
    @Autowired
    WebProperties webProperties;


    @Given("^Where URL is '(.*)'$")
    public void whereURLIsHttpsPhptravelsOrgClientareaPhp(String URL) throws Throwable {
        loginPHPTravellers.openAt(webProperties.endpoint("loginphp"));
    }

    @When("^userName is '(.*)' and password is '(.*)'$")
    public void usernameIsAnupamraiGmailComAndPasswordIsAnupamrai(String username, int password) throws Throwable {

    }

    @And("^Click login button$")
    public void clickLoginButton() throws Throwable {

    }

    @Then("^Verify User is login$")
    public void verifyUserIsLogin() throws Throwable {

    }

    @And("^Logout buttin should be enabled$")
    public void logoutButtinShouldBeEnabled() throws Throwable {

    }
}
