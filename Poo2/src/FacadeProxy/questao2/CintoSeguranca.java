package FacadeProxy.questao2;

public class CintoSeguranca {
    private boolean travado;

    public void travar(){
        System.out.println("Cinto travado");
        this.travado = true;
    }

    public void destravar(){
        System.out.println("Cinto destravado");
        this.travado = false;
    }
}
