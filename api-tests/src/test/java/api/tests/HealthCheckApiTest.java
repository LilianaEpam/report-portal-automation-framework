package api.tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import base.BaseTest;

public class HealthCheckApiTest extends BaseTest {

    @Test(groups = {"api", "smoke"})
    public void healthCheckShouldReturn200(){
        log.info("Starting health check API test");
        RestAssured.given()
                .baseUri("https://httpbin.org")
                .when()
                .get("/status/200")
                .then()
                .statusCode(200);

        log.info("Health check API test finished successfully");
    }
}
