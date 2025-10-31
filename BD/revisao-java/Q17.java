import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total = 0.0;
        int codigo, quantidade;

        System.out.println("====== CARDÁPIO ======");
        System.out.println("100 - Cachorro-quente  -> R$ 1,20");
        System.out.println("101 - Bauru simples     -> R$ 1,30");
        System.out.println("102 - Bauru com ovo     -> R$ 1,50");
        System.out.println("103 - Hambúrguer        -> R$ 1,20");
        System.out.println("104 - Cheeseburguer     -> R$ 1,30");
        System.out.println("105 - Refrigerante      -> R$ 1,00");
        System.out.println("Digite 0 para encerrar o pedido.");
        System.out.println("========================\n");

        while (true) {
            System.out.print("Informe o código do produto: ");
            codigo = entrada.nextInt();

            if (codigo == 0) {
                break; // encerra o pedido
            }

            System.out.print("Informe a quantidade: ");
            quantidade = entrada.nextInt();

            double preco = 0.0;
            String produto = "";

            switch (codigo) {
                case 100:
                    produto = "Cachorro-quente";
                    preco = 1.20;
                    break;
                case 101:
                    produto = "Bauru simples";
                    preco = 1.30;
                    break;
                case 102:
                    produto = "Bauru com ovo";
                    preco = 1.50;
                    break;
                case 103:
                    produto = "Hambúrguer";
                    preco = 1.20;
                    break;
                case 104:
                    produto = "Cheeseburguer";
                    preco = 1.30;
                    break;
                case 105:
                    produto = "Refrigerante";
                    preco = 1.00;
                    break;
                default:
                    System.out.println("❌ Código inválido! Tente novamente.");
                    continue;
            }

            double subtotal = preco * quantidade;
            total += subtotal;

            System.out.printf("%d x %s = R$ %.2f\n\n", quantidade, produto, subtotal);
        }

        System.out.println("========================");
        System.out.printf("Valor total do pedido: R$ %.2f\n", total);
        System.out.println("Obrigado pela preferência!");
        System.out.println("========================");

        entrada.close();
    }
}
