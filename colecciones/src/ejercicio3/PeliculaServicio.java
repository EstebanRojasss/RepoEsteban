package ejercicio3;
/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al
usuario todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario
si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
en pantalla.
• Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 */

import java.util.*;

public class PeliculaServicio {
    protected ArrayList<Pelicula> crearPelicula() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        char respuesta;
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula: ");
            pelicula.setTitulo(sc.next());
            System.out.println("Ingrese el director de la pelicula: ");
            pelicula.setDirector(sc.next());
            System.out.println("Ingrese la duracion de la pelicula: ");
            pelicula.setDuracion(sc.nextInt());
            System.out.println("Desea agregar otra pelicula S/N");
            respuesta = sc.next().toUpperCase().charAt(0);
            peliculas.add(pelicula);
        } while (respuesta != 'N');
        return peliculas;
    }

    protected void mostrarLasPeliculas(ArrayList<Pelicula> peliculas) {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula + " ");
        }
    }

    protected void peliculasConMayorDur(ArrayList<Pelicula> peliculas) {
        Iterator<Pelicula> it = peliculas.iterator();
        while (it.hasNext()) {
            Pelicula pelicula = it.next();
            if (pelicula.getDuracion() > 1) {
                System.out.println("Pelicula/s con mayor duracion a 1 hora: " + pelicula.getTitulo());
            }
        }
    }

    protected static Comparator<Pelicula> compararPelicula = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
    };
    protected static Comparator<Pelicula> compararMenorAMayor= new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    protected static Comparator<Pelicula> compararAlfabeticamente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    protected static Comparator<Pelicula> compararDirectorAlfabet = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    protected void ordenarPeliculas(ArrayList<Pelicula> peliculas) {
        peliculas.sort(compararPelicula);
        System.out.println("Lista ordenada por duracion mayor a menor: ");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " " + pelicula.getDuracion());
        }
    }

    protected void ordenarMenorAMayor(ArrayList<Pelicula>peliculas){
        peliculas.sort(compararMenorAMayor);
        System.out.println("Lista ordenada por duracion menor a mayor: ");
        for(Pelicula pelicula: peliculas){
            System.out.println(pelicula.getTitulo() + " " + pelicula.getDuracion());
        }
    }
    protected void ordenarAlfabeticamente(ArrayList<Pelicula>peliculas){
        peliculas.sort(compararAlfabeticamente);
        System.out.println("Lista ordenada por titulo alfabeticamente: ");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo());
        }
    }
    protected void ordenarDirectorAlfabet(ArrayList<Pelicula>peliculas){
        peliculas.sort(compararDirectorAlfabet);
        System.out.println("Lista ordenada por director alfabeticamente: ");
        for(Pelicula pelicula : peliculas){
            System.out.println(pelicula.getTitulo() + " " + pelicula.getDirector());
        }
    }

}
