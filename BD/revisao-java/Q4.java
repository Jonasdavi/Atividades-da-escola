import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in); 
        System.out.print("Farenheit: ");
        float farenheit= ler.nextFloat();
        ler.nextLine();
        float ceusius = 5*(farenheit - 32)/9;
        System.out.println(farenheit + " fareinheits equivale a " + ceusius + "°C");
    }
}