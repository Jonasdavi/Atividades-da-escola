public class Tabuleiro extends Tabuleiro_base {
    private Jogador iniciante, atual;

    public Tabuleiro(Jogador j1, Jogador j2){
        super(j1, j2);
        
        this.reiniciarTabuleiro();
        
    }

    @Override
    public void exibirTabuleiro() {
        for(int i=0; i<20; i++){
            System.out.println();
        }

        for(int i=0; i<getTabuleiro().length; i++){
            for(int j=0; j<getTabuleiro().length; j++){
                System.out.println(getTabuleiro()[i][j]);
            }
        }
    }

    @Override
    public boolean jogar() {
        return true;
    }

    @Override
    public char verificarVencedor() {
        return '*';
    }

    @Override
    public void reiniciarTabuleiro() {
        for(int i=0; i<getTabuleiro().length; i++){
            for(int j=0; j<getTabuleiro().length; j++){
                getTabuleiro()[i][j]= '*';
            }
        }

    }

    @Override
    public void setIniciante(int ini) {
        this.iniciante= ini==2? this.getJogador2() : this.getJogador1();
    }
    
}
