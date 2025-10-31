import java.util.Scanner;

/*8. Faça um programa que pergunte quanto você 
ganha por hora e o número de horas trabalhadas no
mês. Calcule e mostre o total do seu salário no 
referido mês, sabendo-se que são descontados 11%
para o Imposto de Renda, 8% para o INSS e 5% para 
o sindicato, faça um programa que nos dê:
a. Salário bruto;
b. Quanto pagou ao INSS;
c. Quanto pagou ao sindicato;
d. O salário líquido. */

public class Q8{
    public static void main(String[] args){
        Scanner ler= new Scanner(System.in); 

        System.out.println("Ganho por hora: ");
        float gHora= ler.nextFloat();
        ler.nextLine();

        System.out.println("Horas trabalhadas: ");
        float hTrabalhadas= ler.nextFloat();
        ler.nextLine();

        float salarioBruto = gHora*hTrabalhadas;

        float descontoIR = 0.11f * salarioBruto;
        float descontoINSS = 0.08f * salarioBruto;
        float descSindicato = 0.05f * salarioBruto;

        float salarioLiquido = salarioBruto-descontoIR-descontoINSS-descSindicato;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Desconto imposto de renda: " + descontoIR);
        System.out.println("Desconto INSS: " + descontoINSS);
        System.out.println("Desconto para o sindicato: " + descSindicato);
        System.out.println("Salario liquido: " + salarioLiquido);
    }
}