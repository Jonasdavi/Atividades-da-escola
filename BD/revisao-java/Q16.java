import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int n = entrada.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = entrada.nextInt();

            while (idade < 0 || idade > 150) {
                System.out.println("❌ Idade inválida! Digite novamente (0 a 150).");
                System.out.print("Digite a idade da pessoa " + i + ": ");
                idade = entrada.nextInt();
            }

            somaIdades += idade;
        }

        double media = (double) somaIdades / n;
        System.out.printf("\nMédia de idade do grupo: %.2f\n", media);

        if (media >= 0 && media <= 25) {
            System.out.println("Classificação do grupo: 🧒 Jovem");
        } else if (media <= 60) {
            System.out.println("Classificação do grupo: 👨 Adulto");
        } else {
            System.out.println("Classificação do grupo: 👴 Idoso");
        }

        entrada.close();
    }
}
