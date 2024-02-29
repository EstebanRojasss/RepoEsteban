package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import ejercicio7.enums.ESTADO_CIVIL;

import java.time.LocalDate;
import java.util.Scanner;

public class EmpleadoServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Empleado nuevoEmpleado() {
        Empleado empleado = new Empleado();
        System.out.println("=========DATOS DE EMPLEADO=========");
        System.out.print("Ingrese el nombre: ");
        empleado.setNombre(sc.next());
        System.out.print("Ingrese el apellido: ");
        empleado.setApellido(sc.next());
        System.out.print("Ingrese el Id: ");
        empleado.setNumId(sc.nextInt());
        do {
            System.out.print("Ingrese el estado civil: ");
            empleado.setEstadoCivil(estadoCivil(sc.next()));
        } while (empleado.getEstadoCivil() != null);

        System.out.print("Ingrese la fecha de incorporacion del funcionario / AAAA-MM-DD (INCLUIR GUIONES): ");
        empleado.setAnioIncorporacion(LocalDate.parse(sc.next()));
        empleado.setNumeroDespacho(sc.nextInt());
        return empleado;
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
