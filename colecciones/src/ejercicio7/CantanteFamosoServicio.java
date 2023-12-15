package ejercicio7;

import java.util.ArrayList;
import java.util.Iterator;
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
public class CantanteFamosoServicio {
    Scanner sc = new Scanner(System.in);

    protected ArrayList<CantanteFamoso> crearCantante() {
        ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            CantanteFamoso cantante = new CantanteFamoso();
            System.out.println("Ingrese el nombre del cantante: ");
            cantante.setNombre(sc.next());
            System.out.println("Ingrese el disco mas vendido del cantante: ");
            cantante.setDiscoConMasVentas(sc.next());
            cantantes.add(cantante);
        }
        return cantantes;
    }

    protected void mostraDatos(ArrayList<CantanteFamoso> cantantes) {
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(cantante);
        }
    }

    protected void agregarOtroCantante(ArrayList<CantanteFamoso> cantanteFamosos) {
        CantanteFamoso cantanteFamoso = new CantanteFamoso();
        System.out.println("Ingrese el nombre para agregar");
        cantanteFamoso.setNombre(sc.next());
        System.out.println("Ingrese el disco mas vendido: ");
        cantanteFamoso.setDiscoConMasVentas(sc.next());
        cantanteFamosos.add(cantanteFamoso);
    }

    protected void eliminarCantante(ArrayList<CantanteFamoso> eliminarCantante){
        System.out.println("Ingrese el nombre del cantante que desea eliminar de la lista: ");
        String nombreAElimnar = sc.next();
        boolean noSeEncuentra = false;
        Iterator<CantanteFamoso> it = eliminarCantante.iterator();
        while (it.hasNext()){
            CantanteFamoso cantante = it.next();
            if(cantante.getNombre().equalsIgnoreCase(nombreAElimnar)){
                it.remove();
            }
        }
    }
}
