import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Informe o tamanho do arquivo para download (em MB): ");
        double tamanhoArquivo = entrada.nextDouble();

        System.out.print("Informe a velocidade do link de Internet (em Mbps): ");
        double velocidadeMbps = entrada.nextDouble();

        // Conversão e cálculo:
        // 1 byte = 8 bits, então dividimos por 8 para converter Mbps → MB/s
        double velocidadeMBps = velocidadeMbps / 8.0;

        // Tempo total em segundos
        double tempoSegundos = tamanhoArquivo / velocidadeMBps;

        // Converter para minutos
        double tempoMinutos = tempoSegundos / 60.0;

        // Saída formatada
        System.out.println("\n=== Resultado ===");
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
        System.out.println("Velocidade do link: " + velocidadeMbps + " Mbps");
        System.out.println("Tempo aproximado de download: " + String.format("%.2f", tempoMinutos) + " minutos");

        entrada.close();
    }
}
