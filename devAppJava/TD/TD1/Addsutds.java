package TD.TD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Addsutds {

    public static void addStudent(long cne, String nom, float note) {
        String url = "jdbc:mysql://localhost:3306/DBStds";
        String user = "root";
        String password = "root123";

        String sql = """
                INSERT INTO STUDENT (cne, nom, note)
                VALUES (?, ?, ?)
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);) {

            stmt.setLong(1, cne);
            stmt.setString(2, nom);
            stmt.setFloat(3, note);

            int rows_affected = stmt.executeUpdate();
            System.out.println("enregistrement ajoute avec success . \nrows_affected :\t" + rows_affected);
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
