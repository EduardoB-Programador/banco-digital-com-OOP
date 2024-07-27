package model;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    //Transferir na conta corrente não só transfere como tambem realiza pagamento
    public void pagar(double valor, Conta conta) {

        if (conta instanceof ContaCorrente) {
            super.transferir(valor, conta);

        } else {
            System.out.println("A conta destino não recebe pagamento.");

        }

    }

    @Override
    public void informacoesConta() {
        System.out.println("=== Informações da conta corrente ===");
        super.informacoesConta();

    }

}
