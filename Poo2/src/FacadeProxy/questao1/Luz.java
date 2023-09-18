package FacadeProxy.questao1;

public class Luz {
    private boolean ligada;
    public void liga(){
        System.out.println("Luz ligada");
        this.ligada = true;
    }

    public void desliga(){
        System.out.println("Luz desligada");
        this.ligada = false;
    }
}
