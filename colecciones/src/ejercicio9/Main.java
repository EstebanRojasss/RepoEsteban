package ejercicio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al
usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos

 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        HashMap<Integer, String> codigoPostal = new HashMap<>();
            for(int i = 0 ; i < 10 ; i++){
                System.out.println("Ingrese una ciudad: ");
                String ciudad = sc.next();
                System.out.println("Ingrese el codigo postal: ");
                Integer codigoPostalCiudad = sc.nextInt();
                codigoPostal.put(codigoPostalCiudad, ciudad);
            }
            pedirCiudad(codigoPostal);
            agregarCiudad(codigoPostal);
            elimnarCiudad(codigoPostal);
            mostrarDatos(codigoPostal);

    }
    public static void mostrarDatos(HashMap<Integer, String>codigoPostal){
        System.out.println("Datos de paises: ");
        for(Map.Entry<Integer, String> entry : codigoPostal.entrySet()){
            System.out.println("Ciudad " + entry.getValue() + "\nCodigo postal " + entry.getKey());
        }
    }
    public static void pedirCiudad(HashMap<Integer, String>pedir){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo postal de la ciudad a buscar: ");
        Integer codigoCiudad = sc.nextInt();
        System.out.println(pedir.getOrDefault(codigoCiudad, "No se encontró el codigo postal."));
    }
    public static void agregarCiudad(HashMap<Integer, String> agregarCity){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la ciudad que desea agregar ");
        String ciudad = sc.next();
        System.out.println("Ingrese el codigo postal de la ciudad: ");
        Integer codigoPostal = sc.nextInt();

        agregarCity.put(codigoPostal, ciudad);
    }
    public static void elimnarCiudad(HashMap<Integer, String>eliminarCity){
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3; i++){
            System.out.println("Ingrese el codigo postal de la ciudad: ");
            Integer codigoPostal = sc.nextInt();
            if(eliminarCity.containsKey(codigoPostal)){
                eliminarCity.remove(codigoPostal);,
            }else{
                System.out.println("No se encuentra el codigo postal ingresado");
            }
        }
    }
}
