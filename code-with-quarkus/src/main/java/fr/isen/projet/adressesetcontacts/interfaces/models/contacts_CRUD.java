package fr.isen.projet.adressesetcontacts.interfaces.models;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/contacts")
public class contacts_CRUD {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String contacts() {
        return "Affiche les contacts";
    }
}