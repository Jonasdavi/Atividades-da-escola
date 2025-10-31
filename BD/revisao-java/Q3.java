import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in); 
        System.out.print("Ganho por hora: ");
        float ganhoHora = ler.nextFloat();
        ler.nextLine();
        System.out.print("Horas trabalhadas no mes: ");
        float horasMes = ler.nextFloat();
        ler.nextLine();
        float salario = ganhoHora*horasMes;
        System.out.println("Salario deste mes referido: " + salario);
    }
}