package TD.TD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdtNote {
    public static void updateNote(String nom, float note) {
        String url = "jdbc:mysql://localhost:3306/DBStds";
        String user = "root";
        String password = "root123";

        String sql = """
                UPDATE STUDENT SET note = ? where nom = ?;
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);) {
            
            stmt.setFloat(1, note);
            stmt.setString(2, nom);

            int affectedRows = stmt.executeUpdate();

            System.out.println("note modifie pour " + nom + " note : " + note);
            System.out.println("updateNote --> affected rows : " + affectedRows);
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
