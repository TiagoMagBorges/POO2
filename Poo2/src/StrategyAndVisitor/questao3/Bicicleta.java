package StrategyAndVisitor.questao3;

public class Bicicleta extends Veiculo{
    private String cor;
    private Pessoa dono;

    public Bicicleta(Pessoa dono, String cor) {
        this.cor = cor;
        this.dono = dono;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void avisarDono(String msg){
        this.dono.receberMensagem(msg);
    }
}
