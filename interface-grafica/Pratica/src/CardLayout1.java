
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class CardLayout1 {
    public static void main(String[] args) {
        JFrame jPrinc= new JFrame("Card Layout");
        jPrinc.setSize(600, 300);

        CardLayout cl= new CardLayout();
        jPrinc.getContentPane().setLayout(cl);

        JPanel jp1= new JPanel();
        JPanel jp2= new JPanel();

        jp1.setLayout(new BorderLayout());
        jp2.setLayout(new BorderLayout());

        JButton jb1= new JButton("Trocar Tela");
        JButton jb2= new JButton("Voltar para tela inicial");

        jp1.add(jb1, BorderLayout.CENTER);
        jp2.add(jb2, BorderLayout.CENTER);


        jPrinc.add(jp1);
        jPrinc.add(jp2);
        jPrinc.setVisible(true);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.next(jPrinc.getContentPane());
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.previous(jPrinc.getContentPane());
            }
        });
    }
}
