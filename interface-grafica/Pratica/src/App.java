import javax.swing.*;
import java.awt.FlowLayout;

public class App{
    public static void main(String[] args) {
        JFrame jPrinc= new JFrame("Conversor");

        JLabel l1= new JLabel("Dado a ser convertido: ");
        JTextField tf= new JTextField(5);

        //troca o layout do JFrame para FlowLaout:
        FlowLayout fLayout= new FlowLayout(FlowLayout.LEFT);
        jPrinc.getContentPane().setLayout(fLayout);

        jPrinc.setSize(600, 300);
        jPrinc.setVisible(true);
        jPrinc.add(l1);
        jPrinc.add(tf);
    }
}