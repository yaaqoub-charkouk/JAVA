package TD.TD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BestStd {
    
    public static void getBestStudent() {
        String url = "jdbc:mysql://localhost:3306/DBStds";
        String user = "root";
        String password = "root123";

        String sql = """
                select * from STUDENT WHERE note = (SELECT MAX(note) FROM STUDENT)
                """;

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);) {
            
            ResultSet rs = stmt.executeQuery();
            
            System.out.println("Etudian major de promo : ");
            System.out.println("id\tcne\t\tnom\t\tnote");
            while (rs.next()) {
                System.out.print(rs.getInt("id") + "\t");
                System.out.print(rs.getLong("cne") + "\t");
                System.out.print(rs.getString("nom") + "\t");
                System.out.println(rs.getFloat("note"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
