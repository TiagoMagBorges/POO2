package Decorator.questao2;

public class Chocolate extends AdicionaisDecorator{
    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double custo(){
        return cafe.custo() + 3;
    }

    @Override
    public String getDescricao(){
        return cafe.getDescricao() + " + chocolate";
    }
}
