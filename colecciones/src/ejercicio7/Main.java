package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CantanteFamosoServicio cS = new CantanteFamosoServicio();
        ArrayList<CantanteFamoso>cantanteFamosos = cS.crearCantante();
        int menu;
        do {
            System.out.println("MENU");
            System.out.println("1. Agregar cantante a la lista");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante de la lista");
            System.out.println("4. Salir ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:cS.agregarOtroCantante(cantanteFamosos);
                    break;
                case 2:cS.mostraDatos(cantanteFamosos);
                    break;
                case 3:cS.eliminarCantante(cantanteFamosos);
                    break;
                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Ha ocurrido un error");
            }

        } while (menu != 4);
    }
}
