package Decorator.questao1;

public class MassaEspessaPizza implements Pizza{
    @Override
    public double custo() {
        return 60;
    }

    @Override
    public String getDescricao() {
        return "Pizza Massa Espessa";
    }
}
