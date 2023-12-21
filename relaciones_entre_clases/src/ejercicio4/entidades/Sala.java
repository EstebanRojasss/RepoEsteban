package ejercicio4.entidades;




import java.util.Arrays;


public class Sala {
    Asiento[][] asientos;
    Espectador espectador;
    double precioEntrada;
    private Pelicula pelicula;

    public Sala() {

    }

    public Sala(Asiento[][] asientos) {
        this.asientos = asientos;
        this.espectador = null;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Sala: " +
                "\nAsientos: " + Arrays.toString(asientos) +
                "\nEspectador: " + espectador +
                "\nPrecioEntrada: " + precioEntrada +
                "\nPelicula: " + pelicula;
    }
}
