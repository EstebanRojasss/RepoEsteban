package ejercicio12;

public class Ahorcado {
 private char [] palabraABuscar;
 private int cantidadLetrasEncontradas;
 private int jugadasMaximas;

    public Ahorcado() {

    }

    public Ahorcado(char[] palabraABuscar, int cantidadLetrasEncontradas, int jugadasMaximas) {
        this.palabraABuscar = palabraABuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    public char[] getPalabraABuscar() {
        return palabraABuscar;
    }

    public void setPalabraABuscar(char[] palabraABuscar) {
        this.palabraABuscar = palabraABuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

}
