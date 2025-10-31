import java.util.Scanner;

public class Q6{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in); 
        System.out.print("Altura (Metros): ");
        float altura = ler.nextFloat();
        float pesoIdeal = 72.7f * altura - 58;
        System.out.println("Peso ideal: " + pesoIdeal);
    }
}