package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    //Nome do banco
    private final String NOME = "Banco Digital Clear";
    private static List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public String getNOME() {
        return this.NOME;
    }

    public static void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void exibirContas() {
        System.out.println("=== Todas as contas cadastradas ===");
        contas.forEach(Conta::informacoesConta);
    }
}
