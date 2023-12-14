package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
Para esto, tendremos una clase Pelicula con el titulo, director y duración de la
película (en horas). Implemente las clases y métodos necesarios para esta
situación, teniendo en cuenta lo que se pide a continuación:
18
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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PeliculaServicio peliculaServicio = new PeliculaServicio();
        ArrayList<Pelicula> peliculas = peliculaServicio.crearPelicula();
        int menu;
        do{
            System.out.println("MENU");
            System.out.println("1. Mostrar todas las peliculas ");
            System.out.println("2. Mostrar todas las pelicuas con mayor duracion a 1 hora");
            System.out.println("3. Ordenar las peliculas de mayor a menor");
            System.out.println("4. Ordenar las peliculas de menor a mayor ");
            System.out.println("5. Ordenar las peliculas alfabeticamente por titulo");
            System.out.println("6. Ordenar las peliculas alfabeticamente por director");
            System.out.println("7. Salir");
            menu = sc.nextInt();
            switch (menu){
                case 1:peliculaServicio.mostrarLasPeliculas(peliculas);
                    break;
                case 2:peliculaServicio.peliculasConMayorDur(peliculas);
                    break;
                case 3:peliculaServicio.ordenarPeliculas(peliculas);
                    break;
                case 4:peliculaServicio.ordenarMenorAMayor(peliculas);
                    break;
                case 5:peliculaServicio.ordenarAlfabeticamente(peliculas);
                    break;
                case 6:peliculaServicio.ordenarDirectorAlfabet(peliculas);
                    break;
                case 7:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("Ha ocurrido un error");
            }
        }while(menu != 7);
    }
}
