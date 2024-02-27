package ejercicio6.servicios.serviciosExtraHoteleros;

import ejercicio6.entidades.extraHotel.ExtraHotel;
import ejercicio6.entidades.extraHotel.Residencia;

import java.util.Random;

public class ResidenciaServicio extends ExtraHotelServicio{
    public Residencia datosResidencia(){
        Random random = new Random();
        ExtraHotel extraHotel = extraHotelDatos();
        Residencia residencia = new Residencia();
        residencia.setNombre(extraHotel.getNombre());
        residencia.setDireccion(extraHotel.getDireccion());
        residencia.setLocalidad(extraHotel.getLocalidad());
        residencia.setGerente(extraHotel.getGerente());
        residencia.setPrivado(extraHotel.isPrivado());
        residencia.setCantidadMetros2(extraHotel.getCantidadMetros2());
        char opcion;
        do{
            System.out.println("Campo deportivo disponible: S|N");
            opcion = sc.next().toUpperCase().charAt(0);
        }while (opcion != 'S' && opcion != 'N');
        residencia.setCampoDeportivo(opcion == 'S');
        System.out.println("Ingrese la cantiad de habitaciones");
        residencia.setCantHabitaciones(sc.nextInt());
        residencia.setDescuentoAGremio(random.nextBoolean());
        return residencia;
    }
}
