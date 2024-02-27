package ejercicio6.entidades.extraHotel;

public class Residencias extends ExtraHotel{
    private int cantHabitaciones;
    private boolean descuentoAGremio;
    private boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(String nombre, String direccion, String localidad, String gerente, boolean privado, int cantidadMetros2, int cantHabitaciones, boolean descuentoAGremio, boolean campoDeportivo) {
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
}
