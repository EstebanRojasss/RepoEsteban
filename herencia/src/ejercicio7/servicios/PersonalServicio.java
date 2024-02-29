package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import ejercicio7.entidades.PersonalDServicio;
import ejercicio7.enums.SECCION;

import java.util.Scanner;

public class PersonalServicio extends EmpleadoServicio {
    public PersonalDServicio nuevoPersonalDServicio() {
        Scanner scanner = new Scanner(System.in);
        Empleado empleado = nuevoEmpleado();
        PersonalDServicio personal = new PersonalDServicio();
        personal.setNombre(empleado.getNombre());
        personal.setApellido(empleado.getApellido());
        personal.setNumId(empleado.getNumId());
        personal.setEstadoCivil(empleado.getEstadoCivil());
        personal.setAnioIncorporacion(empleado.getAnioIncorporacion());
        personal.setNumeroDespacho(empleado.getNumeroDespacho());
        seccionDispo(personal);
        return personal;
    }

    protected void seccionDispo(PersonalDServicio personal) {
        Scanner scanner = new Scanner(System.in);
        SECCION[] secciones = SECCION.values();
        System.out.println("=========SECCIONES=========");
        int opc;
        for (int i = 0; i < secciones.length; i++) {
            System.out.println((i + 1) + " " + secciones[i]);
        }
        do{
            System.out.println("Ingrese la seccion correspondiente del personal: ");
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    personal.setSeccion(SECCION.BIBLIOTECA);
                    break;
                case 2:
                    personal.setSeccion(SECCION.DECANATO);
                    break;
                case 3:
                    personal.setSeccion(SECCION.SECRETARIA);
                    break;
                case 4:
                    personal.setSeccion(SECCION.CONSERJE);
                    break;
            }
        }while(opc != 1 && opc !=2 && opc != 3&&opc != 4&& opc !=5);

    }

    public void trasladoSeccion(PersonalDServicio personalDServicio) {
        System.out.println("=========TRASLADO DE SECCION A PERSONAL=========");
            seccionDispo(personalDServicio);
    }
}
