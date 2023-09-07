package Decorator.questao1;

public class Tomate extends ToppingDecorator{
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo(){
        return pizza.custo() + 2;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " + tomate";
    }
}
