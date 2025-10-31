import java.util.Scanner;

/*
 7. João é um pescador. Toda vez que ele traz um 
peso de peixes maior que o estabelecido pelo
regulamento de pesca do seu estado (50 quilos), 
ele deve pagar uma multa de R$ 4,00 por quilo
excedente. João precisa que você faça um programa que 
leia o peso de peixes e diga a quantidade
excedente e o valor da multa para tal quantidade.
*/

public class Q7{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in); 

        System.out.print("kg peixes: ");
        float pesoPeixes= ler.nextFloat();
        ler.nextLine();

        float kgUltrapassados = 0;

        if(pesoPeixes>50){
            kgUltrapassados = pesoPeixes-50;
        }

        float valorMulta= kgUltrapassados*4;

        System.out.println("Multa: " + valorMulta);
        
    }
}