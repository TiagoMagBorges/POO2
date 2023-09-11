package Wrapper.questao1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ave> aves = new ArrayList<>();
        aves.add(new PatoAveAdapter(new PatoDomestico()));
        aves.add((new PavaoAveAdapter(new PavaoAzul())));

        for(Ave ave : aves){
            ave.voar();
            ave.emitirSom();
        }
    }
}
