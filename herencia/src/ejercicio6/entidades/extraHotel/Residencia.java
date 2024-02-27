package ejercicio6.entidades.extraHotel;

public class Residencia extends ExtraHotel{
    private int cantHabitaciones;
    private boolean descuentoAGremio;
    private boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado, int cantidadMetros2, int cantHabitaciones, boolean descuentoAGremio, boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente, privado, cantidadMetros2);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoAGremio = descuentoAGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuentoAGremio() {
        return descuentoAGremio;
    }

    public void setDescuentoAGremio(boolean descuentoAGremio) {
        this.descuentoAGremio = descuentoAGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "================Residencia================" +
                "\nNombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nLocalidad: " + localidad +
                "\nGerente: " + gerente +
                "\nPrivado: " + privado +
                "\nCantidadMetros2: " + cantidadMetros2 +
                "\nCantHabitaciones: " + cantHabitaciones +
                "\nDescuentoAGremio: " + descuentoAGremio +
                "\nCampoDeportivo: " + campoDeportivo ;
    }
}

