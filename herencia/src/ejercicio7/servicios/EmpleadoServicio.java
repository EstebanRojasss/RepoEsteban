package ejercicio7.servicios;

import ejercicio7.entidades.Empleado;
import java.time.LocalDate;
import java.util.Scanner;

public class EmpleadoServicio extends PersonaServicio{
   protected Scanner sc = new Scanner(System.in).useDelimiter("\n");
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
        System.out.print("Ingrese el numero de despacho: ");
        empleado.setNumeroDespacho(sc.nextInt());
        return empleado;
    }

    public void reasignacionDespacho(Empleado empleado){
        System.out.println("=========REASIGNACION DE DESPACHO=========");
        System.out.print("Ingrese el numero de despacho para reasignar: ");
        empleado.setNumeroDespacho(sc.nextInt());
    }
}
