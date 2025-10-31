import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro N: ");
        int n = entrada.nextInt();

        System.out.println("\nSaída solicitada:");
        imprimirTriangulo(n);

        entrada.close();
    }

    // Função que imprime até a N-ésima linha
    public static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
