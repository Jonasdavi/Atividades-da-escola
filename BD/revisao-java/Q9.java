import java.util.Scanner;

public class Q9{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o tamanho da área a ser pintada (em m²): ");
        double area = entrada.nextDouble();

        // Cálculos
        double litrosNecessarios = area / 3.0; // 1 litro cobre 3 m²
        double capacidadeLata = 18.0;
        double precoLata = 80.0;

        // Arredonda para cima o número de latas (não pode comprar meia lata)
        int latas = (int) Math.ceil(litrosNecessarios / capacidadeLata);
        double precoTotal = latas * precoLata;

        // Saída
        System.out.println("\n=== Resultado ===");
        System.out.println("Área a ser pintada: " + area + " m²");
        System.out.println("Litros necessários: " + String.format("%.2f", litrosNecessarios));
        System.out.println("Latas de tinta a serem compradas: " + latas);
        System.out.println("Preço total: R$ " + String.format("%.2f", precoTotal));

        entrada.close();
    }
}
