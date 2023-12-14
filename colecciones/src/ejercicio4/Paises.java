package ejercicio4;

import java.util.*;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario
 */
public class Paises {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected void cargarPaises() {
        TreeSet<String> paises = new TreeSet<String>();
        String pais, resp;
        boolean salirDelBucle = false;
        do {
            System.out.println("Ingrese un pais ");
            pais = sc.next();
            paises.add(pais);
            System.out.println("Desea agragar otro pais? S/N");
            resp = sc.next();
            if(resp.equalsIgnoreCase("N")){
                salirDelBucle = true;
                buscarPais(paises);
                System.out.println("Conjunto ordenado alfabeticamente de forma ascendente");
                imprimirConjunto(paises);
                System.out.println("Conjunto ordenado alfabeticamente de forma descendente");
                System.out.println(paises.descendingSet());
            }
        } while (!salirDelBucle);
    }
    protected void buscarPais(TreeSet<String> paises){
        System.out.println("Ingrese el pais que desea buscar y eliminar de la lista: ");
        String paisABuscar = sc.next();
        boolean elPaisEsta = true;
        Iterator <String> it = paises.iterator();
        while(it.hasNext()){
            if(it.next().equals(paisABuscar)){
                it.remove();
            }else{
                elPaisEsta = false;
            }
        }
        if(!elPaisEsta){
            System.out.println("El pais no se encuentra ");
        }
    }
    protected void imprimirConjunto(TreeSet<String> paises){
        for(String pais : paises){
            System.out.println(pais);
        }
    }

}
