public class TUI implements TabUI{
    private int qtCharCaractere; //quantidade de char de cada caractere para representar X ou O em relacao a linha ou coluna
    private int tamanhoDesenho; //quantidade de caracteres do desenho total

    private final int GROSSURALINHA= 1; //quantidades de caracteres da grossura da linha do desenho
    private final int ESPACO= 1; //quantidade de espaço ao redor do desenho do caractere X ou O
    
    public TUI(){
        qtCharCaractere=5;

        tamanhoDesenho= qtCharCaractere*3 + ESPACO*6 + GROSSURALINHA*2;
    }


    @Override
    public void desenheTabuleiro(char[][] tab) {
        if(tab.length==3 && tab[0].length==3){
            
            for(int l=0; l<tamanhoDesenho; l++){
                for(int c=0; c<tamanhoDesenho; c++){
                    int l1, c1;
                    
                    //relacionando as posicoes do desenho com as posicoes da matriz do tabuleiro
                    if(l>0 && l<6){
                        l1=0;
                    }
                    else if(l>8 && l<14){
                        l1=1;
                    }
                    else{
                        l1=2;
                    }

                    if(c>0 && c<6){
                        c1=0;
                    }
                    else if(c>8 && c<14){
                        c1=1;
                    }
                    else{
                        c1=2;
                    }
                        
                    //linhas do desenho:
                    if(l== ESPACO*2 + qtCharCaractere || l== GROSSURALINHA + ESPACO*4 + qtCharCaractere*2
                    || c== ESPACO*2 + qtCharCaractere || c== ESPACO*4 + qtCharCaractere*2 + 1){
                        System.out.print('#');
                    }

                    //desenhos do caracteres
                    /*else if(
                    l>ESPACO*2+qtCharCaractere*1+GROSSURALINHA*1 && l<ESPACO*3+qtCharCaractere*2+GROSSURALINHA*1 &&  
                    c>ESPACO*0+qtCharCaractere*0+GROSSURALINHA*0 && c<ESPACO*1+qtCharCaractere*1+GROSSURALINHA*0
                    
                    /*
                    000 110 [0]
                    000 110 [0]

                    000 110 [0]
                    211 321 [1]

                    000 110 [0]
                    422 532 [2]


                    000 110[0]   0*2 | 0 | 0  || 0+1+0*1 | 0+1 | 0
                    211 321[1]   1*2 | 1 | 1  || 1+1+1*1 | 1+1 | 1
                    422 532[2]   2*2 | 2 | 2  || 2+1+2*1 | 2+1 | 2

                                 i*2 | i | i  || i*1+i  |  i+1 | i   -> todas posicoes

                     */
                    /*
                    ){

                        System.out.print('*');
                    }
                    */
                    else if(l>ESPACO*(l1*2) + qtCharCaractere*(l1) + GROSSURALINHA*(l1) && l<=ESPACO*(l1*1+l1) + qtCharCaractere*(l1+1)+GROSSURALINHA*(l1) &&  
                    c>ESPACO*(c1*2) + qtCharCaractere*(c1) + GROSSURALINHA*(c1) && c<=ESPACO*(c1*1+c1)+qtCharCaractere*(c1+1)+GROSSURALINHA*(c1)){
                        System.out.print(0);
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