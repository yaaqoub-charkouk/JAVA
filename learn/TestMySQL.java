import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestMySQL {

    public static void main(String[] args) {

        // 1. JDBC URL (database name must exist)
        String url = "jdbc:mysql://localhost:3306/testdb";

        // 2. MySQL credentials
        String user = "root";
        String password = "root123"; // <-- change this

        // 3. Simple query
        String sql = "SELECT * FROM users";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)
        ) {

            System.out.println("Connected to MySQL successfully!");
            System.out.println("ID  | NAME");
            System.out.println("-----------");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + "   | " + name);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
