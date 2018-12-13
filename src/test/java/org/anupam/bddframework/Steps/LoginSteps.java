package org.anupam.bddframework.Steps;

import StepDefinition.BddStepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Data;
import org.anupam.bddframework.Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.mock.mockito.MockBean;

@BddStepDefinition
@Data
public class LoginSteps {
    @MockBean
    private BaseUtil baseUtil;

    @Given("^Where URL is '(.*)'$")
    public void whereURLIsHttpsPhptravelsOrgClientareaPhp(String URL) throws Throwable {
        baseUtil.driver = new ChromeDriver();
        baseUtil.driver.navigate().to(URL);
    }

    @When("^userName is '(.*)' and password is '(.*)'$")
    public void usernameIsAnupamraiGmailComAndPasswordIsAnupamrai(String username, String password) throws Throwable {
        baseUtil.driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys(username);
        baseUtil.driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys(password);
    }

    @And("^Click login button$")
    public void clickLoginButton() throws Throwable {
        baseUtil.driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
    }

    @Then("^Verify User is login$")
    public void verifyUserIsLogin() throws Throwable {

    }

    @And("^Logout buttin should be enabled$")
    public void logoutButtinShouldBeEnabled() throws Throwable {
        baseUtil.driver.close();
    }
}
