package FacadeProxy.questao2;

public class CarFacade {
    private CintoSeguranca cintoSeguranca;
    private Farol farol;
    private Motor motor;
    private Porta porta;
    private Radio radio;

    public CarFacade(CintoSeguranca cintoSeguranca, Farol farol, Motor motor, Porta porta, Radio radio) {
        this.cintoSeguranca = cintoSeguranca;
        this.farol = farol;
        this.motor = motor;
        this.porta = porta;
        this.radio = radio;
    }

    public void dirigir(){
        motor.ligar();
        porta.trancar();
        cintoSeguranca.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar();
    }

    public void sair(){
        motor.desligar();
        porta.destrancar();
        cintoSeguranca.destravar();
        farol.apagar();
        radio.desligar();
    }
}
