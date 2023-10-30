package StrategyAndVisitor.questao3;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void receberMensagem(String msg){
        System.out.printf("%s recebeu a mensagem: %s\n", this.getNome(), msg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
