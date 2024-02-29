package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import ejercicio7.entidades.Profesor;


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
            System.out.print("Ingrese el curso ");
            profesor.setCursos(curso(sc.nextInt()));
        } while (profesor.getCursos() != null);
        return profesor;
    }

    public void cambioDepartamento(Profesor profesor){
        System.out.println("=========CAMBIAR DEPARTAMENTO=========");
        do{
            curso(sc.nextInt());
        }while(profesor.getCursos() != null);
    }

}
