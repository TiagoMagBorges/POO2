package Wrapper.questao1;

public class PatoDomestico implements Pato{
    @Override
    public void voar() {
        System.out.println("Pato Voando");
    }

    @Override
    public void grasnar() {
        System.out.println("Pato Grasnando");
    }
}
