package co.metalwin.engine.vm;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class VirtualMachineEndpointTest {

    @Test
    void testCreateEndpoint() throws IOException {
        var body = new String(getClass().getClassLoader()
            .getResourceAsStream("/vm/create-vm.json").readAllBytes());
        given()
            .when()
            .body(body).contentType(MediaType.APPLICATION_JSON)
            .post("/vm")
            .then()
            .body(is("my-vm"));
    }
}
