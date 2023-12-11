package ejercicio1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
 */
public class RazaPerros {
    public ArrayList<String>crearPerro(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList <String> perros = new ArrayList<>();
        char respuesta;
        do {
            System.out.println(" Ingrese la raza del perro");
            perros.add(sc.next());
            System.out.println(" Desea ingresar otra raza ? S/N");
            respuesta = sc.next().toUpperCase().charAt(0);
        }while(respuesta != 'N');
        return perros;
    }

}
