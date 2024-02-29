package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import ejercicio7.entidades.PersonalDServicio;
import ejercicio7.enums.SECCION;

public class PersonalServicio extends EmpleadoServicio {
    public PersonalDServicio nuevoPersonalDServicio() {
        Empleado empleado = nuevoEmpleado();
        PersonalDServicio personal = new PersonalDServicio();
        personal.setNombre(empleado.getNombre());
        personal.setApellido(empleado.getApellido());
        personal.setNumId(empleado.getNumId());
        personal.setEstadoCivil(empleado.getEstadoCivil());
        personal.setAnioIncorporacion(empleado.getAnioIncorporacion());
        personal.setNumeroDespacho(empleado.getNumeroDespacho());
        do{
        System.out.println("Ingrese la seccion correspondiente del personal: ");
        personal.setSeccion(seccionDispo(sc.nextInt()));
        }while (personal.getSeccion() != null);

        return personal;
    }

    private SECCION seccionDispo(int opcion) {
        SECCION[] secciones = SECCION.values();
        System.out.println("=========SECCIONES=========");
        for (int i = 0; i < secciones.length; i++) {
            System.out.println((i + 1) + " " + secciones[i]);
        }
            return switch (opcion) {
                case 1 -> SECCION.BIBLIOTECA;
                case 2 -> SECCION.DECANATO;
                case 3 -> SECCION.SECRETARIA;
                case 4 -> SECCION.CONSERJE;
                default -> null;
            };
    }

    public void trasladoSeccion(PersonalDServicio personalDServicio){
        System.out.println("=========TRASLADO DE SECCION A PERSONAL=========");
        do{
            seccionDispo(sc.nextInt());
        }while(personalDServicio.getSeccion() != null);
    }
}
