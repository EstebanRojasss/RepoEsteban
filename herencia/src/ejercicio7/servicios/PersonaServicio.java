package ejercicio7.servicios;

import ejercicio7.entidades.Persona;
import ejercicio7.enums.CURSOS;
import ejercicio7.enums.ESTADO_CIVIL;

import java.util.Scanner;

public class PersonaServicio {
    protected Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    protected ESTADO_CIVIL estadoCivil(String estadoCivilIngreso) {
        for (ESTADO_CIVIL estadoCivil : ESTADO_CIVIL.values()) {
            if (estadoCivilIngreso.equalsIgnoreCase(estadoCivil.toString())) {
                return estadoCivil;
            }
        }
        return null;
    }

    protected CURSOS curso(int opcion) {
        CURSOS[] cursos = CURSOS.values();
        System.out.println("=========CURSOS=========");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println((i + 1) + " " + cursos[i]);
        }
        return switch (opcion) {
            case 1 -> CURSOS.LENGUAJE;
            case 2 -> CURSOS.MATEMATICA;
            case 3 -> CURSOS.ARQUITECTURA;
            case 4 -> CURSOS.INFORMATICA;
            case 5 -> CURSOS.EDUCACION_FISICA;
            default -> null;
        };
    }

    public void cambiarEstadoCivil(Persona persona) {
        System.out.println("=========CAMBIAR ESTADO CIVIL=========");
        do {
            estadoCivil(scanner.next());
        } while (persona.getEstadoCivil() != null);
    }
}
