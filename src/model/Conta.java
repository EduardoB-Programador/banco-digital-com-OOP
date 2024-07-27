package model;

import java.util.Random;

public abstract class Conta {
    private static int id = 1;
    private final Cliente cliente;
    private final int numeroConta;
    private double saldo;
    private String numeroAgencia;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.numeroConta = id++;
        this.numeroAgencia = "0001";

        Banco.adicionarConta(this);
    }

    public void depositar(double quantidade) {
        this.saldo += quantidade;

        exibirSaldoAtual();
    }

    public boolean sacar(double quantidade) {
        if (this.saldo >= quantidade) {
            this.saldo -= quantidade;
            exibirSaldoAtual();

            return true;
        } else {
            System.out.println("Não há saldo o suficiente.");
            exibirSaldoAtual();

            return false;
        }

    }

    public void transferir(double quantidade, Conta conta) {
        if (this.sacar(quantidade))
            conta.depositar(quantidade);

    }

    public void trocarAgencia() {
        this.numeroAgencia = gerarNumeroAgencia();

    }

    private String gerarNumeroAgencia() {
        Random numero = new Random();

        String numeroNovo = Integer.toString(numero.nextInt(1, 1000));

        if (numeroNovo.length() == 1) {
            return "000" + numeroNovo;
        } else if (numeroNovo.length() == 2) {
            return "00" + numeroNovo;
        } else if (numeroNovo.length() == 3) {
            return "0" + numeroNovo;
        } else {
            return numeroNovo;
        }

    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirInformacoesCliente() {
        cliente.exibirInformacoesCliente();
    }

    public void exibirSaldoAtual() {
        System.out.println("O saldo atual disponível na conta é: " + this.saldo);
    }

    public void informacoesConta() {
        System.out.println(
                "Numero da Conta: " + numeroConta +
                        "\nNumero da Agência: " + this.numeroAgencia +
                        "\nSaldo da Conta: " + this.saldo);

        exibirInformacoesCliente();

        System.out.println("\n\n");
    }

}
