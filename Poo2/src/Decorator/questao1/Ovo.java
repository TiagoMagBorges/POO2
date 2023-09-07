package Decorator.questao1;

public class Ovo extends ToppingDecorator{
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo(){
        return pizza.custo() + 2;
    }

    @Override
    public String getDescricao() {
        return pizza.getDescricao() + " + ovo";
    }
}
