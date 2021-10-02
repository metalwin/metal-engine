package co.metalwin.engine;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Platform web services for the engine
 */
@Path("/engine")
public class EngineEndpoint {

    @GET
    @Path("ping")
    @Produces(MediaType.TEXT_PLAIN)
    public String ping() {
        return "ok";
    }
}
