package ejercicio8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar
datos repetidos. Para ello, se debe crear una clase llamada Libro que guarde la
información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
el título del libro, autor, número de ejemplares y número de ejemplares prestados.
También se creará en el main un HashSet de tipo Libro que guardará todos los libros
creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos
sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y
se le pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al
método. El método se incrementa de a uno, como un carrito de compras, el
atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
que no queden ejemplares disponibles para prestar. Devuelve true si se ha
podido realizar la operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
El método decrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
vez que se produzca la devolución de un libro. No se podrán devolver libros
donde que no tengan ejemplares prestados. Devuelve true si se ha podido
realizar la operación y false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
public class LibroServicio {
    protected void mostrarMenu(HashSet<Libro>libreria){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        int menu;
        do{
            System.out.println("MENU");
            System.out.println("1. Prestar libro");
            System.out.println("2. Devolver libro");
            System.out.println("3. Mostrar datos de los libros");
            System.out.println("4. Salir");
            menu = sc.nextInt();
            switch (menu){
                case 1: metodoPrestamo(libreria);
                    break;
                case 2:metodoDevolucion(libreria);
                    break;
                case 3:mostrarDatos(libreria);
                    break;
                case 4:
                    System.out.println("Que tenga un buen dia.");
                    break;
                default:
                    System.out.println("Ha ocurrido un error.");
            }
        }while(menu != 4);
    }
    protected HashSet<Libro>crearLibreria(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        HashSet<Libro> libros = new HashSet<>();
        char resp;
        boolean salirDelBucle = false;
        do{
            Libro libro = new Libro();
            System.out.println("Ingrese el titulo del libro: ");
            libro.setTitulo(sc.next());
            System.out.println("Ingrese el autor del libro: ");
            libro.setAutor(sc.next());
            System.out.println("Ingrese el numero de ejemplares: ");
            libro.setNumEjemplares(sc.nextInt());
            libro.setEjemplaresPrestados(0);
            libros.add(libro);
            System.out.println("Agregar otro libro S/N");
            resp = sc.next().toUpperCase().charAt(0);
            if(resp == 'N'){
                salirDelBucle = true;
            }
        }while(!salirDelBucle);
        return libros;
    }
    protected static void metodoPrestamo(HashSet<Libro>libreria){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del producto que desea buscar: ");
        String libroABuscar = sc.next();
        Iterator<Libro> it = libreria.iterator();
        while(it.hasNext()){
            Libro libro = it.next();
            if(libro.getTitulo().equalsIgnoreCase(libroABuscar)){
                if(libro.getNumEjemplares() > 0) {
                    libro.setNumEjemplares(libro.getNumEjemplares()-1);
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
                }else{
                    System.out.println("No quedan ejemplares de este libro.");
                }
            }
        }
    }
    protected static void metodoDevolucion(HashSet<Libro>libreria){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del libro que desea devolver: ");
        String libroABuscar = sc.next();
        Iterator<Libro> it = libreria.iterator();
        while(it.hasNext()){
            Libro libro = it.next();
            if(libro.getTitulo().equalsIgnoreCase(libroABuscar)){
                if(libro.getEjemplaresPrestados() > 0){
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                    libro.setNumEjemplares(libro.getNumEjemplares() + 1);
                }else{
                    System.out.println("No se prestó ejemplares de este libro.");
                }
            }
        }
    }
    protected static void mostrarDatos(HashSet<Libro>mostrarLibros){
        for(Libro libro : mostrarLibros){
            System.out.println(libro);
        }
    }
}
