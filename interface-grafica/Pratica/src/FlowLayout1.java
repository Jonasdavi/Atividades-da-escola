
/*FlowLaout organiza os componentes em linhas, onde os componentes sao adicionados ate 
 fecharem a largura (orientados pela direcao que vc definir), ai continuam em uma nova linha 
 JPanel tem por padrao, alinhados orientados da esquerda para a direita)
 */

import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayout1 {
    public static void main(String[] args) {
        JFrame jPrinc= new JFrame("FlowLayout");
        jPrinc.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
        jPrinc.setSize(600,300);

        JLabel jl= new JLabel("teste");
        JLabel jl2= new JLabel("teste2");
        jPrinc.add(jl);
        jPrinc.add(jl2);
        jPrinc.setVisible(true);
    }
}
