package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import ejercicio7.entidades.Persona;
import ejercicio7.entidades.Profesor;
import ejercicio7.enums.CURSOS;

import java.util.Scanner;


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
        curso(profesor);
        return profesor;
    }
    public void curso(Profesor profesor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========CURSOS=========");
        CURSOS[] cursos = CURSOS.values();
        for (int i = 0; i < cursos.length; i++) {
            System.out.println((i + 1) + " " + cursos[i]);
        }
        int opc ;
        do{
            System.out.print("Ingrese el departamento al que va el profesor: ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    profesor.setCursos(CURSOS.LENGUAJE);
                    break;
                case 2:
                    profesor.setCursos(CURSOS.MATEMATICA);
                    break;
                case 3:
                    profesor.setCursos(CURSOS.ARQUITECTURA);
                    break;
                case 4:
                    profesor.setCursos(CURSOS.INFORMATICA);
                    break;
                case 5:
                    profesor.setCursos(CURSOS.EDUCACION_FISICA);
                    break;
            }
        }while(opc != 1 && opc !=2 && opc != 3&&opc != 4&& opc !=5);
    }
    public void cambioDepartamento(Profesor profesor){
        System.out.println("=========CAMBIAR DEPARTAMENTO=========");
            curso(profesor);
    }

}
