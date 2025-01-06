package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/addresses")
public class addresses_CRUD {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String addresses() {
        return "Affiche les addresses";
    }
}