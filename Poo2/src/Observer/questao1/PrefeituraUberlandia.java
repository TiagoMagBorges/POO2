package Observer.questao1;

import java.util.Observable;
import java.util.Observer;

public class PrefeituraUberlandia implements Observer {
    private double umidadeRelativa;
    @Override
    public void update(Observable o, Object arg) {
        this.umidadeRelativa = (double) arg;
    }

    public double getUmidadeRelativa() {
        return umidadeRelativa;
    }
}
