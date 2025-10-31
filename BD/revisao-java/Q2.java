import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in);
        System.out.print("Raio do circulo em cm: ");
        float raio = ler.nextFloat();
        ler.nextLine();
        float area = 3.14f * raio*raio; //pi * raio²
        System.out.println("Circulo que contem o raio " + raio + "cm tem area " + area + "cm²");
    }
}