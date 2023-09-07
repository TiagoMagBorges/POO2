package Decorator.questao1;

public class MassaFinaPizza implements Pizza{
    @Override
    public double custo() {
        return 50;
    }

    @Override
    public String getDescricao() {
        return "Pizza Massa Fina";
    }
}
