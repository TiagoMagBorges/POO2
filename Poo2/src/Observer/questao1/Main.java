package Observer.questao1;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        EstacaoTempo estacaoTempo = new EstacaoTempo();
        PrefeituraUberlandia prefeituraUberlandia = new PrefeituraUberlandia();
        estacaoTempo.addObserver(prefeituraUberlandia);
        AeroportoUberlandia aeroportoUberlandia = new AeroportoUberlandia();
        estacaoTempo.addObserver(aeroportoUberlandia);
        estacaoTempo.setTemperatura(19);
        estacaoTempo.setUmidadeRelativa(30);
        estacaoTempo.setVelocidadeVento(20);

        System.out.printf("Prefeitura\nUmidade do ar: %.2f\n", prefeituraUberlandia.getUmidadeRelativa());
        System.out.printf("Aeroporto\nVelocidade do vento: %.2f\n", aeroportoUberlandia.getVelocidadeVento());

        estacaoTempo.setTemperatura(28);
        estacaoTempo.setUmidadeRelativa(40);
        estacaoTempo.setVelocidadeVento(25);

        System.out.printf("Prefeitura\nUmidade do ar: %.2f\n", prefeituraUberlandia.getUmidadeRelativa());
        System.out.printf("Aeroporto\nVelocidade do vento: %.2f\n", aeroportoUberlandia.getVelocidadeVento());
    }
}
