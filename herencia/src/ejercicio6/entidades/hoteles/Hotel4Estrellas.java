package ejercicio6.entidades.hoteles;

public class Hotel4Estrellas extends Hotel {
    protected char gimnasio;
    protected String nombreRestaurante;
    protected int restauranteCapacidad;

    public Hotel4Estrellas() {

    }


    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, char gimnasio, String nombreRestaurante, int restauranteCapacidad) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.restauranteCapacidad = restauranteCapacidad;
    }

    public char getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(char gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getRestauranteCapacidad() {
        return restauranteCapacidad;
    }

    public void setRestauranteCapacidad(int restauranteCapacidad) {
        this.restauranteCapacidad = restauranteCapacidad;
    }

    @Override
    public String toString() {
        return "================Hotel 4 Estrellas================" +
                "\nNombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nLocalidad: " + localidad +
                "\nGerente: " + gerente +
                "\nCantidadHabitaciones: " + cantidadHabitaciones +
                "\nNumeroCamas: " + numeroCamas +
                "\nCantidadPisos: " + cantidadPisos +
                "\nRestauranteCapacidad: " + restauranteCapacidad +
                "\nGimnasio: " + gimnasio +
                "\nNombreRestaurante: " + nombreRestaurante +
                "\nPrecioHabitaciones: " + precioHabitaciones;
    }
}