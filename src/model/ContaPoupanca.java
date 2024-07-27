package model;

public class ContaPoupanca extends Conta {
    //Rendimento mensal do dinheiro
    private final double RENDIMENTO = 0.01;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    //Rendimento baseado em juros compostos em cima do dinheiro disponível na conta
    public void renderDinheiro(int meses) {
        double dinheiroRendido = (this.getSaldo() * Math.pow((1 + RENDIMENTO), meses)) - this.getSaldo();

        this.depositar(dinheiroRendido);
    }

    public double getRENDIMENTO() {
        return RENDIMENTO;
    }

    @Override
    public void informacoesConta() {
        System.out.println("=== Informações da conta poupança ===");
        super.informacoesConta();

    }

}
