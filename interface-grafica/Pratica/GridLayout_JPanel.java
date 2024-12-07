import java.awt.*;
import javax.swing.*;

public class GridLayout_JPanel {
    public static void main(String[] args) {
        JFrame jPrinc= new JFrame("GridLayout and JPanel");
        GridLayout LGrade= new GridLayout(3,2);

        jPrinc.setSize(600, 400);
        jPrinc.getContentPane().setLayout(LGrade);

        JPanel jp1= new JPanel();
        JPanel jp2= new JPanel();
        JPanel jp3= new JPanel();
        JPanel jp4= new JPanel();
        JPanel jp5= new JPanel();
        JPanel jp6= new JPanel();

        jPrinc.add(jp1, 0);
        jPrinc.add(jp2, 1);
        jPrinc.add(jp3, 2);
        jPrinc.add(jp4, 3);
        jPrinc.add(jp5, 4);
        jPrinc.add(jp6, 5);
        jPrinc.setVisible(true);
    }
}
