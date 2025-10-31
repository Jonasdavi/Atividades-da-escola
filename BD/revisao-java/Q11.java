import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o salário atual do colaborador: R$ ");
        double salario = entrada.nextDouble();

        double percentualAumento;

        // Determina o percentual conforme a faixa salarial
        if (salario <= 280.0) {
            percentualAumento = 20.0;
        } else if (salario <= 700.0) {
            percentualAumento = 15.0;
        } else if (salario <= 1500.0) {
            percentualAumento = 10.0;
        } else {
            percentualAumento = 5.0;
        }

        // Calcula o aumento e o novo salário
        double valorAumento = salario * (percentualAumento / 100);
        double novoSalario = salario + valorAumento;

        // Exibe os resultados
        System.out.println("\n===== Reajuste Salarial - Organizações Tabajara =====");
        System.out.println("Salário antes do reajuste: R$ " + String.format("%.2f", salario));
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + String.format("%.2f", valorAumento));
        System.out.println("Novo salário após o aumento: R$ " + String.format("%.2f", novoSalario));

        entrada.close();
    }
}
