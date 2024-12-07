import java.awt.BorderLayout; //Layout nas bordas, orientado por norte, sul, leste, oeste e centro
import javax.swing.*;

public class BorderLayout1 {
    public static void main(String[] args) {
        JFrame jPrinc= new JFrame("Border Layout");
        JButton b1= new JButton("Norte");
        JButton b2= new JButton("Sul");
        JButton b3= new JButton("Leste");
        JButton b4= new JButton("Oeste");
        JButton b5= new JButton("Centro");

        jPrinc.setSize(600,300);
        jPrinc.setVisible(true);

        jPrinc.add(b1, BorderLayout.NORTH);
        jPrinc.add(b2, BorderLayout.SOUTH);
        jPrinc.add(b3, BorderLayout.EAST);
        jPrinc.add(b4, BorderLayout.WEST);
        jPrinc.add(b5, BorderLayout.CENTER);
    }
}
