import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe a quantidade de morangos (em Kg): ");
        double kgMorangos = entrada.nextDouble();

        System.out.print("Informe a quantidade de maçãs (em Kg): ");
        double kgMacas = entrada.nextDouble();

        // Definição dos preços por Kg
        double precoMorango;
        double precoMaca;

        if (kgMorangos <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMacas <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        // Cálculo dos subtotais
        double totalMorango = kgMorangos * precoMorango;
        double totalMaca = kgMacas * precoMaca;
        double totalCompra = totalMorango + totalMaca;

        // Verifica se há desconto
        double pesoTotal = kgMorangos + kgMacas;
        double desconto = 0.0;

        if (pesoTotal > 8 || totalCompra > 25.0) {
            desconto = totalCompra * 0.10; // 10% de desconto
            totalCompra -= desconto;
        }

        // Exibição dos resultados
        System.out.println("\n===== Resumo da Compra =====");
        System.out.println("Morango: " + kgMorangos + " Kg x R$ " + String.format("%.2f", precoMorango) + " = R$ " + String.format("%.2f", totalMorango));
        System.out.println("Maçã: " + kgMacas + " Kg x R$ " + String.format("%.2f", precoMaca) + " = R$ " + String.format("%.2f", totalMaca));
        System.out.println("Peso total: " + String.format("%.2f", pesoTotal) + " Kg");
        System.out.println("Valor bruto: R$ " + String.format("%.2f", (totalMorango + totalMaca)));
        System.out.println("Desconto aplicado: R$ " + String.format("%.2f", desconto));
        System.out.println("Valor final a pagar: R$ " + String.format("%.2f", totalCompra));

        entrada.close();
    }
}
