package fr.isen.projet.adressesetcontacts.interfaces.models;

import fr.isen.projet.adressesetcontacts.interfaces.services.ContactService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/contacts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class contact_CRUD {

    @Inject
    private ContactService contactService;

    // Endpoint pour récupérer tous les contacts
    @GET
    public List<ContactModel> getAllContacts() {
        return contactService.getAllContacts();
    }

    // Endpoint pour récupérer un contact par son UUID
    @GET
    @Path("/{uuid}")
    public Response getContactById(@PathParam("uuid") String uuid) {
        ContactModel contact = contactService.getContactById(uuid);
        if (contact == null) {
            return Response.status(Response.Status.NOT_FOUND).entity("Contact non trouvé").build();
        }
        return Response.ok(contact).build();
    }

    // Endpoint pour créer un nouveau contact
    @POST
    public Response createContact(ContactModel contact) {
        String createdUuid = contactService.createContact(contact);
        return Response.status(Response.Status.CREATED).entity("Contact créé avec l'UUID : " + createdUuid).build();
    }

    // Endpoint pour mettre à jour un contact existant
    @PUT
    @Path("/{uuid}")
    public Response updateContact(@PathParam("uuid") String uuid, ContactModel updatedContact) {
    ContactModel contact = contactService.updateContact(uuid, updatedContact);
    if (contact == null) {
        return Response.status(Response.Status.NOT_FOUND).entity("Contact non trouvé").build();
    }
    return Response.ok(contact).build();
    }


    // Endpoint pour supprimer un contact par son UUID
    @DELETE
    @Path("/{uuid}")
    public Response deleteContact(@PathParam("uuid") String uuid) {
        contactService.deleteContact(uuid);
        return Response.noContent().build();
    }

    // Endpoint pour rechercher des contacts par critères de 3 chiffres
    @GET
    @Path("/search/{search}")
    public Response searchContacts(@PathParam("search") String search) {
        List<ContactModel> contacts = contactService.searchThreeDigitsCriteria(search);
        if (contacts.isEmpty()) {
            return Response.status(Response.Status.NOT_FOUND).entity("Aucun contact trouvé pour le critère : " + search).build();
        }
        return Response.ok(contacts).build();
    }
}
