package Wrapper.questao1;

public class PatoAveAdapter implements Ave{
    Pato pato;

    public PatoAveAdapter(Pato pato){
        this.pato = pato;
    }

    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
    pato.grasnar();
    }
}
