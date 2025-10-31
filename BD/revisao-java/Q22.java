import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ip;

        while (true) {
            System.out.print("Digite um endereço IP ou 'sair' para encerrar: ");
            ip = entrada.nextLine().trim();

            if (ip.equalsIgnoreCase("sair")) {
                break;
            }

            if (validarIP(ip)) {
                System.out.println("O endereço IP " + ip + " é válido.\n");
            } else {
                System.out.println("O endereço IP " + ip + " é inválido.\n");
            }
        }

        System.out.println("Encerrando o programa...");
        entrada.close();
    }

    // Função que valida o endereço IP
    public static boolean validarIP(String ip) {
        String[] partes = ip.split("\\."); // divide o IP pelos pontos

        if (partes.length != 4) {
            return false; // deve ter exatamente 4 partes
        }

        for (String parte : partes) {
            try {
                int numero = Integer.parseInt(parte);
                if (numero < 0 || numero > 255) {
                    return false; // cada octeto deve estar entre 0 e 255
                }
            } catch (NumberFormatException e) {
                return false; // não é um número válido
            }
        }

        return true; // passou por todas as verificações
    }
}

