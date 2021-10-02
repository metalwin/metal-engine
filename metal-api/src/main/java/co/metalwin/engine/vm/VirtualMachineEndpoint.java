package co.metalwin.engine.vm;

import co.metalwin.engine.vm.request.CreateVirtualMachineRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Endpoint to manage virtual machines
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("vm")
public class VirtualMachineEndpoint {

    @POST
    public CompletionStage<String> create(CreateVirtualMachineRequest request) {
        return CompletableFuture.completedFuture(request.getName());
    }
}
