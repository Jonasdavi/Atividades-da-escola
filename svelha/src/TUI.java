public class TUI implements TabUI{
    private int qtCharCaractere; //quantidade de char de cada caractere para representar X ou O em relacao a linha ou coluna
    private int qtEspacoRedor; //quantidade de espaço ao redor do desenho do caractere X ou O
    private int tamanhoDesenho; //quantidade de caracteres do desenho total

    private final int QTLINHASDESENHO= 2; //quantidade de linhas que o desenho do jogo da velha tem em relacao a linha ou coluna 
    
    public TUI(){
        qtCharCaractere=2;
        qtEspacoRedor=1;

        tamanhoDesenho= qtCharCaractere*3 + qtEspacoRedor*6 + QTLINHASDESENHO;
    }


    @Override
    public void desenheTabuleiro(char[][] tab) {
        if(tab.length==3 && tab[0].length==3){
            
            for(int l=0; l<tamanhoDesenho; l++){
                for(int c=0; c<tamanhoDesenho; c++){
                    //linhas do desenho:
                    if(l== qtEspacoRedor*2 + qtCharCaractere || l== qtEspacoRedor*4 + qtCharCaractere*2 + 1
                    || c== qtEspacoRedor*2 + qtCharCaractere || c== qtEspacoRedor*4 + qtCharCaractere*2 + 1){
                        System.out.print('#');
                    }
                    else{
                        System.out.print('*');
                    }
                }

                System.out.println();
            }
        }
    }
    
}