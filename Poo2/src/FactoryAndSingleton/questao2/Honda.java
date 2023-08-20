package FactoryAndSingleton.questao2;

public class Honda implements IVehicleMaker{
    public static String CITY = "City";
    public static String CIVIC = "Civic";
    public static String FIT = "Fit";
    private static Honda instance;

    public static Honda getInstance(){
        if(instance == null)
            instance = new Honda();
        return instance;
    }
    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo.equals(CITY))
            return new City();
        if(modelo.equals(CIVIC))
            return new Civic();
        if(modelo.equals(FIT))
            return new Fit();
        return null;
    }
}
