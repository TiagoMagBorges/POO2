package questao1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple fabricaApple = Apple.getInstance();
        Samsung fabricaSamsung = Samsung.getInstance();

        ArrayList<Celular> celulares = new ArrayList<>();

        celulares.add(fabricaApple.constroiCelular(Apple.IPHONEX));
        celulares.add(fabricaApple.constroiCelular(Apple.IPHONES));
        celulares.add(fabricaSamsung.constroiCelular(Samsung.GALAXY8));
        celulares.add(fabricaSamsung.constroiCelular(Samsung.GALAXY20));

        for(Celular c : celulares){
            System.out.println("=================");
            c.fazLigacao();
            c.tiraFoto();
            System.out.println("=================");
        }
    }
}
