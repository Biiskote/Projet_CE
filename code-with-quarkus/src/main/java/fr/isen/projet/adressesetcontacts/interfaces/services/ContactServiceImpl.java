package fr.isen.projet.adressesetcontacts.interfaces.services;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import fr.isen.projet.adressesetcontacts.interfaces.models.AddressModel;
import fr.isen.projet.adressesetcontacts.interfaces.models.ContactModel;
import io.agroal.api.AgroalDataSource;

@ApplicationScoped
public class ContactServiceImpl implements ContactService {

    @Inject
    AgroalDataSource dataSource;

    @Override
    public String createContact(ContactModel contact) {
        String sql = "INSERT INTO contact_model (uuid, id_address, name, first_name, email, personal_phone, job, work_phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, contact.getUuid());
            stmt.setString(2, contact.getIdAddress()); // Assurez-vous que l'ID de l'adresse est bien passé
            stmt.setString(3, contact.getName());
            stmt.setString(4, contact.getFirstname());
            stmt.setString(5, contact.getEmail());
            stmt.setString(6, contact.getPersonalPhone());
            stmt.setString(7, contact.getFunction());
            stmt.setString(8, contact.getBuisnessPhone());
            stmt.executeUpdate();
            return contact.getUuid(); // Retourne l'UUID du contact créé
        } catch (SQLException e) {
            throw new RuntimeException("Error creating contact", e);
        }
    }

    @Override
    public ContactModel getContactById(String uuid) {
        String sql = "SELECT uuid, id_address, name, first_name, email, personal_phone, job, work_phone FROM contact_model WHERE uuid = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, uuid);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    ContactModel contact = new ContactModel();
                    contact.setUuid(rs.getString("uuid"));
                    contact.setIdAddress(rs.getString("id_address"));
                    contact.setName(rs.getString("name"));
                    contact.setFirstname(rs.getString("first_name"));
                    contact.setEmail(rs.getString("email"));
                    contact.setPersonalPhone(rs.getString("personal_phone"));
                    contact.setFunction(rs.getString("job"));
                    contact.setBuisnessPhone(rs.getString("work_phone"));
                    return contact;
                } else {
                    throw new RuntimeException("Contact not found for UUID: " + uuid);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching contact by UUID", e);
        }
    }

    @Override
    public List<ContactModel> getAllContacts() {
        List<ContactModel> contacts = new ArrayList<>();
        String sql = "SELECT uuid, id_address, name, first_name, email, personal_phone, job, work_phone FROM contact_model";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                ContactModel contact = new ContactModel();
                contact.setUuid(rs.getString("uuid"));
                contact.setIdAddress(rs.getString("id_address"));
                contact.setName(rs.getString("name"));
                contact.setFirstname(rs.getString("first_name"));
                contact.setEmail(rs.getString("email"));
                contact.setPersonalPhone(rs.getString("personal_phone"));
                contact.setFunction(rs.getString("job"));
                contact.setBuisnessPhone(rs.getString("work_phone"));
                contacts.add(contact);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching all contacts", e);
        }
        return contacts;
    }

    @Override
    public ContactModel updateContact(String uuid, ContactModel updatedContact) {
        String sql = "UPDATE contact_model SET name = ?, first_name = ?, email = ?, personal_phone = ?, job = ?, work_phone = ?, id_address = ? WHERE uuid = ?";
        try (Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, updatedContact.getName());
            stmt.setString(2, updatedContact.getFirstname());
            stmt.setString(3, updatedContact.getEmail());
            stmt.setString(4, updatedContact.getPersonalPhone());
            stmt.setString(5, updatedContact.getFunction());
            stmt.setString(6, updatedContact.getBuisnessPhone());
            stmt.setString(7, updatedContact.getIdAddress());
            stmt.setString(8, uuid);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new RuntimeException("No contact found with UUID: " + uuid);
            }
            return updatedContact;
        } catch (SQLException e) {
            throw new RuntimeException("Error updating contact", e);
        }
    }



    @Override
    public void deleteContact(String uuid) {
        String sql = "DELETE FROM contact_model WHERE uuid = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, uuid);
            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new RuntimeException("No contact found with UUID: " + uuid);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error deleting contact", e);
        }
    }

    @Override
    public List<ContactModel> searchThreeDigitsCriteria(String search) {
        // Validation de la chaîne de recherche pour s'assurer qu'elle contient 3 chiffres
        if (search == null || search.length() != 3) {
            throw new IllegalArgumentException("Search criteria must be exactly 3 digits");
        }

        // Requête SQL pour rechercher les contacts en fonction de critères
        String sql = "SELECT uuid, id_address, name, first_name, email, personal_phone, job, work_phone FROM contact_model WHERE name LIKE ? OR first_name LIKE ? OR email LIKE ? OR personal_phone LIKE ? OR work_phone LIKE ?";
        
        List<ContactModel> contacts = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            // Ajouter le critère de recherche aux paramètres SQL
            String searchPattern = "%" + search + "%";
            stmt.setString(1, searchPattern);
            stmt.setString(2, searchPattern);
            stmt.setString(3, searchPattern);
            stmt.setString(4, searchPattern);
            stmt.setString(5, searchPattern);
            
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    ContactModel contact = new ContactModel();
                    contact.setUuid(rs.getString("uuid"));
                    contact.setIdAddress(rs.getString("id_address"));
                    contact.setName(rs.getString("name"));
                    contact.setFirstname(rs.getString("first_name"));
                    contact.setEmail(rs.getString("email"));
                    contact.setPersonalPhone(rs.getString("personal_phone"));
                    contact.setFunction(rs.getString("job"));
                    contact.setBuisnessPhone(rs.getString("work_phone"));
                    contacts.add(contact);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error searching contacts by three digits criteria", e);
        }
        return contacts;
    }
}
