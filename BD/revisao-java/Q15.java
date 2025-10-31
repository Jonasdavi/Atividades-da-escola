import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        // Validação do nome
        do {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = entrada.nextLine().trim();
            if (nome.length() <= 3) {
                System.out.println("❌ Nome inválido! Deve ter mais de 3 caracteres.\n");
            }
        } while (nome.length() <= 3);

        // Validação da idade
        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = entrada.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("❌ Idade inválida! Deve estar entre 0 e 150.\n");
            }
        } while (idade < 0 || idade > 150);

        // Validação do salário
        do {
            System.out.print("Digite o salário (maior que zero): ");
            salario = entrada.nextDouble();
            if (salario <= 0) {
                System.out.println("❌ Salário inválido! Deve ser maior que zero.\n");
            }
        } while (salario <= 0);

        entrada.nextLine(); // Limpar buffer antes de ler strings

        // Validação do sexo
        do {
            System.out.print("Digite o sexo ('f' para feminino ou 'm' para masculino): ");
            sexo = entrada.nextLine().trim().toLowerCase();
            if (!sexo.equals("f") && !sexo.equals("m")) {
                System.out.println("❌ Sexo inválido! Digite apenas 'f' ou 'm'.\n");
            }
        } while (!sexo.equals("f") && !sexo.equals("m"));

        // Validação do estado civil
        do {
            System.out.print("Digite o estado civil ('s' = solteiro, 'c' = casado, 'v' = viúvo, 'd' = divorciado): ");
            estadoCivil = entrada.nextLine().trim().toLowerCase();
            if (!estadoCivil.equals("s") && !estadoCivil.equals("c") && 
                !estadoCivil.equals("v") && !estadoCivil.equals("d")) {
                System.out.println("❌ Estado civil inválido! Digite apenas 's', 'c', 'v' ou 'd'.\n");
            }
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && 
                 !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        // Exibição final
        System.out.println("\n===== Dados Cadastrados =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + String.format("%.2f", salario));
        System.out.println("Sexo: " + (sexo.equals("f") ? "Feminino" : "Masculino"));
        switch (estadoCivil) {
            case "s" -> System.out.println("Estado Civil: Solteiro(a)");
            case "c" -> System.out.println("Estado Civil: Casado(a)");
            case "v" -> System.out.println("Estado Civil: Viúvo(a)");
            case "d" -> System.out.println("Estado Civil: Divorciado(a)");
        }

        entrada.close();
    }
}
