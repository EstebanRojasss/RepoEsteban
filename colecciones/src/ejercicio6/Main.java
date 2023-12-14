package ejercicio6;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        boolean numeroAcertado = false;
        ArrayList<Integer> numeros = new ArrayList<>();
        Integer contador = 0;
        do {
            System.out.println("Introduzca un numero: ");
            int numero = sc.nextInt();
            numeros.add(numero);
            contador++;

            Iterator<Integer> it = numeros.iterator();
            while (it.hasNext()) {
                if(it.next().equals(-99)){
                    it.remove();
                    numeroAcertado = true;
                    contador -= 1;
                    sumaDeNumeros(numeros, contador);
                }
            }
        } while (!numeroAcertado);
    }

    public static void sumaDeNumeros(ArrayList<Integer> sumaNumeros, Integer contador) {
        Iterator<Integer> it = sumaNumeros.iterator();
        int sumaDeNumeros = 0;
        float promedioNumeros;
        while (it.hasNext()) {
            sumaDeNumeros += it.next();
        }
        promedioNumeros = (float) sumaDeNumeros / contador;
        System.out.println("Numeros ingresados: ");
        for (Integer numero : sumaNumeros) {
            System.out.print(numero + " ");
        }
        System.out.println("Promedio de numeros: " + promedioNumeros);
        System.out.println("Suma de numeros: " + sumaDeNumeros);

    }
}
