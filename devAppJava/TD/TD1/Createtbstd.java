package TD.TD1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Createtbstd {
    
    public static void createTStd(String url, String user, String password) {
        String sql = """
                CREATE TABLE IF NOT EXISTS STUDENT ( 
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    cne     BIGINT,
                    nom     VARCHAR(100),
                    note    FLOAT
                    )
                    """;
        
        try ( Connection conn = DriverManager.getConnection(url + "/DBStds" , user, password);
              PreparedStatement stmt = conn.prepareStatement(sql); ) {
            stmt.executeUpdate();
            System.out.println("table STUDENT est cree avec succes.");
        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
