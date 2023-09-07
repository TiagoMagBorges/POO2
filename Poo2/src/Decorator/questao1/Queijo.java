package Decorator.questao1;

public class Queijo extends ToppingDecorator{
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo(){
        return pizza.custo() + 5;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " + queijo";
    }
}
