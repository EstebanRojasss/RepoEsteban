package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicio {

    protected ArrayList<Persona> crearPersona(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Persona>personas = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            Persona persona = new Persona();
            Perro perro = new Perro();
            System.out.println("Ingrese el nombre: ");
            persona.setNombre(sc.next());
            System.out.println("Ingrese el apellido: ");
            persona.setApellido(sc.next());
            System.out.println("Ingrese la edad: ");
            persona.setEdad(sc.nextInt());
            System.out.println("Ingrese su documento: ");
            persona.setDocumento(sc.nextLong());
            personas.add(persona);
        }
        return personas;
    }
}
