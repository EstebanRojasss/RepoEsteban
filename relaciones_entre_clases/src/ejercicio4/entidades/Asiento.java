package ejercicio4.entidades;

public class Asiento {
    private int numero;
    private char letra;
    private boolean desocupado;
    private Espectador espectador;

    public Asiento() {

    }
    public Asiento(int numero, char letra, boolean desocupado) {
        this.numero = numero;
        this.letra = letra;
        this.desocupado = desocupado;
        this.espectador = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean isDesocupado() {
        return desocupado;
    }

    public void setDesocupado(boolean desocupado) {
        this.desocupado = desocupado;
    }


    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "" +
                 numero +
                 letra;
    }
}
