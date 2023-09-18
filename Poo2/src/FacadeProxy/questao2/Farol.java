package FacadeProxy.questao2;

public class Farol {
    private boolean acendido;

    public void acender(){
        System.out.println("Farol acendido");
        this.acendido = true;
    }

    public void apagar(){
        System.out.println("Farol acendido");
        this.acendido = false;
    }
}
