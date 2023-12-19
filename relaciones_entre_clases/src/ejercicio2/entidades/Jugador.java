package ejercicio2.entidades;

import ejercicio2.servicios.JugadorServicio;
import ejercicio2.servicios.RevolverDeAguaService;

import java.util.ArrayList;
import java.util.Random;

public class Jugador {
    private long id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(long id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre + id;
        this.mojado = mojado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador: " +
                "\nnombre: " + nombre +
                "\nid: " + id +
                "\nmojado: " + mojado;

    }

    public ArrayList<Jugador> crearJugadores() {
        Random random = new Random();
        ArrayList<Jugador>jugadors = new ArrayList<>();
        int cantidadDeJugadores = random.nextInt(6);
        String[] nombres = {"Esteban", "Alberto", "Roland", "Justo", "Rene", "Petoto"};
        for (int i = 0; i < cantidadDeJugadores; i++) {
            Jugador jugador = new Jugador();
            this.id = i + 1;
            this.nombre = nombres[i] + " " + jugador.getId();
        }
    }

    protected void disparoRevolver(RevolverDeAgua revolverDeAgua) {
        this.mojado = revolverDeAgua.mojar();
        revolverDeAgua.siguienteChorro();
    }

}
