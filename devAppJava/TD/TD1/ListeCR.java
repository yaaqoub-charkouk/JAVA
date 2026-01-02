package TD.TD1;

import java.sql.*;

public class ListeCR {
    
    public static void listerConvoqueRatt() {
        String url = "jdbc:mysql://localhost:3306/DBStds";
        String user = "root";
        String password = "root123";


        String sql = """
                SELECT * FROM STUDENT WHERE note < 10 ORDER BY nom DESC
                """;
        
        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement stmt = conn.prepareStatement(sql);) {
            
            ResultSet rs = stmt.executeQuery();
            System.out.println("List des etudiant convoque au RATT");
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
