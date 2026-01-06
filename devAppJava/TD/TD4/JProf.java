

import javax.swing.*;
import java.awt.*;

public class JProf {
    public static void main(String args[]) {

        JLabel titre = new JLabel("Recrutement d’un Professeur", JLabel.CENTER);
        // 1 - Create Window (fenetre) :
        JFrame frame = new JFrame("recruter");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit hook
        
        // 2 - choose layout type : 
        // ....
        frame.setLayout(new BorderLayout());

        // 3 - ajouter des composant swing :
        JTextField nom = new JTextField("nom"); // recuperer la valeur --->  nom.getText();
        JTextField email = new JTextField("email");

        // JTextField genre = new JTextField("genre"); // a modifier 
        JRadioButton m = new JRadioButton("M");
        JRadioButton f = new JRadioButton("F");
        ButtonGroup genre = new ButtonGroup();
        genre.add(m);
        genre.add(f);
        JPanel panelGenre = new JPanel();
        panelGenre.add(m);
        panelGenre.add(f);

        JTextField dateRec = new JTextField("dateRec"); // a modifier 

        String grades[] = {"PESA", "PH", "PES"};
        JComboBox<String> grade = new JComboBox<>(grades); // grades.getSelectedItem();


        JButton recruteBtn = new JButton("recruter");
        JButton clearBtn= new JButton("clear");
        JPanel panelBtn = new JPanel(new GridLayout(1, 2));
        panelBtn.add(recruteBtn);
        panelBtn.add(clearBtn);


        // 4.1 - regrouper les element texte dans un panel
        LayoutManager layout = new GridLayout(5, 1, 10, 10);
        JPanel panel = new JPanel(layout);
        
        // 4 - ajouter les composant swing a la fenetre :
        panel.add(nom);
        panel.add(panelGenre);
        panel.add(email);
        panel.add(dateRec);
        panel.add(grade);

        // comment faire organiser les elements dans la fenetre ? 
        frame.add(titre, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(panelBtn, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
