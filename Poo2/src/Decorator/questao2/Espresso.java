package Decorator.questao2;

public class Espresso implements Cafe{
    @Override
    public double custo() {
        return 5;
    }

    @Override
    public String getDescricao() {
        return "Cafe expresso";
    }
}
