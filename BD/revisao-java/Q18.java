import java.util.ArrayList;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double valor;

        System.out.println("Digite as notas (-1 para encerrar):");

        // Leitura das notas
        while (true) {
            System.out.print("Nota: ");
            valor = entrada.nextDouble();

            if (valor == -1) {
                break;
            }

            notas.add(valor);
        }

        // a. Quantidade de valores lidos
        int quantidade = notas.size();
        System.out.println("\nQuantidade de valores lidos: " + quantidade);

        // b. Exibir valores na ordem informada
        System.out.print("Valores na ordem informada: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();

        // c. Exibir valores na ordem inversa
        System.out.println("Valores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        // d. Calcular média aritmética
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = (quantidade > 0) ? soma / quantidade : 0;
        System.out.printf("Média aritmética: %.2f\n", media);

        // e. Quantidade acima da média
        int acimaMedia = 0;
        int abaixoMedia = 0;
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            }
        }
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);

        // f. Quantidade abaixo da média
        System.out.println("Quantidade de valores abaixo da média: " + abaixoMedia);

        entrada.close();
    }
}
