package FacadeProxy.questao2;

public class Motor {
    private boolean ligado;

    public void ligar(){
        System.out.println("Motor ligado");
        this.ligado = true;
    }

    public void desligar(){
        System.out.println("Motor desligado");
        this.ligado = false;
    }
}
