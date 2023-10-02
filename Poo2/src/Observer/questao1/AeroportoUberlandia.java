package Observer.questao1;

import java.util.Observable;
import java.util.Observer;

public class AeroportoUberlandia implements Observer {
    private double velocidadeVento;
    @Override
    public void update(Observable o, Object arg) {
        this.velocidadeVento = (double) arg;
    }

    public double getVelocidadeVento() {
        return velocidadeVento;
    }
}
