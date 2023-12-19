package ejercicio3.entidades;

import ejercicio3.enums.Palo;

public class Carta {
    private int numero;
    private Palo palo;

    public Carta() {

    }

    public Carta(int numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return ""+ numero +" "+ palo ;
    }
}
