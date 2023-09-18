package FacadeProxy.questao1;

public class MaquinaPipoca {
    private boolean ligada;

    public void liga(){
        System.out.println("Maquina de pipoca ligada");
        this.ligada = true;
    }

    public void desliga(){
        System.out.println("Maquina de pipoca ligada");
        this.ligada = false;
    }

    public void arrebentaPipoca(){
        System.out.println("Arrebentando pipoca");
    }
}
