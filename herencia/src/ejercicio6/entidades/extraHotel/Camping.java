package ejercicio6.entidades.extraHotel;

public class Camping extends ExtraHotel{
    private int capMaxCarpas;
    private int cantBanhosDispo;
    private boolean restauranteDispo;

    public Camping() {

    }

    public Camping(int capMaxCarpas, int cantBanhosDispo, boolean restauranteDispo) {
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanhosDispo = cantBanhosDispo;
        this.restauranteDispo = restauranteDispo;
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado, int cantidadMetros2, int capMaxCarpas, int cantBanhosDispo, boolean restauranteDispo) {
        super(nombre, direccion, localidad, gerente, privado, cantidadMetros2);
        this.capMaxCarpas = capMaxCarpas;
        this.cantBanhosDispo = cantBanhosDispo;
        this.restauranteDispo = restauranteDispo;
    }

    public int getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(int capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public int getCantBanhosDispo() {
        return cantBanhosDispo;
    }

    public void setCantBanhosDispo(int cantBanhosDispo) {
        this.cantBanhosDispo = cantBanhosDispo;
    }

    public boolean isRestauranteDispo() {
        return restauranteDispo;
    }

    public void setRestauranteDispo(boolean restauranteDispo) {
        this.restauranteDispo = restauranteDispo;
    }

    @Override
    public String toString() {
        return "================Camping================" +
                "\nNombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nLocalidad: " + localidad +
                "\nGerente: " + gerente +
                "\nPrivado: " + privado +
                "\nCantidadMetros2: " + cantidadMetros2 +
                "\nCapMaxCarpas: " + capMaxCarpas +
                "\nCantBanhosDispo: " + cantBanhosDispo +
                "\nRestauranteDispo: " + restauranteDispo;
    }
}
