package FacadeProxy.questao1;

public class Telao {
    private boolean abaixado;

    public void abaixa(){
        System.out.println("Abaixando o telao");
        abaixado = true;
    }

    public void sobe(){
        System.out.println("Subindo o telao");
        abaixado = false;
    }
}
