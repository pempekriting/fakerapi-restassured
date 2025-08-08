package org.fakerapi.api;

import io.restassured.response.Response;

public class CompaniesAPI extends TestBase {

    public Response getCompanies(int quantity) {
        return reqSpec.queryParam("_quantity", quantity).get("/companies");
    }

    public Response getAllCompanies() {
        return reqSpec.get("/companies");
    }
}