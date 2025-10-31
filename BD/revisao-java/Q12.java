import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = entrada.nextDouble();

        // Cálculo da média
        double media = (nota1 + nota2) / 2.0;

        // Determinação do conceito e da situação
        String conceito, situacao;

        if (media >= 9.0 && media <= 10.0) {
            conceito = "A";
            situacao = "Aprovado com Distinção";
        } else if (media >= 7.5) {
            conceito = "B";
            situacao = "Aprovado";
        } else if (media >= 6.0) {
            conceito = "C";
            situacao = "Aprovado";
        } else if (media >= 4.0) {
            conceito = "D";
            situacao = "Reprovado";
        } else {
            conceito = "E";
            situacao = "Reprovado";
        }

        // Exibição dos resultados
        System.out.println("\n===== Resultado do Aluno =====");
        System.out.println("Nota 1: " + String.format("%.2f", nota1));
        System.out.println("Nota 2: " + String.format("%.2f", nota2));
        System.out.println("Média: " + String.format("%.2f", media));
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);

        entrada.close();
    }
}
