package practica.entidades;

public class Asiento {
    private char letra;
    private Integer numero;
    private Espectador espectador;
    private boolean ocupado;

    public Asiento() {
    }

    public Asiento(char letra, Integer numero, boolean ocupado) {
        this.letra = letra;
        this.numero = numero;
        this.ocupado = ocupado;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return ""+
                numero + letra;
    }
}
