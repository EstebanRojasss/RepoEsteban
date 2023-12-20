package ejercicio1;

import java.util.*;

public class PersonaServicio {

    protected ArrayList<Persona> crearPersona(Scanner sc,ArrayList<Perro>perros) {
        ArrayList<Persona> personas = new ArrayList<>();
        Random random = new Random();
        String[] nombres = {"Esteban", "Alberto", "Justo", "Roland", "Rene"};
        String[] apellidos = {"Rojas", "Chamorro", "Lothbrock", "Messi", "Nazario"};
        for (int i = 0; i < nombres.length; i++) {
            Persona persona = new Persona();
            persona.setNombre(nombres[random.nextInt(nombres.length)]);
            persona.setApellido(apellidos[random.nextInt(apellidos.length)]);
            persona.setEdad(random.nextInt(50));
            persona.setDocumento(random.nextInt(200));
            personas.add(persona);
        }
        return personas;
    }

    public void perrosDisponibles(ArrayList<Perro>perrosDispo){
        for(Perro perro : perrosDispo){
            System.out.println(perro);
        }
    }
    public ArrayList<Perro> elegirPerro(Scanner sc, ArrayList<Persona>personas){
        ArrayList<Perro>perrosPersona = new ArrayList<>();
        System.out.print("Elija el perro que desea adoptar. Se le informara si sigue disponible.");
        perrosDisponibles(perrosPersona);
        String nombre;
        sc.next();
        int menu;
        do{
            System.out.println("Ingrese el nombre: ");
            nombre = sc.next();
            for(Perro perro: perrosPersona){
                if(perro.getNombre().equalsIgnoreCase(nombre)){
                    perrosPersona.add(perro);
                }
            }
            System.out.println("Desea agregar otro perro? \n1: SI | 2: NO");
            menu = sc.nextInt();

        }while(menu != 2);
        return perrosPersona;
    }

}
