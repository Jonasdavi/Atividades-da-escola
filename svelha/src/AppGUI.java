import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class AppGUI {
    public static void main(String[] args) {
        JFrame jPrinc= new JFrame("Velha Gui");
        jPrinc.getContentPane().setLayout(new GridLayout(3,3, 10, 10));

        JPanel jp[]= new JPanel[9];

        ImageIcon imgX= new ImageIcon("src/X.png");
        ImageIcon imgO= new ImageIcon("src/O.png");
        JButton jb[]= new JButton[9];
        

        for (int i=0; i<jp.length; i++) {
            jp[i]= new JPanel();
            jb[i]= new JButton();
            
            jb[i].setBackground(Color.BLACK);
            jp[i].setBackground(Color.BLACK);

            jp[i].setLayout(new BorderLayout());

            jp[i].add(jb[i]);
            jPrinc.add(jp[i], i);
        }

        jPrinc.setSize(600,600);
        jPrinc.setVisible(true);
    }
}
