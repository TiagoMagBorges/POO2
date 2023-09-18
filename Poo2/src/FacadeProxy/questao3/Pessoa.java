package FacadeProxy.questao3;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString(){
        return String.format("Nome: %s\nCPF: %s\nIdade: %d", getNome(), getCpf(), getIdade());
    }
}
