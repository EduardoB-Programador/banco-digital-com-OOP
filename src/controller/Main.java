package controller;

import model.*;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        //Criando clientes
        Cliente cliente1 = new Cliente("Luiz Augusto", "Rua 1", "luiz123@gmail.com", "123456789", "123.456.789.00");
        Cliente cliente2 = new Cliente("Bárbara Luz", "Rua 2", "barbara123@gmail.com", "987654321", "987.654.321.11");
        Cliente cliente3 = new Cliente("Marcos Souza", "Rua 3", "marcos123@gmail.com", "987654123", "654.987.321.22");
        Cliente cliente4 = new Cliente("Lívia Macedo", "Rua 4", "livia123@gmail.com", "123987456", "789.456.123.33");

        //Criando contas correntes
        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2);
        ContaCorrente contaCorrente3 = new ContaCorrente(cliente3);
        ContaCorrente contaCorrente4 = new ContaCorrente(cliente4);

        banco.exibirContas();

        //Criando contas poupanças
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(cliente4);

        banco.exibirContas();

        //Depositando nas contas correntes
        contaCorrente1.depositar(4400);
        contaCorrente2.depositar(2100);
        contaCorrente3.depositar(200);
        contaCorrente4.depositar(150);

        //Depositando nas contas poupanças
        contaPoupanca1.depositar(400);
        contaPoupanca2.depositar(3000);

        //Sacando das contas correntes
        contaCorrente1.sacar(100);
        contaCorrente3.sacar(400);

        //Sacando de uma conta poupança
        contaPoupanca1.sacar(150);

        //Transferindo das contas correntes para outras contas
        contaCorrente1.transferir(400, contaCorrente4);
        contaPoupanca2.transferir(1000, contaCorrente4);

        //Trocando agência
        contaCorrente1.trocarAgencia();
        contaPoupanca1.trocarAgencia();

        banco.exibirContas();

        //Pagando para outras contas
        contaCorrente1.pagar(300, contaCorrente3);
        contaCorrente2.pagar(1500, contaCorrente1);
        contaCorrente2.pagar(1000, contaPoupanca2);

    }
}
