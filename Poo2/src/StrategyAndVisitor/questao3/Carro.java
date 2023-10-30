package StrategyAndVisitor.questao3;

public class Carro extends Veiculo{
    private Pessoa dono;
    private String cor;
    private String marca;
    private String modelo;

    public Carro(Pessoa dono, String cor, String marca, String modelo) {
        this.dono = dono;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void avisarDono(String msg){
        this.dono.receberMensagem(msg);
    }
}
