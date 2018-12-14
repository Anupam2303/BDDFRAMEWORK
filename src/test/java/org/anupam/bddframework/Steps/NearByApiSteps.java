package org.anupam.bddframework.Steps;

import StepDefinition.BddStepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import lombok.Data;
import org.anupam.bddframework.Base.BaseUtil;
import org.springframework.boot.test.mock.mockito.MockBean;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@BddStepDefinition
@Data
public class NearByApiSteps {
    @MockBean
    BaseUtil baseUtil;
    public static String URL;
    public static String APIPATH;
    private static String LOCATION;
    private static String RADIUS;
    private static String TYPE;
    private static String KEYWORD;
    private static String KEY = "AIzaSyDPqtPHlzJikfaNHQENEJ9utXl4R9Ix_Uc";
    private static Response APIRESPONSE;

    @Given("^base URL is '(.*)'$")
    public void baseURLIsHttpsMapsGoogleapisComMapsApi(String baseURL) throws Throwable {
        URL = baseURL;
    }

    @And("^API path is '(.*)'$")
    public void apiPathIsPlaceNearbysearchJson(String apiPath) throws Throwable {
        APIPATH =apiPath;
    }

    @And("^Params are '(.*)' '(.*)' '(.*)' '(.*)'$")
    public void paramsAreLocationRadiusTypeKeywordAndKey(String location, String radius,String type,String keyword) throws Throwable {
        LOCATION = location;
        RADIUS = radius;
        TYPE = type;
        KEYWORD = keyword;
    }

    @When("^service hits with above request capture request$")
    public void serviceHitsWithAboveRequestCaptureRequest() throws Throwable {
        baseUtil.restAssured.baseURI = URL;
        Response response;
        response = given()
                .queryParam("location",LOCATION)
                .queryParam("radius",RADIUS)
                .queryParam("type",TYPE)
                .queryParam("keyword",KEYWORD)
                .queryParam("key",KEY)
                .log().all()
                .get(APIPATH);
        response.prettyPrint();
        APIRESPONSE = response;
    }

    @Then("^Verify success is true$")
    public void verifySuccessIsTrue() throws Throwable {
        assertThat(" Success is not true", APIRESPONSE.getStatusCode(), equalTo(200));
    }
}
