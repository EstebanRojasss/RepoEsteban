package ejercicio6.entidades;

public class Hotel5Estrellas extends Hotel4Estrellas{
    private int cantSalonesDeConferencia;
    private int cantSuites;
    private int cantLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, char gimnasio, String nombreRestaurante, int restauranteCapacidad, int cantSalonesDeConferencia, int cantSuites, int cantLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, gimnasio, nombreRestaurante, restauranteCapacidad);
        this.cantSalonesDeConferencia = cantSalonesDeConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public int getCantSalonesDeConferencia() {
        return cantSalonesDeConferencia;
    }

    public void setCantSalonesDeConferencia(int cantSalonesDeConferencia) {
        this.cantSalonesDeConferencia = cantSalonesDeConferencia;
    }

    public int getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(int cantSuites) {
        this.cantSuites = cantSuites;
    }

    public int getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(int cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" +
                "\nNombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nLocalidad: " + localidad +
                "\nGerente: " + gerente +
                "\nCantidadHabitaciones: " + cantidadHabitaciones +
                "\nNumeroCamas: " + numeroCamas +
                "\nCantidadPisos: " + cantidadPisos +
                "\nPrecioHabitaciones: " + precioHabitaciones +
                "\nRestauranteCapacidad: " + restauranteCapacidad +
                "\nGimnasio: " + gimnasio +
                "\nNombreRestaurante: " + nombreRestaurante +
                "\nCantidad Salones de Conferencia: " + cantSalonesDeConferencia +
                "\nCantidad Suites: " + cantSuites +
                "\nCantiad Limosinas: " + cantLimosinas ;
    }
}
