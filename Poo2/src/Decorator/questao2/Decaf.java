package Decorator.questao2;

public class Decaf implements Cafe{
    @Override
    public double custo() {
        return 3;
    }

    @Override
    public String getDescricao() {
        return "Cafe descafeinado";
    }
}
