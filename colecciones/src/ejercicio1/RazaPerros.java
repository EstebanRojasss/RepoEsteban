package ejercicio1;

import java.util.*;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
y se mostrará la lista ordenada
 */
public class RazaPerros {
    public ArrayList<String>crearPerro(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList <String> perros = new ArrayList<>();
        char respuesta;
        String razaAElimnar;
        do {
            System.out.println("Ingrese la raza del perro");
            perros.add(sc.next());
            System.out.println("Desea ingresar otra raza ? S/N");
            respuesta = sc.next().toUpperCase().charAt(0);
        }while(respuesta != 'N');
        return perros;
    }

    public void buscarPerro(ArrayList<String>perros) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la raza de perro que desea buscar. ");
        String perroAbuscar = sc.next();
        Iterator<String> iterator = perros.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().equals(perroAbuscar)){
                iterator.remove();
            }
        }
        for(String perro: perros){
            System.out.println(perro);
        }
    }
}