import java.util.Scanner;

public class TUI extends Calculadora implements CalcUI {
    private Calculadora calculadora;
    private Scanner ler=new Scanner(System.in);
    private double resultado=0;

    private final int MENUINICIAL= 0;
    private final int MENUN1= 1;
    private final int MENUN2= 2;
    private final int MENURESULTADO= 3;


    private char[][] matriz;

    public TUI() {
        this.calculadora = new Calculadora();

        // tamanho da matriz
        int linhas = 16; // linhas
        int colunas = 21; // colunas

        // criando a matriz
        matriz = new char[linhas][colunas];

        // iniciando desenho da calculadora e display
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                //definindo borda da calculadora
                if(i==0 || i==linhas-1 || j==0 || j==colunas-1){
                    matriz[i][j]= '#';
                }
                //definindo display
                else if(((i==2 || i==5) && j>=2 && j<=colunas-3) //linha horizontal de *
                || ((i>2 && i<5) && (j==2 || j==colunas-3))){ //linha vertical de *
                    matriz[i][j]= '*';
                }
                else{
                    matriz[i][j]= ' ';
                }
            }
        }

        /*
        // adicionando as bordas da matriz
        for (int i = 0; i < colunas; i++) {
            matriz[0][i] = '#'; // ínicio
            matriz[linhas - 1][i] = '#'; // final
        }
        for (int i = 0; i < linhas ; i++) {
            matriz[i][0] = '#'; //esquerdo
            matriz[i][colunas - 1] = '#'; //direito
        }

        // linha de asteriscos do display
        for (int j = 2; j < colunas - 2; j++) {
            matriz[2][j] = '*'; // superior
            matriz[5][j] = '*'; // inferior
        }
      //esquerda
        matriz[3][2]='*'; 
        matriz[4][2]='*';
        
      //direita
        matriz[3][18]='*';
        matriz[4][18]='*';
    */

        // opções do menu na matriz
        String[] opcoes = {
            "Operacao: ",
            "1 - Entrar dados",
            "2 - Somar",
            "3 - Subtrair",
            "4 - Multiplicação",
            "5 - Divisão",
            "6 - Sair"
        };

        // inserindo as opções pulando uma linha abaixo da linha de asteriscos
        int opcaoInicialLinha = 7;
        for (int i = 0; i < opcoes.length; i++) {
            for (int j = 0; j < opcoes[i].length(); j++) {
                matriz[opcaoInicialLinha + i][2 + j] = opcoes[i].charAt(j); // Preenchendo com opções
            }
            
        }



    }
    


    public void exibirMenu() {
        // Exibindo a matriz formatada
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    public void execGui() {
        boolean continuar = true;
        atualizarDisplay(MENUINICIAL);

        while (continuar) {
            
            exibirMenu();
            System.out.print("-> ");

            int operacao = ler.nextInt();

            if (operacao == 6) {
                continuar = false;
                System.out.println("Saindo...");
                continue;
            }
            else if (operacao == 1) {
                calculadora.setValor1(0);
                calculadora.setValor2(0);

                this.atualizarDisplay(MENUN1);
                this.exibirMenu();
                System.out.print("Op1: ");
                calculadora.setValor1(ler.nextDouble());
                
                this.atualizarDisplay(MENUN1);
                this.exibirMenu();
                System.out.print("Op2: ");
                calculadora.setValor2(ler.nextDouble());

                this.atualizarDisplay(MENUN2);
                

            } 
            else {
                calculadora.setOperacao(operacao-1);
                calculadora.realizarOperacao();
                
                if(operacao >= 2 && operacao <=5){
                    this.atualizarDisplay(MENURESULTADO);
                    this.exibirMenu();
                }
                
            }
            
        }


    }

    public void atualizarDisplay(int menu){
        this.limparDisplay();
        String textoL1="", textoL2="";

        if(menu==MENUINICIAL){
            textoL1= "Qual Opcao?";
            textoL2= "";
        }
        else if(menu==MENUN1){
            textoL1= "Op1: " + (calculadora.getValor1()!=0? String.valueOf(calculadora.getValor1()) : "");
            textoL2= "Op2: " + (calculadora.getValor2()!=0? String.valueOf(calculadora.getValor2()) : "");;
        }
        else if(menu==MENUN2){
            textoL1= "Op2: " + String.valueOf(calculadora.getValor2());
            textoL2= "Nova opcao?";
        }
        else if(menu==MENURESULTADO){
            textoL1= "Ans: " + String.valueOf(calculadora.getResultado());
            textoL2= "Nova opcao?";
        }
        //textoL1="qual opcao?abcde";

        //verificar se o tamanho do texto nao extrapola a largura do display
        int LIMITECHARDISPLAY= 15;
        if(textoL1.length() > LIMITECHARDISPLAY){
            //excluir os caracteres da esquerda apos o limite suportado pelo display
            textoL1= textoL1.substring(0, LIMITECHARDISPLAY);
        }
        if(textoL2.length() > LIMITECHARDISPLAY){
            //excluir os caracteres da esquerda apos o limite suportado pelo display
            textoL2= textoL2.substring(0, LIMITECHARDISPLAY);
        }

        //atualizar display conforme o texto l1 e l2
        for (int i=textoL1.length()-1 ; i>=0 ; i--) {
            matriz[3][matriz[0].length-3 - (textoL1.length()-i)]= textoL1.charAt(i);
        }
        for (int i=textoL2.length()-1 ; i>=0 ; i--) {
            matriz[4][matriz[0].length-3 - (textoL2.length()-i)]= textoL2.charAt(i);
        }



    }

    public void limparDisplay(){
        for (int c=3 ; c<matriz[0].length-3 ; c++) {
            matriz[3][c]=' ';
            matriz[4][c]=' ';
        }
        
    }


    public static void main(String[] args) {
        TUI tui = new TUI();
        tui.execGui();
    }

}