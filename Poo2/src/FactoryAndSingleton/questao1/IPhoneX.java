package FactoryAndSingleton.questao1;

public class IPhoneX implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("Ligacao IPhoneX");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto IPhoneX");
    }
}
