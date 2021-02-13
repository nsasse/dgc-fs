package de.nsasse.dgc_fs.rest;

import de.nsasse.dgc_fs.model.VillageParty;
import de.nsasse.dgc_fs.service.VpBean;
import io.swagger.annotations.ApiResponse;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;

@Path("/village-party")
@Produces("application/json")
@Consumes("application/json")
public class VpController {

    @Inject
    VpBean vpBean;

    @GET
    @Path("/session/{id}")
    @ApiResponse(code = 200, message = "XY")
    public VillageParty getVpSession(
            @PathParam("id") String id
    ) {
        if (id.equals("1234")) {
            return vpBean.getVpSession();
        } else {
            return null;
        }
    }

    @POST
    @Path("/session/{id}")
    @ApiResponse(code = 200, message = "XY")
    public void postVpSession(
            @PathParam("id") String id,
            @Valid VillageParty villageParty
    ) {
        vpBean.setVpSession(villageParty);
    }
}
