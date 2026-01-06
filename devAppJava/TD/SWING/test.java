

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class test {
    public static void main(String args[]) {
        JFrame  frame = new JFrame("swingTest");

        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        JButton btn = new JButton("validate");
        frame.add(btn);

        frame.setVisible(true);
    }
}