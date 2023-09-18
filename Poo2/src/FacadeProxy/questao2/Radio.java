package FacadeProxy.questao2;

public class Radio {
    private boolean ligado;

    public void ligar(){
        System.out.println("Radio ligado");
        this.ligado = true;
    }

    public void desligar(){
        System.out.println("Radio desligado");
        this.ligado = false;
    }

    public void sintonizar(){
        System.out.println("Radio sintonizado");
    }
}
