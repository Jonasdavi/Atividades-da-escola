import java.awt.*;
import javax.swing.*;

public class TabGUI{
    private JFrame jPrinc;
    private JPanel jp;
    private JButton jButton[];

    public TabGUI(){
        jPrinc= new JFrame("Jogo da velha");
        jp= new JPanel();
        jButton= new JButton[9];

        for(int i=0; i<jButton.length; i++){
            jButton[i]= new JButton();
        }

        jp.setLayout(new GridLayout(3, 3));
        jp.add(jButton[0], 1);
        jPrinc.setVisible(true);
    }
}