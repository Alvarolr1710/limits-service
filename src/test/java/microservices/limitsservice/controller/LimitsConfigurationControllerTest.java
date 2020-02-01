package microservices.limitsservice.controller;

import microservices.limitsservice.IntegrationTestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LimitsConfigurationControllerTest extends IntegrationTestBase {


    @Test
    public void shouldRetrieveMaxAndMin() {
        response = given().log().all()
                .when().get("/limits").thenReturn();
        response.then().log().all();

        assertThat(response.getBody().asString().contains("maximum"), is(true));
        assertThat(response.getBody().asString().contains("minimum"), is(true));
    }


}