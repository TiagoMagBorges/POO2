package questao1;

public class Apple implements FabricanteCelular{
    public static String IPHONEX = "IPhoneX";
    public static String IPHONES = "IPhoneS";
    private static Apple instance;

    public static Apple getInstance() {
        if(instance == null)
            instance = new Apple();
        return instance;
    }

    @Override
    public Celular constroiCelular(String modelo) {
        if(modelo.equals(IPHONEX))
            return new IPhoneX();
        if(modelo.equals(IPHONES))
            return new IPhoneS();
        return null;
    }
}
