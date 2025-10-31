import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome do atleta (ou ENTER para encerrar): ");
            String nome = entrada.nextLine().trim();

            if (nome.isEmpty()) {
                break; // encerra o programa
            }

            double[] saltos = new double[5];
            double soma = 0;

            // Entrada dos cinco saltos
            for (int i = 0; i < 5; i++) {
                System.out.printf("Digite a distância do %dº salto (em metros): ", i + 1);
                saltos[i] = entrada.nextDouble();
                soma += saltos[i];
            }

            // Limpar buffer antes de ler o próximo nome
            entrada.nextLine();

            double media = soma / 5.0;

            // Exibição do resultado
            System.out.println("\nResultado:");
            System.out.println("Atleta: " + nome);
            System.out.print("Saltos: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(saltos[i]);
                if (i < 4) {
                    System.out.print(" - ");
                }
            }
            System.out.printf("\nMédia dos saltos: %.1f metros\n", media);
            System.out.println("-------------------------------------");
        }

        System.out.println("Encerrando o programa...");
        entrada.close();
    }
}
