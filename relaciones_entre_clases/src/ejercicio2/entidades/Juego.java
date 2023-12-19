package ejercicio2.entidades;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador>jugadores;
    private RevolverDeAgua revolverDeAgua;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolverDeAgua) {
        this.revolverDeAgua = revolverDeAgua;
        this.jugadores = jugadores;
        revolverDeAgua.llenarRevolver();
        ronda(jugadores);
    }
    public void ronda(ArrayList<Jugador>jugadores){
        boolean terminaElJuego = false;
        do{
            for(Jugador jugador : jugadores){
                jugador.disparoRevolver(revolverDeAgua);
                System.out.println("Dispara al jugador:  " + jugador);
                System.out.println("--------------------------------- ");
                if(jugador.isMojado()){
                    System.out.println("El jugador " + jugador);
                    terminaElJuego = true;
                }
            }
        }while(!terminaElJuego);

    }

}
