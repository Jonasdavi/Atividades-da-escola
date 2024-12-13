public class Tabuleiro extends Tabuleiro_base {
    private Jogador iniciante, atual;
    private int numJogada;
    private TabGUI gui;

    public Tabuleiro(Jogador j1, Jogador j2){
        gui= new TabGUI();

        super(j1, j2);


        setIniciante(1);
        numJogada=0;
    }

    @Override
    public void exibirTabuleiro() {
        for(int i=0; i<20; i++){
            System.out.println();
        }

        for(int i=0; i<getTabuleiro().length; i++){
            for(int j=0; j<getTabuleiro().length; j++){
                System.out.print(getTabuleiro()[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public boolean jogar() {
        if(numJogada==0){
            atual=iniciante;
        }
        else if(numJogada==9){
            return false;
        }

        int linha= atual.escolherLinha();
        int coluna= atual.escolherColuna();

        if(linha>=0 && linha<3 && coluna>=0 && coluna<3){
            if(this.getTabuleiro()[linha][coluna]=='*'){
                this.getTabuleiro()[linha][coluna]= atual.getMarcador();
                gui.addCaractere(linha, coluna, atual.getMarcador());

                numJogada++;
                atual = atual==getJogador1()? getJogador2() : getJogador1();
                return true;
            }
        }
        return false;
    }

    @Override
    public char verificarVencedor() {
        char vAtual= 'X'; //verificacao atual

        for (int i = 0; i < 2; i++){ //roda os 2 caracteres

            for(int j=0; j<3; j++){//verifica as vitorias horizontais e verticais
                if(getTabuleiro()[j][0]==vAtual && getTabuleiro()[j][1]==vAtual && getTabuleiro()[j][2]==vAtual || //horizontais
                getTabuleiro()[0][j]==vAtual && getTabuleiro()[1][j]==vAtual && getTabuleiro()[2][j]==vAtual){ //verticais
                    return vAtual;
                }
            }

            //verificar diagonais:
            if(getTabuleiro()[0][0]==vAtual && getTabuleiro()[1][1]==vAtual && getTabuleiro()[2][2]==vAtual || 
            getTabuleiro()[0][2]==vAtual && getTabuleiro()[1][1]==vAtual && getTabuleiro()[2][0]==vAtual){
                return vAtual;
            }

            vAtual='O';
        }
        return '*';
        
    }

    @Override
    public void reiniciarTabuleiro() {
        for(int i=0; i<getTabuleiro().length; i++){
            for(int j=0; j<getTabuleiro().length; j++){
                getTabuleiro()[i][j]= '*';
            }
        }

        gui.zerarTabuleiroGUI();

    }

    @Override
    public void setIniciante(int ini) {
        this.iniciante= ini==2? this.getJogador2() : this.getJogador1();
    }
    
    public int getNumJogada(){
        return this.numJogada;
    }
}
