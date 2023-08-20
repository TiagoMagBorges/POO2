package FactoryAndSingleton.questao1;

public class Samsung implements FabricanteCelular{
    public static String GALAXY8 = "Galaxy8";
    public static String GALAXY20 = "Galaxy20";
    public static Samsung instance;

    public static Samsung getInstance() {
        if(instance == null)
            instance = new Samsung();
        return instance;
    }
    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals(GALAXY8))
            return new Galaxy8();
        if(modelo.equals(GALAXY20))
            return new Galaxy20();
        return null;
    }
}
