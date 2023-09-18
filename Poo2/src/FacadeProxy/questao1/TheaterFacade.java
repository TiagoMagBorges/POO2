package FacadeProxy.questao1;

public class TheaterFacade {
    private Amplificador amplificador;
    private Luz luz;
    private MaquinaPipoca maquinaPipoca;
    private PlayerStreaming playerStreaming;
    private Projetor projetor;
    private Telao telao;

    public TheaterFacade(Amplificador amplificador, Luz luz, MaquinaPipoca maquinaPipoca, PlayerStreaming playerStreaming, Projetor projetor, Telao telao) {
        this.amplificador = amplificador;
        this.luz = luz;
        this.maquinaPipoca = maquinaPipoca;
        this.playerStreaming = playerStreaming;
        this.projetor = projetor;
        this.telao = telao;
    }

    public void iniciar(){
        maquinaPipoca.liga();
        maquinaPipoca.arrebentaPipoca();
        luz.desliga();
        telao.abaixa();
        projetor.liga();
        amplificador.liga();
        amplificador.controleVolume(10);
        playerStreaming.liga();
        playerStreaming.playFilme();
    }

    public void fimDoDilme(){
        playerStreaming.desliga();
        amplificador.desliga();
        projetor.desliga();
        telao.sobe();
        luz.liga();
        maquinaPipoca.desliga();
    }
}
