package org.fakerapi.api;

import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.Properties;

public class TestBase {
    protected RequestSpecification reqSpec;
    Properties props = new Properties();

    @BeforeClass
    public void setup() {
        try {
            props.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        baseURI = props.getProperty("baseURI");
        reqSpec = given();
    }
}
