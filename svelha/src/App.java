public class App {
    public static void main(String[] args) throws Exception {
        Jogador j = new Jogador('X');
        Jogador j2= new Jogador('O');

        Tabuleiro t=  new Tabuleiro(j, j2);
        TUI tui= new TUI();

        char vencedor= '*';
        do { 
            if(t.jogar()){
                //t.exibirTabuleiro();
                Thread.sleep(1100);

                for (int i=0; i < 50; i++) {
                    System.out.println();
                }
                
                System.out.println("Jogada: " + t.getNumJogada());
                tui.desenheTabuleiro(t.getTabuleiro());
                
                if(t.getNumJogada()>4){
                    vencedor= t.verificarVencedor();
                }
            }
            
        }while(t.getNumJogada()<9 && vencedor=='*');
        if(vencedor=='*'){
            System.out.println("Deu velha!");
        }
        else{
            System.out.println("Vencedor: " + vencedor);
        }

    }
}
