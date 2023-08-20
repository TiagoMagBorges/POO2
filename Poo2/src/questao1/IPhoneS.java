package questao1;

public class IPhoneS implements Celular{
    @Override
    public void fazLigacao() {
        System.out.println("Ligacao IPhoneS");
    }

    @Override
    public void tiraFoto() {
        System.out.println("Foto IPhoneS");
    }
}
