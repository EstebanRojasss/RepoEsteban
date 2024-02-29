package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import ejercicio7.entidades.Profesor;
import ejercicio7.enums.CURSOS;

public class ProfesorServicio extends EmpleadoServicio {
    public Profesor nuevoProfe() {
        Empleado empleado = nuevoEmpleado();
        Profesor profesor = new Profesor();
        profesor.setNombre(empleado.getNombre());
        profesor.setApellido(empleado.getApellido());
        profesor.setEstadoCivil(empleado.getEstadoCivil());
        profesor.setNumId(empleado.getNumId());
        profesor.setAnioIncorporacion(empleado.getAnioIncorporacion());
        profesor.setNumeroDespacho(empleado.getNumeroDespacho());
        do {
            System.out.println("Ingrese el curso ");
            profesor.setCursos(cursosDispo(sc.nextInt()));
        } while (profesor.getCursos() != null);

        return profesor;
    }


    private CURSOS cursosDispo(int opcion) {
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
}
