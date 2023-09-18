package FacadeProxy.questao1;

public class Projetor {
    private boolean ligado;
    public void liga(){
        System.out.println("Projetor ligado");
        this.ligado = true;
    }

    public void desliga(){
        System.out.println("Projetor desligado");
        this.ligado = false;
    }
}
