package Decorator.questao2;

public class AdicionaisDecorator implements Cafe{
    Cafe cafe;

    public AdicionaisDecorator(Cafe cafe){
        this.cafe = cafe;
    }

    @Override
    public double custo() {
        return cafe.custo();
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }
}
