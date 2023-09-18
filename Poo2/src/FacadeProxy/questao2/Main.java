package FacadeProxy.questao2;

public class Main {
    public static void main(String[] args) {
        CarFacade cf = new CarFacade(new CintoSeguranca(), new Farol(), new Motor(), new Porta(), new Radio());
        System.out.println("==================================");
        cf.dirigir();
        System.out.println("==================================");
        cf.sair();
    }
}
