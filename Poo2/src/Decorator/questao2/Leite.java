package Decorator.questao2;

public class Leite extends AdicionaisDecorator{
    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double custo(){
        return cafe.custo() + 1;
    }

    @Override
    public String getDescricao(){
        return cafe.getDescricao() + " + leite";
    }
}
