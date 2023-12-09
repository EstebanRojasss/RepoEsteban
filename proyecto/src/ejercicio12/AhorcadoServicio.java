package ejercicio12;

import java.util.Scanner;

/*
Constructores, tanto el vacío como el parametrizado.
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
Ejemplo vector como atributo: VectorAtributo
Un ejemplo de salida puede ser así:
 */
public class AhorcadoServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese la palabra a adivinar: ");
        String palabraBuscada = sc.next().toLowerCase();
        System.out.println("Ingrese la cantidad de intentos: ");
        ahorcado.setJugadasMaximas(sc.nextInt());
        ahorcado.setCantidadLetrasEncontradas(0);
        char[] palabra = new char[palabraBuscada.length()];
        for (int i = 0; i < palabraBuscada.length(); i++) {
            palabra[i] = palabraBuscada.charAt(i);
            ahorcado.setPalabraABuscar(palabra);
        }
        return ahorcado;
    }

    protected void mostrarLongitudDelaPalabra(Ahorcado ahorcado) {
        System.out.println("La longitud de la palabra es de " + ahorcado.getPalabraABuscar().length + " letras");
    }

    protected void buscarLetra(Ahorcado ahorcado) {
        int contador = ahorcado.getCantidadLetrasEncontradas();
        int jugadasMaximas = ahorcado.getJugadasMaximas();
        boolean noContieneLaLetra = true;
        System.out.println("Ingrese la letra a buscar ");
        char letra = sc.next().charAt(0);
        int i = 0;
        while(i < ahorcado.getPalabraABuscar().length && noContieneLaLetra){
            if(ahorcado.getPalabraABuscar()[i] == letra){
                noContieneLaLetra = false;
            }
            i++;
        }
        if(noContieneLaLetra){
            System.out.println("La palabra  no contiene la letra");
            ahorcado.setJugadasMaximas(jugadasMaximas - 1);

        }else {
            System.out.println("La palabra  contiene la letra.");
            ahorcado.setCantidadLetrasEncontradas(contador + 1);
        }
    }

    protected void encontradas(Ahorcado ahorcado) {
        System.out.println("Las letras encontradas son " + ahorcado.getCantidadLetrasEncontradas() +
                " y le faltan por encontrar " + (ahorcado.getPalabraABuscar().length - ahorcado.getCantidadLetrasEncontradas()) + " letras");
    }

    protected int intentosRestantes(Ahorcado ahorcado) {
        return (ahorcado.getJugadasMaximas());
    }

    protected void metodoJuego(Ahorcado ahorcado) {
        int menu;
        boolean juegoGanadoOPerdido = false;
        do {
            System.out.println("MENU DE JUEGO ");
            System.out.println("1. Mostrar longitud de la palabra");
            System.out.println("2. Buscar letra");
            System.out.println("3. Cantidad de letras encontradas");
            System.out.println("4. Intentos restantes");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    mostrarLongitudDelaPalabra(ahorcado);
                    break;
                case 2:
                    buscarLetra(ahorcado);
                    break;
                case 3:
                    encontradas(ahorcado);
                    break;
                case 4:
                    System.out.println("Intentos restantes: " + intentosRestantes(ahorcado));
                    break;
                default:
                    System.out.println("Debe ingresar una de las opciones del menu");
            }
            if (intentosRestantes(ahorcado) == 0) {
                System.out.println("Ha perdido el juego");
                juegoGanadoOPerdido = true;
            } else if(ahorcado.getCantidadLetrasEncontradas() == ahorcado.getPalabraABuscar().length){
                System.out.println("Ha acertado la palabra. Gano el juego");
                juegoGanadoOPerdido = true;
            }
        } while (!juegoGanadoOPerdido);

    }

}
