import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarando as variáveis e criando as instancias do objetos.
        Scanner menu = new Scanner(System.in);
        int opcao = 0;
        ContaBancaria conta = new ContaCorrente();
        conta.defineInformacoesDoCliente("Marcus Vinicius", "Conta Corrente");
        conta.exibeInformacoes();

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
                    conta.consultaSaldo();
                    break;
                case 2:
                    conta.recebe(menu);
                    break;
                case 3:
                    conta.transfere(menu);
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
