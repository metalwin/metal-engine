package co.metalwin.engine;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

/**
 * {@link EngineServerResource}
 */
@QuarkusTest
class EngineServerResourceTest {
    @Test
    public void testHelloEndpoint() {
        given()
            .when().get("/engine/ping")
            .then()
            .statusCode(200)
            .body(is("ok"));
    }
}
