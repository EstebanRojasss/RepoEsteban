package ejercicio2.entidades;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador>jugadores;
    private RevolverDeAgua revolverDeAgua;

    public void llenarJuego(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
        this.revolverDeAgua = revolverDeAgua;
        revolverDeAgua.llenarRevolver();
    }
    public void ronda(){
        boolean terminaElJuego = false;
        do{
            for(Jugador jugador : jugadores){
                jugador.disparoRevolver(revolverDeAgua);
                if(jugador.isMojado()){
                    System.out.println("Muerto el jugador " + jugador + " se mojó");
                    terminaElJuego = true;
                }
            }
        }while(!terminaElJuego);

    }

}
