package FacadeProxy.questao1;

public class Amplificador {
    private boolean ligado;
    private int volume;
    public void liga(){
        System.out.println("Ligou Amplificador");
        this.ligado = true;
    }

    public void desliga(){
        System.out.println("Desligou Amplificador");
        this.ligado = false;
    }

    public void controleVolume(int x){
        System.out.println("Volume do Amplificador: " + x);
        this.volume = x;
    }
}
