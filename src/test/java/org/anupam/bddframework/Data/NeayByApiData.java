package org.anupam.bddframework.Data;

import io.restassured.response.Response;
import lombok.Data;

@Data
public class NeayByApiData {
    private String apiPath;
    private String location;
    private String radius;
    private String type;
    private String keyword;
    private String key;
    private Response apiResponse;
}
