package FacadeProxy.questao2;

public class Porta {
    private boolean trancada;

    public void trancar(){
        System.out.println("Porta trancada");
        this.trancada = true;
    }

    public void destrancar(){
        System.out.println("Porta destrancada");
        this.trancada = false;
    }
}
