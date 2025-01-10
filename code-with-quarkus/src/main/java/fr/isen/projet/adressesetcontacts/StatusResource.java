package fr.isen.projet.adressesetcontacts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import javax.sql.DataSource;

@Path("/status")
public class StatusResource {

    @Inject
    private DataSource dataSource; // Assurez-vous que votre DataSource est correctement configurée

    @GET
    public String getStatus() throws JsonProcessingException {
        String state = "OK"; // OK ou KO ou Dégradé
        String version = "1.0";
        int count = 0;

        // Requête SQL correcte pour additionner les compteurs des deux tables
        String sql = "SELECT " +
                     "(SELECT COUNT(*) FROM contact_model) + " +
                     "(SELECT COUNT(*) FROM address_model) AS total";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                count = rs.getInt("total");
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error fetching count from database", e);
        }

        Map<String, Object> statusResponse = new HashMap<>();
        statusResponse.put("state", state);
        statusResponse.put("count", count);
        statusResponse.put("version", version);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(statusResponse);
    }
}
