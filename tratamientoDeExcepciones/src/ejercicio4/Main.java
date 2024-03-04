package ejercicio4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La
computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
computadora debe decirle al usuario si el número que tiene que adivinar es mayor
o menor que el que ha introducido el usuario. Cuando consiga adivinarlo, debe
indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado
adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se
debe contar el carácter fallido como un intento.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int numero = (random.nextInt(1, 500));
        int contador = 0;
        System.out.println("Ingrese el numero que crea que es: ");
        do {
            try {
                contador++;
                int numeroAingresar = Integer.parseInt(sc.nextLine());
                if (numeroAingresar < numero) {
                    System.out.println("El numero es menor. Intente con uno mayor");

                } else if (numeroAingresar > numero) {
                    System.out.println("El numero es mayor. Intente con uno menor");
                } else {
                    System.out.println("El numero es correcto.");
                    break;
                }
            } catch (NumberFormatException n) {
                System.out.println("Debe ingresar un numero.");
            }
            System.out.println("Ingrese el numero: ");
        } while (true);

        System.out.println("Numero de intentos: " + contador);

    }
}
