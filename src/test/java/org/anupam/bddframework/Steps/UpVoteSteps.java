package org.anupam.bddframework.Steps;

import StepDefinition.BddStepDefinition;
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
public class UpVoteSteps {
    @MockBean
    private BaseUtil baseUtil;

    @Given("^URL is '(.*)'$")
    public void urlIsHttpsWwwDroidlimeComArtikelDroidlimeAwardsHtml(String URL) throws Throwable {
        baseUtil.driver = new ChromeDriver();
        baseUtil.driver.navigate().to(URL);
    }

    @When("^Click blibli option$")
    public void clickBlibliOption() throws Throwable {
        baseUtil.driver.findElement(By.xpath("//*[@id=\"totalpoll-id-76a970e19557b7ec2226b0a737139b07\"]/form/div[1]/label[4]/div/div[1]")).click();
    }

    @Then("^Click Vote$")
    public void clickVote() throws Throwable {
        baseUtil.driver.findElement(By.xpath("//*[@id=\"totalpoll-id-76a970e19557b7ec2226b0a737139b07\"]/form/div[2]/button[2]")).click();
        baseUtil.driver.close();
    }
}
