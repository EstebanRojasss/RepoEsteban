package ejercicio5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su
precio, eliminar un producto y mostrar los productos que tenemos con su precio
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio. Realizar un menú para lograr todas las acciones previamente
mencionadas
 */
public class Tienda {
    protected static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    protected void menuDeTienda(HashMap<String, Integer> menuDeTienda) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int menu;
       do{
           System.out.println("MENU");
           System.out.println("1. Introducir elemento al inventario");
           System.out.println("2. Modificar precio del producto: ");
           System.out.println("3. Eliminar producto del inventario: ");
           System.out.println("4. Mostrar productos");
           System.out.println("5. Salir");
           menu = sc.nextInt();
           switch (menu) {
               case 1:introducirProuctoAlinventario(menuDeTienda);
                   break;
               case 2:modificarPrecio(menuDeTienda);
                   break;
               case 3:eliminar(menuDeTienda);
                   break;
               case 4:mostrarProductos(menuDeTienda);
                   break;
               case 5:
                   System.out.println("Chau");
                   break;
               default:
                   System.out.println("Ha ocurrido un error");
           }
       }while(menu != 5);
    }

    protected HashMap<String, Integer> crearAlmacen() {
        HashMap<String, Integer> almacen = new HashMap<>();
        String resp;
        boolean salirDelBucle = false;
        do {
            System.out.println("Ingrese el producto: ");
            String producto = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            int precioProducto = sc.nextInt();
            almacen.put(producto, precioProducto);
            System.out.println("Agregar otro producto S/N");
            resp = sc.next();
            if(resp.equalsIgnoreCase("N")){
                salirDelBucle = true;
            }
        } while (!salirDelBucle);
        return almacen;
    }

    protected static void introducirProuctoAlinventario(HashMap<String, Integer> introducirProduct){
        String resp;
        boolean salirDelBucle = false;
        do {
            System.out.println("Ingrese el producto: ");
            String producto = sc.next();
            System.out.println("Ingrese el precio del producto: ");
            int precioProducto = sc.nextInt();
            introducirProduct.put(producto, precioProducto);
            System.out.println("Agregar otro producto S/N");
            resp = sc.next();
            if(resp.equalsIgnoreCase("N")){
                salirDelBucle = true;
            }
        } while (!salirDelBucle);
    }

    protected static void eliminar(HashMap<String, Integer> elimnarProduct){
        String resp;
        boolean salirDelBucle = false;
        do {
            System.out.println("Ingrese el producto que desea eliminar: ");
            String producto = sc.next();
            elimnarProduct.remove(producto);
            System.out.println("Eliminar otro producto S/N");
            resp = sc.next();
            if(resp.equalsIgnoreCase("N")){
                salirDelBucle = true;
            }
        } while (!salirDelBucle);
    }
    protected static void modificarPrecio(HashMap<String, Integer> modificarPrecio){
        System.out.println("Ingrese el nombre del producto que desea modificar precio: ");
        String nombre = sc.next();
        System.out.println("Ingrese el precio del producto: ");
        int precioNuevo = sc.nextInt();
        modificarPrecio.replace(nombre, precioNuevo);
    }
    protected static void mostrarProductos(HashMap<String, Integer> mostrar){
        for(Map.Entry<String, Integer>entry : mostrar.entrySet()){
            System.out.println("Producto: " + entry.getKey() + "\nPrecio: " + entry.getValue());
        }
    }
}
