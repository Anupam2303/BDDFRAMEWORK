package org.anupam.bddframework.Steps;

import StepDefinition.BddStepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import lombok.Data;
import org.anupam.bddframework.Base.BaseUtil;
import org.anupam.bddframework.Data.NeayByApiData;
import org.springframework.boot.test.mock.mockito.MockBean;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@BddStepDefinition
@Data
public class NearByApiSteps {
    @MockBean
    BaseUtil baseUtil;
    @MockBean
    NeayByApiData neayByApiData;

    @Given("^base URL is '(.*)'$")
    public void baseURLIsHttpsMapsGoogleapisComMapsApi(String baseURL) throws Throwable {
        baseUtil.restAssured.baseURI = baseURL;

    }

    @And("^API path is '(.*)'$")
    public void apiPathIsPlaceNearbysearchJson(String apiPath) throws Throwable {
        neayByApiData.setApiPath(apiPath);
    }

    @And("^Params are '(.*)' '(.*)' '(.*)' '(.*)' and '(.*)'$")
    public void paramsAreLocationRadiusTypeKeywordAndKey(String location, String radius,String type,String keyword,String key) throws Throwable {
        neayByApiData.setLocation(location);
        neayByApiData.setRadius(radius);
        neayByApiData.setType(type);
        neayByApiData.setKeyword(keyword);
        neayByApiData.setKey(key);
    }

    @When("^service hits with above request capture request$")
    public void serviceHitsWithAboveRequestCaptureRequest() throws Throwable {
        Response response = given()
                .queryParam("location",neayByApiData.getLocation())
                .queryParam("radius",neayByApiData.getRadius())
                .queryParam("type",neayByApiData.getType())
                .queryParam("keyword",neayByApiData.getKeyword())
                .queryParam("key",neayByApiData.getKey())
                .log().all()
                .get(neayByApiData.getApiPath());
        response.prettyPrint();

        neayByApiData.setApiResponse(response);
    }

    @Then("^Verify success is true$")
    public void verifySuccessIsTrue() throws Throwable {
        assertThat(" Success is not true", neayByApiData.getApiResponse().getStatusCode(), equalTo(200));
    }
}
