package ejercicio6.servicios;

import ejercicio6.entidades.Alojamiento;

import java.util.Scanner;

public class AlojamientoServicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
   public Alojamiento nuevoAlojamiento() {
       Alojamiento alojamiento = new Alojamiento();
       System.out.println("===========================================");
       System.out.println("Ingrese el nombre del alojamiento: ");
       alojamiento.setNombre(sc.next());
       System.out.println("Ingrese la direccion: ");
       alojamiento.setDireccion(sc.next());
       System.out.println("Ingrese la localidad: ");
       alojamiento.setLocalidad(sc.next());
       System.out.println("Ingrese el nombre del gerente: ");
       alojamiento.setGerente(sc.next());
       return alojamiento;
   }
}
