import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class AppTUI {
    public static void main(String[] args) {
        JFrame jPrinc= new JFrame("Velha Gui");
        jPrinc.getContentPane().setLayout(new GridLayout(3,3));

        JPanel jp[]= new JPanel[9];

        ImageIcon imgX= new ImageIcon("svelha/src/X.png");
        JButton jb= new JButton("ok", imgX);

        for (int i=0; i<jp.length; i++) {
            jp[i]= new JPanel();
            jPrinc.add(jp[i]);
        }

        jp[0].setBackground(Color.BLACK);
        jp[0].add(jb);

        jPrinc.setSize(600,600);
        jPrinc.setVisible(true);
    }
}
