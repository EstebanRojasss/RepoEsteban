package practica.servicioss;

import practica.entidades.Asiento;
import practica.entidades.Espectador;
import practica.entidades.Pelicula;
import practica.entidades.Sala;

import java.util.Random;

public class SalaServicio {

    public Sala generarSala() {
        Random random = new Random();
        Sala sala = new Sala();
        sala.setPelicula(setearPelicula());
        sala.setPrecioEntrada(random.nextDouble(100, 600));
        int fila = sala.getAsiento().length;
        for (int i = 0; i < sala.getAsiento().length; i++) {
            for (int j = 0; j < sala.getAsiento()[0].length; j++) {
                sala.getAsiento()[i][j] = new Asiento((char) ('A' + j), fila, false);
            }
            fila--;
        }
        return sala;
    }

    public static Pelicula setearPelicula() {
        Pelicula pelicula = new Pelicula();
        Random random = new Random();
        String[] directores = {"Nivea", "Termo", "Guampa", "Vaso", "PC", "Teclado", "Ventilador", " Mesa", "Desodorante", "Pulsera"};
        String[] titulos = {"Shrek", "Stori boris", "Batman", "Spiderman", "Django", "Fight Club", "Interestellar", "Nacho Libre"
                , "Van Hellsing", "EL padrino", "LOTR", "Harry Potter"};
        pelicula.setDirector(directores[random.nextInt(directores.length)]);
        pelicula.setTitulo(titulos[random.nextInt(titulos.length)]);
        pelicula.setEdadMinima(10);
        return pelicula;
    }

    public void setEspectadores(Sala sala) {
        Random random = new Random();
        String[] nombres = {"Isla", "Lana", "Dulce", "Brisa", "Estrella", "Perla", "Esmeralda", "Celeste", "Luna", "Serena", "Sierra",
                "Alessandro", "André", "Jayden", "Elian"};
        int espectadores = random.nextInt(6, 60);
        for (int i = 0; i < espectadores; i++) {
            Espectador espectador = new Espectador();
            int edad = random.nextInt(6, 90);
            espectador.setNombre(nombres[random.nextInt(nombres.length)]);
            espectador.setEdad(edad);
            espectador.setDineroDisponible(random.nextDouble(10, 600));
            if (espectador.getEdad() > sala.getPelicula().getEdadMinima() && espectador.getDineroDisponible() > sala.getPrecioEntrada()) {
                int fila;
                int columna;
                do {
                    fila = random.nextInt(8);
                    columna = random.nextInt(6);
                } while (sala.getAsiento()[fila][columna].isOcupado());
                sala.getAsiento()[fila][columna].setOcupado(true);
                sala.getAsiento()[fila][columna].setEspectador(espectador);
            }
        }
    }


    public void imprimirSala(Sala sala) {
        for (int i = 0; i < sala.getAsiento().length; i++) {
            for (int j = 0; j < sala.getAsiento()[0].length; j++) {
                if (sala.getAsiento()[i][j].isOcupado()) {
                    System.out.print("[" + sala.getAsiento()[i][j] + "X]");
                } else {
                    System.out.print("[" + sala.getAsiento()[i][j] + " ]");
                }
            }
            System.out.println();
        }
    }

}
