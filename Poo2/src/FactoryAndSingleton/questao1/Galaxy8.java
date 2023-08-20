package FactoryAndSingleton.questao1;

public class Galaxy8 implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("Ligacao Galaxy8");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto Galaxy8");
    }
}
