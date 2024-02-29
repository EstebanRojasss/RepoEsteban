package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import ejercicio7.enums.CURSOS;
import ejercicio7.enums.ESTADO_CIVIL;

import java.util.Scanner;

public class PersonaServicio {

    public void estadoCivil(Persona persona) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String estadoCivilIngreso;
        boolean encontrado = false;
        do{
            System.out.println("Ingrese el estado civil: ");
            estadoCivilIngreso = scanner.next();
            for (ESTADO_CIVIL estadoCivil : ESTADO_CIVIL.values()) {
                if (estadoCivilIngreso.equalsIgnoreCase(estadoCivil.toString())) {
                    persona.setEstadoCivil(estadoCivil);
                    encontrado = true;
                }
            }
        }while(!encontrado);
    }

    public void cambiarEstadoCivil(Persona persona) {
        System.out.println("=========CAMBIAR ESTADO CIVIL=========");
            estadoCivil(persona);
    }
}
