package ejercicio3.entidades;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton = new ArrayList<>();
    public Baraja() {

    }

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }
    @Override
    public String toString() {
        return "Baraja: " +
                "\ncartas: " + cartas;
    }
}
