import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        //Declarando variáveis.
        Scanner menu = new Scanner(System.in);
        String cliente = "Marcus Vinicius";
        String tipoConta = "Corrente";
        double saldo = 2500.0;
        int opcao = 0;

        //Exibindo as informações do cliente.
        System.out.println("**************************************************");
        System.out.println("Dados do cliente:");
        System.out.println(String.format("\nNome:              %s", cliente));
        System.out.println(String.format("Tipo de conta:     %s", tipoConta));
        System.out.println(String.format("Saldo do cliente:  R$%.2f", saldo));
        System.out.println("**************************************************");

        //Loop do menu que só acaba se a opção de sair(4) seja escolhida.
        while (opcao != 4){
            //Exibindo as opções do menu.
            System.out.println("\nOperação");

            System.out.println("\n1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = menu.nextInt();

            //Switch case para cada opção do menu.
            switch (opcao){
                case 1:
                    //Primeira opção, exibe o saldo do cliente.
                    System.out.println(String.format("\nO saldo atual é R$%.2f", saldo));
                    break;
                case 2:
                    //Segunda opção, aumenta o saldo do cliente de acordo com o valor da transferência.
                    System.out.print("Informe o valor a receber: ");
                    double valorReceber = menu.nextDouble();
                    saldo += valorReceber;
                    System.out.println(String.format("Saldo atualizado R$%.2f", saldo));
                    break;
                case 3:
                    //Terceira opção, diminui o saldo do cliente de acordo com o valor da transferência,
                    //mas limitando o valor máximo da transferência pelo próprio saldo.
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
                    //Quarta opção, exibe uma mensagem de encerramento de programa.
                    System.out.println("\nPrograma encerrado");
                    break;
                default:
                    //Qual quer outra opção dá erro e volta ao menu
                    System.out.println("\nOpção inválida");
            }
        }
    }
}
