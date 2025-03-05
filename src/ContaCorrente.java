import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
    //Declarando a taxa.
    private double taxaTarifa = 0.001;

    //Calculando a tarifa a ser paga deacordo com o valor da transferência.
    public double calculaTarifa(double valorTransferencia){
        return valorTransferencia * taxaTarifa;
    }

    //Método para cobrar a tarifa.
    public void cobrarTarifa(double valorTransferencia) {
        double tarifa = valorTransferencia * taxaTarifa;
        saldo -= tarifa;
        System.out.println(String.format("Tarifa cobrada: R$%.2f", tarifa));
    }

    //Sobreescrevendo o método de transferência para cobrar a tarifa.
    @Override
    public void transfere(Scanner menu) {
        //Terceira opção, diminui o saldo do cliente de acordo com o valor da transferência,
        //mas limitando o valor máximo da transferência pelo próprio saldo.
        System.out.print("Informe o valor a transferir: ");
        double valorTransferir = menu.nextDouble();
        if ((valorTransferir + calculaTarifa(valorTransferir)) <= saldo) {
            saldo -= valorTransferir;
            cobrarTarifa(valorTransferir);
            System.out.println(String.format("Saldo atualizado R$%.2f", saldo));
        } else {
            System.out.println("Não há saldo suficiente para fazer essa transferência");
        }
    }
}
