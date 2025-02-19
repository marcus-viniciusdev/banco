import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        String cliente = "Marcus Vinicius";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int opcao = 0;

        System.out.println("**************************************************");
        System.out.println("Dados do cliente:");
        System.out.println(String.format("\nNome:              %s", cliente));
        System.out.println(String.format("Tipo de conta:     %s", tipoConta));
        System.out.println(String.format("Saldo do cliente:  R$%.2f", saldo));
        System.out.println("**************************************************");

        while (opcao != 4){
            System.out.println("\nOperação");

            System.out.println("\n1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = menu.nextInt();

            switch (opcao){
                case 1:
                    System.out.println(String.format("\nO saldo atual é R$%.2f", saldo));
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: ");
                    double valorReceber = menu.nextDouble();
                    saldo += valorReceber;
                    System.out.println(String.format("Saldo atualizado R$%.2f", saldo));
                    break;
                case 3:
                    System.out.print("Informe o valor a transferir: ");
                    double valorTransferir = menu.nextDouble();
                    if (valorTransferir <= saldo) {
                        saldo -= valorTransferir;
                        System.out.println(String.format("Saldo atualizado R$%.2f", saldo));
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferência");
                    }
                    break;
                case 4:
                    System.out.println("\nPrograma encerrado");
                    break;
                default:
                    System.out.println("\nOpção inválida");
            }
        }
    }
}
