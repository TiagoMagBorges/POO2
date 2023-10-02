package Observer.questao1;

import java.util.Observable;

public class EstacaoTempo extends Observable {
    private double temperatura;
    private double umidadeRelativa;
    private double velocidadeVento;

    public double getTemperatura() {
        return temperatura;
    }

    public double getUmidadeRelativa() {
        return umidadeRelativa;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        setChanged();
        notifyObservers(temperatura);
    }

    public void setUmidadeRelativa(double umidadeRelativa) {
        this.umidadeRelativa = umidadeRelativa;
        setChanged();
        notifyObservers(umidadeRelativa);
    }

    public void setVelocidadeVento(double velocidadeVento) {
        this.velocidadeVento = velocidadeVento;
        setChanged();
        notifyObservers(velocidadeVento);
    }
}
