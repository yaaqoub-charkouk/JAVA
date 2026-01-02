package TD.TD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateDB {
    
    public static void main(String args[]) {
        // exercice 1-1 :
        // String url = "jdbc:mysql://localhost:3306";
        // String user = "root";
        // String password = "root123";

        // String sql = "CREATE DATABASE IF NOT EXISTS DBStds"; // requete sql a executer

        // try (
        //     Connection conn = DriverManager.getConnection(url, user, password);
        //     PreparedStatement stmt = conn.prepareStatement(sql);) {

        //     stmt.executeUpdate(); // en lieu de executeQuery car nous metons a jour la based 
        //     System.out.println("La Base de Donnees 'DBStds' est cree ");
        // } catch (SQLException e) {
        //     e.printStackTrace();         
        // }


        // exercice 1-2 : 
        // Createtbstd.createTStd(url, user, password);

        // exercice 2-3 :
        // Addsutds.addStudent( 20854367, "Boujdain Amal", 11);
        // Addsutds.addStudent( 19237645, "Zougrar Imad", 14);
        // Addsutds.addStudent( 23050372, "Yaaqoub CHARKOUK", 6);
        

        // exercice 2-4 :
        // UpdtNote.updateNote("Boujdain Amal", 9);


        // exercice 2-5 :
        // DelNoteNV.deleteNoteNonValide();


        // exercice 3-6 :
        // ListeCR.listerConvoqueRatt();

        // exercice 3-6 :
        BestStd.getBestStudent();
    }
}
