package ejercicio6.entidades;

public class Hotel4Estrellas extends Hotel{
    private char gimnasio;
    private String nombreRestaurante;
    private int restauranteCapacidad;

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
}
