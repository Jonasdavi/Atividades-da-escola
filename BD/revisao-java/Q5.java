import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in); 

        System.out.print("Numero inteiro 1: ");
        int primeiro= ler.nextInt();
        ler.nextLine();

        System.out.print("Numero inteiro 2: ");
        float segundo= ler.nextInt();
        ler.nextLine();

        System.out.print("Numero real: ");
        float terceiro = ler.nextFloat();
        ler.nextLine();

        float itemA= primeiro*2 * segundo/2;
        System.out.println("a. O produto do dobro do primeiro com metade do segundo: " + itemA);

        float itemB = primeiro*3 + terceiro;
        System.out.println("b. A soma do triplo do primeiro com o terceiro: " + itemB);

        double itemC = terceiro*terceiro*terceiro;
        System.out.println("c. O terceiro elevado ao cubo: " + itemC);
    }
}