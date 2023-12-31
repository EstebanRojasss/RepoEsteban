package ejercicio4.servicios;

import ejercicio4.entidades.Asiento;
import ejercicio4.entidades.Espectador;
import ejercicio4.entidades.Pelicula;
import ejercicio4.entidades.Sala;

import java.util.Random;
import java.util.Scanner;

public class SalaServicio {
    public Sala generarSala() {
        Sala sala = new Sala();
        sala.setAsientos(new Asiento[8][6]);
        Random random = new Random();
        int fila = sala.getAsientos().length;
        sala.setPelicula(new Pelicula());
        sala.setPrecioEntrada(random.nextDouble(400));
        for (int i = 0; i < sala.getAsientos().length; i++) {
            for (int j = 0; j < sala.getAsientos()[0].length; j++) {
                sala.getAsientos()[i][j] = new Asiento(fila, (char) (65 + j), true);
            }
            fila--;
        }
        return sala;
    }

    public  void ingresarEspectadores(Sala sala) {
        Random random = new Random();
        int cantidadEspectadores = random.nextInt(20, 40);
        for (int k = 0; k < cantidadEspectadores; k++) {
            Espectador espectador = new Espectador();
            String[] nombres = {"Esteban", "Rene", "Yayu", "Lina", "Prenda", "Piter"};
            espectador.setNombre(nombres[random.nextInt(nombres.length)]);
            espectador.setEdad(random.nextInt(90));
            espectador.setDineroDisponible(random.nextDouble(100, 600));
            sala.setEspectador(espectador);
            boolean yaNoHayAsientos = false;
                    int fila;
                    int columna;
                    do {
                        fila = random.nextInt(8);
                        columna = random.nextInt(6);
                        if (fila > sala.getAsientos().length || columna > sala.getAsientos().length) {
                            yaNoHayAsientos = true;
                            break;
                        }
                    } while (!sala.getAsientos()[fila][columna].isDesocupado());
                    if (espectador.getDineroDisponible() >= sala.getPrecioEntrada()
                            && espectador.getEdad() >= sala.getPelicula().getEdadMinima()) {
                        sala.getAsientos()[fila][columna].setEspectador(espectador);
                        sala.getAsientos()[fila][columna].setDesocupado(false);
                    }
            if (yaNoHayAsientos) {
                System.out.println("Ya no hay asientos disponibles");
            }
        }
    }

    public void registrarPelicula(Sala sala) {
        Pelicula pelicula = new Pelicula();
        Random random = new Random();
        String[] titulos = {"Shrek", "Shrek 2", "Blood and Bone", "Undisputed 2", "Ninja Assassin", "Toy Story"};
        String[] nombresDeDirector = {"Nolan", "Roberto G", "JK Rowling", "Jonah Hill", "Cranston", "Pinman"};
        pelicula.setTitulo(titulos[random.nextInt(titulos.length)]);
        pelicula.setDirector(nombresDeDirector[random.nextInt(nombresDeDirector.length)]);
        pelicula.setDuracion(random.nextInt(1, 4));
        pelicula.setEdadMinima(random.nextInt(18));
        sala.setPelicula(pelicula);

    }


    public void mostrarDatosDeAsiento(Sala sala, Scanner sc) {
        System.out.println("Ingrese el numero de asiento que desea buscar: ");
        int numeroAsiento = sc.nextInt();
        System.out.println("Ingrese la letra de la fila: ");
        char letraAsiento = sc.next().charAt(0);
        System.out.println(sala.getAsientos()[sala.getAsientos().length - numeroAsiento][letraAsiento - 'A'].getEspectador());
    }


    public void datosDeSala(Sala sala) {
        for (int i = 0; i < sala.getAsientos().length; i++) {
            for (int j = 0; j < sala.getAsientos()[0].length; j++) {
                System.out.print("[" + sala.getAsientos()[i][j].getEspectador()+ "]");
            }
            System.out.println();
        }
    }

    public void mostrarCine(Asiento[][] asientos) {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[0].length; j++) {
                if(asientos[i][j].isDesocupado()){
                System.out.print("[" + asientos[i][j] + " ]");
                }else{
                    System.out.print("["+asientos[i][j]+"X]");
                }
            }
            System.out.println();
        }
    }
}
