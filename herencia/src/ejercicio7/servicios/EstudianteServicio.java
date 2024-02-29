package ejercicio7.servicios;

import ejercicio7.entidades.Estudiante;
import ejercicio7.entidades.Profesor;
import ejercicio7.enums.CURSOS;

import java.util.Scanner;

public class EstudianteServicio extends PersonaServicio {
    public Estudiante nuevoEstudiante() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Estudiante estudiante = new Estudiante();
        System.out.println("=========DATOS DE ESTUDIANTE=========");
        System.out.print("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(scanner.next());
        System.out.print("Ingrese el apellido del estudiante: ");
        estudiante.setApellido(scanner.next());
        System.out.print("Ingrese el Id: ");
        estudiante.setNumId(scanner.nextInt());
        estadoCivil(estudiante);
        curso(estudiante);
        return estudiante;
    }
    public void curso(Estudiante estudiante) {
        Scanner scanner = new Scanner(System.in);
        CURSOS[] cursos = CURSOS.values();
        System.out.println("=========CURSOS=========");
        for (int i = 0; i < cursos.length; i++) {
            System.out.println((i + 1) + " " + cursos[i]);
        }
        int opc;
        System.out.println("=================================");
        do {
            System.out.print("Ingrese el curso al que va el estudiante: ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    estudiante.setCurso(CURSOS.LENGUAJE);
                    break;
                case 2:
                    estudiante.setCurso(CURSOS.MATEMATICA);
                    break;
                case 3:
                    estudiante.setCurso(CURSOS.ARQUITECTURA);
                    break;
                case 4:
                    estudiante.setCurso(CURSOS.INFORMATICA);
                    break;
                case 5:
                    estudiante.setCurso(CURSOS.EDUCACION_FISICA);
                    break;
            }
        } while (opc != 1 && opc != 2 && opc != 3 && opc != 4 && opc != 5);
    }


    public void matricularNuevoCurso(Estudiante estudiante) {
        System.out.println("=========MATRICULA DE NUEVO CURSO=========");
            curso(estudiante);
    }
}
