package Decorator.questao2;

public class Canela extends AdicionaisDecorator{
    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double custo(){
        return cafe.custo() + 2;
    }

    @Override
    public String getDescricao(){
        return cafe.getDescricao() + " + canela";
    }
}
