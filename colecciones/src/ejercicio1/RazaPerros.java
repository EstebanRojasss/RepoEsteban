package ejercicio1;

import java.util.*;

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
        Collections.sort(perros);
        for(String perro: perros){
            System.out.println(perro);
        }
    }
}
