package api.tests;

import base.BaseTest;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

public class HealthCheckApiTest  extends BaseTest {

    @Test(groups = {"api", "smoke"})
    public void healthCheckShouldReturn200(){
        RestAssured.given()
                .baseUri("https://httpbin.org")
                .when()
                .get("/status/200")
                .then()
                .statusCode(200);
    }
}
