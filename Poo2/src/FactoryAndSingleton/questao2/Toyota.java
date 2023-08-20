package FactoryAndSingleton.questao2;

public class Toyota implements IVehicleMaker{
    public static String COROLLA = "Corolla";
    public static String HILUX = "Hilux";
    public static String ETIOS = "Etios";
    private static Toyota instance;

    public static Toyota getInstance(){
        if(instance == null)
            instance = new Toyota();
        return instance;
    }
    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals(COROLLA))
            return new Corolla();
        if(modelo.equals(HILUX))
            return new Hilux();
        if(modelo.equals(ETIOS))
            return new Etios();
        return null;
    }
}
