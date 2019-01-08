package org.anupam.bddframework.Base;

import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class BaseUtil {

    public WebDriver driver;
    public RestAssured restAssured;
}
