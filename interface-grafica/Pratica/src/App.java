import javax.swing.*;
import java.awt.*;

public class App{
    public static void main(String[] args, String string, Icon icon) {
        JFrame jPrinc= new JFrame("GUI jogo da velha");
        jPrinc.setSize(600,300);
        Icon imgX= new ImageIcon("x.png");
        Icon imgO= new ImageIcon("bola.png");

        JPanel jp= new JPanel();
        jp.setLayout(new GridLayout(3,3));
        JButton teste= new JButton(string, imgX);

        jp.add(teste);

        jPrinc.add(jp);
        jPrinc.setVisible(true);
    }
}