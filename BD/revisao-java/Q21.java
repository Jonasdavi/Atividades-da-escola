import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String data;

        while (true) {
            System.out.print("Digite uma data (DD/MM/AAAA) ou 'sair' para encerrar: ");
            data = entrada.nextLine().trim();

            if (data.equalsIgnoreCase("sair")) {
                break;
            }

            String dataFormatada = converterData(data);
            System.out.println("Data formatada: " + dataFormatada + "\n");
        }

        System.out.println("Encerrando o programa...");
        entrada.close();
    }

    // Função que converte data para DD de MêsPorExtenso de AAAA
    public static String converterData(String data) {
        String[] partes = data.split("/"); // separa dia, mês e ano
        String dia = partes[0];
        int mes = Integer.parseInt(partes[1]);
        String ano = partes[2];

        String mesExtenso = "";

        switch (mes) {
            case 1 -> mesExtenso = "Janeiro";
            case 2 -> mesExtenso = "Fevereiro";
            case 3 -> mesExtenso = "Março";
            case 4 -> mesExtenso = "Abril";
            case 5 -> mesExtenso = "Maio";
            case 6 -> mesExtenso = "Junho";
            case 7 -> mesExtenso = "Julho";
            case 8 -> mesExtenso = "Agosto";
            case 9 -> mesExtenso = "Setembro";
            case 10 -> mesExtenso = "Outubro";
            case 11 -> mesExtenso = "Novembro";
            case 12 -> mesExtenso = "Dezembro";
            default -> mesExtenso = "Mês inválido";
        }

        return dia + " de " + mesExtenso + " de " + ano;
    }
}
