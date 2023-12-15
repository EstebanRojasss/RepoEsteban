package ejercicio8;

import java.util.HashSet;

public class Main {
    public static void main(String[]args){
        LibroServicio libroServicio = new LibroServicio();
        HashSet<Libro> libros = libroServicio.crearLibreria();
        libroServicio.mostrarMenu(libros);
    }
}
