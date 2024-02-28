package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import ejercicio7.enums.ESTADO_CIVIL;

import java.time.LocalDate;
import java.util.Scanner;

public class EmpleadoServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Empleado nuevoEmpleado() {
        Empleado empleado = new Empleado();
        empleado.setNombre(sc.next());
        empleado.setApellido(sc.next());
        empleado.setNumId(sc.nextInt());
        do {
            System.out.print("Ingrese el estado civil: ");
            empleado.setEstadoCivil(estadoCivil(sc.next()));
        } while (empleado.getEstadoCivil() != null);
        System.out.println("Ingrese la fecha de incorporacion del funcionario: DD/MM/AAAA");
        empleado.setAnioIncorporacion();
        empleado.setNumeroDespacho(sc.nextInt());
    }

    public ESTADO_CIVIL estadoCivil(String estadoCivilIngreso) {
        for (ESTADO_CIVIL estadoCivil : ESTADO_CIVIL.values()) {
            if (estadoCivilIngreso.equalsIgnoreCase(estadoCivil.toString())) {
                return estadoCivil;
            }
        }
        return null;
    }
}
