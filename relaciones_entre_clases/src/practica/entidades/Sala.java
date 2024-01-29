package practica.entidades;

public class Sala {

    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento[][] asiento;

    public Sala() {
        this.asiento = new Asiento[8][6];
    }

    public Sala(Pelicula pelicula, double precioEntrada, Asiento[][] asiento) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asiento = asiento;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public Asiento[][] getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento[][] asiento) {
        this.asiento = asiento;
    }
}
