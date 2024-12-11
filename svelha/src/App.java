public class App {
    public static void main(String[] args) throws Exception {
        Jogador j = new Jogador('X');
        Jogador j2= new Jogador('O');

        Tabuleiro t=  new Tabuleiro(j, j2);

        char vencedor= '*';
        do { 
            if(t.jogar()){
                t.exibirTabuleiro();
                
                if(t.getNumJogada()>4){
                    vencedor= t.verificarVencedor();
                }
            }
            
        }while(t.getNumJogada()<9 && vencedor=='*');
    }
}
