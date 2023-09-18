package FacadeProxy.questao1;

public class PlayerStreaming {
    private boolean ligado;
    public void liga(){
        System.out.println("Player ligado");
        this.ligado = true;
    }

    public void desliga(){
        System.out.println("Player desligado");
        this.ligado = false;
    }

    public void playFilme(){
        System.out.println("Play no filme");
    }
}
