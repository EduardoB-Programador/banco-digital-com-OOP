package model;

public class Cliente {
    private String nome, endereco, email, telefone;
    private final String CPF;

    public Cliente(String nome, String endereco, String email, String telefone, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.CPF = cpf;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public void alterarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void alterarEmail(String email) {
        this.email = email;
    }

    public void alterarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void exibirInformacoesCliente() {
        System.out.println(
                "=== Informações do cliente ===" +
                        "\nNome: " + this.nome +
                        "\nEndereço: " + this.endereco +
                        "\nEmail: " + this.email +
                        "\nNúmero de Telefone: " + this.telefone +
                        "\nCPF: " + this.CPF
        );
    }
}
