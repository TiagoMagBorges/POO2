package FacadeProxy.questao1;

public class Main {
    public static void main(String[] args) {
        TheaterFacade tf = new TheaterFacade(new Amplificador(), new Luz(), new MaquinaPipoca(), new PlayerStreaming(), new Projetor(), new Telao());
        System.out.println("==================================");
        tf.iniciar();
        System.out.println("==================================");
        tf.fimDoDilme();
    }
}
