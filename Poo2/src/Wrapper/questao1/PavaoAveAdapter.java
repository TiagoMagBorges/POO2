package Wrapper.questao1;

public class PavaoAveAdapter implements Ave{
    Pavao pavao;

    public PavaoAveAdapter(Pavao pavao){
        this.pavao = pavao;
    }

    @Override
    public void voar() {
        System.out.println("Pavao nao voa");
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }
}
