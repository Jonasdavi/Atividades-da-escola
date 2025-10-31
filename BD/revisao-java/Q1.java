import java.util.Scanner;

class Q1{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in); 

        float somaNotas = 0f;
        for(int i=0; i<4; i++){
            System.out.print("Digite a nota do bimestre " + (i+1) + ": ");
            float nota= ler.nextFloat();
            ler.nextLine();
            somaNotas+=nota;
        }
        float media = somaNotas/4;
        System.out.println("Media aritimetica: " + media);
    }
}