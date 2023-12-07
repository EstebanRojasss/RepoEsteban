package ejercicio9;

import java.util.Scanner;

/*
. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArregloServicio arregloServicio = new ArregloServicio();
        Arreglo arreglo = arregloServicio.llenarArregloA();
        arregloServicio.imprimirArregloA(arreglo);
        System.out.println(" ");
        arregloServicio.ordenarMenorAMayor(arreglo);
        System.out.println(" ");
        System.out.println("Arreglo A menor a mayor");
        arregloServicio.imprimirArregloA(arreglo);
        System.out.println(" ");
        arregloServicio.arregloB(arreglo);
        System.out.println(" ");
        arregloServicio.imprimirArregloB(arreglo);

    }
}
