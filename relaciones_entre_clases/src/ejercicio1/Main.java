package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        PersonaServicio personaServicio = new PersonaServicio();
        ArrayList<Persona>personas = personaServicio.crearPersona();
        PerroServicio perroServicio = new PerroServicio();
        ArrayList<Perro>perros = perroServicio.crearPerro();
        System.out.println("Ingrese el perro que desea adoptar: ");
        System.out.println("Perros disponibles ");
        for(int i = 0 ; i < perros.size(); i++){
            System.out.println(perros.iterator().next());
        }



    }
}
