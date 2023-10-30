package StrategyAndVisitor.questao3;

import java.util.Date;

public class Onibus extends Veiculo{
    private Pessoa dono;
    private int qtdLugares;
    private String anoFabricacao;

    public Onibus(Pessoa dono, int qtdLugares, String anoFabricacao) {
        this.dono = dono;
        this.qtdLugares = qtdLugares;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void avisarDono(String msg){
        this.dono.receberMensagem(msg);
    }
}
