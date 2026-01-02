package TD.TD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DelNoteNV {
    
    public static void deleteNoteNonValide() {
        String url = "jdbc:mysql://localhost:3306/DBStds";
        String user = "root";
        String password = "root123";

        String sql = """
                DELETE FROM STUDENT WHERE note < 5
                """;
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

                int rowsAffected = stmt.executeUpdate();
                System.out.println("DelNoteNV --> " + rowsAffected + " Etudiants non admis ont ete supprime .");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
