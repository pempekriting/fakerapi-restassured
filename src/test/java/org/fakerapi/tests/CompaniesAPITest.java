package org.fakerapi.tests;

import static io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.response.Response;
import org.fakerapi.api.CompaniesAPI;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import java.util.List;

public class CompaniesAPITest extends CompaniesAPI {

    @DataProvider(name = "quantityData")
    public Object[] getQuantityData() {
        return new Object[] {20, 5, 1};
    }

    @Test(dataProvider = "quantityData")
    public void testGetCompaniesWithQuantity(int quantity) {
        Response res = getCompanies(quantity);
        res.then().assertThat().statusCode(200);
        List<?> data = res.jsonPath().getList("data");
        Assert.assertEquals(data.size(), quantity);
    }

    @Test
    public void testAllIdsNotNull() {
        Response res = getAllCompanies();
        res.then().assertThat().statusCode(200);

        List<Integer> ids = res.jsonPath().getList("data.id");
        for (Integer id : ids) {
            Assert.assertNotNull(id);
        }

        res.then().assertThat().body(matchesJsonSchemaInClasspath("getAllCompaniesSchema.json"));
    }
}
