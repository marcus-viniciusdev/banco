import java.util.Scanner;

public class ContaBancaria {
    //Declarando variáveis
    private String cliente;
    private String tipoConta;
    protected double saldo;

    public void defineInformacoesDoCliente(String cliente, String tipoConta){
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    public void exibeInformacoes(){
        //Exibindo as informações do cliente.
        System.out.println("**************************************************");
        System.out.println("Dados do cliente:");
        System.out.println(String.format("\nNome:              %s", cliente));
        System.out.println(String.format("Tipo de conta:     %s", tipoConta));
        System.out.println(String.format("Saldo do cliente:  R$%.2f", saldo));
        System.out.println("**************************************************");
    }

    public void consultaSaldo(){
        //Primeira opção, exibe o saldo do cliente.
        System.out.println(String.format("\nO saldo atual é R$%.2f", saldo));
    }

    public void recebe(Scanner menu){
        //Segunda opção, aumenta o saldo do cliente de acordo com o valor da transferência.
        System.out.print("Informe o valor a receber: ");
        double valorReceber = menu.nextDouble();
        saldo += valorReceber;
        System.out.println(String.format("Saldo atualizado R$%.2f", saldo));
    }

    public void transfere(Scanner menu){
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
    }
}
