import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int respostasPositivas = 0;
        String resposta;

        System.out.println("Responda com 's' para sim ou 'n' para não.\n");

        System.out.print("Telefonou para a vítima? ");
        resposta = entrada.nextLine().trim().toLowerCase();
        if (resposta.equals("s")) respostasPositivas++;

        System.out.print("Esteve no local do crime? ");
        resposta = entrada.nextLine().trim().toLowerCase();
        if (resposta.equals("s")) respostasPositivas++;

        System.out.print("Mora perto da vítima? ");
        resposta = entrada.nextLine().trim().toLowerCase();
        if (resposta.equals("s")) respostasPositivas++;

        System.out.print("Devia para a vítima? ");
        resposta = entrada.nextLine().trim().toLowerCase();
        if (resposta.equals("s")) respostasPositivas++;

        System.out.print("Já trabalhou com a vítima? ");
        resposta = entrada.nextLine().trim().toLowerCase();
        if (resposta.equals("s")) respostasPositivas++;

        // Classificação final
        String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        // Resultado
        System.out.println("\n===== Resultado =====");
        System.out.println("Respostas positivas: " + respostasPositivas);
        System.out.println("Classificação: " + classificacao);

        entrada.close();
    }
}
