package ejercicio3.servicio;

import ejercicio3.entidades.Baraja;
import ejercicio3.entidades.Carta;
import ejercicio3.enums.Palo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
número de cartas. En caso de que haya menos cartas que las pedidas, no
devolveremos nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
ninguna indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una
carta y luego se llama al método, este no mostrara esa primera carta.
 */
public class BarajaServicio {
    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        ArrayList<Carta> cartas = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 8 || j == 9) {
                    continue;
                }
                Carta carta = new Carta();
                Palo[] palo = Palo.values();
                carta.setNumero(j);
                carta.setPalo(palo[i]);
                cartas.add(carta);
            }
        }
        baraja.setCartas(cartas);
        return baraja;
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getCartas());
    }

    public void siguienteCarta(Baraja baraja, ArrayList<Carta> monton) {
        if (baraja.getCartas().isEmpty()) {
            System.out.println("La baraja ya no contiene cartas.");
        } else {
            System.out.println(baraja.getCartas().get(0));
            monton.add(baraja.getCartas().get(0));
            baraja.getCartas().remove(0);
            baraja.setMonton(monton);
        }
    }

    public void cartasDisponibles(Baraja baraja) {
        System.out.println(baraja.getCartas().size());
    }

    public void darCartas(Baraja baraja, Scanner sc) {
        System.out.println("Ingrese el numero de cartas que desea obtener: ");
        int numeroCartas = sc.nextInt();
        if (baraja.getCartas().size() >= numeroCartas) {
            for (int i = 0; i < numeroCartas; i++) {
                siguienteCarta(baraja, baraja.getMonton());
            }
        } else {
            System.out.println("La baraja no cuenta con la cantidad requerida");
        }
    }

    public void mostrarMonton(Baraja baraja) {
        System.out.println("Monton de cartas: ");
        System.out.println(baraja.getMonton());
    }

    public void mostrarBaraja(Baraja baraja) {
        System.out.println(baraja.getCartas());
    }
}
