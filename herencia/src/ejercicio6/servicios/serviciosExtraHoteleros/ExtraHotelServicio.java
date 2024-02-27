package ejercicio6.servicios.serviciosExtraHoteleros;

import ejercicio6.entidades.Alojamiento;
import ejercicio6.entidades.extraHotel.ExtraHotel;
import ejercicio6.servicios.AlojamientoServicio;


public class ExtraHotelServicio extends AlojamientoServicio {

    public void extraHotelDatos(){
        Alojamiento alojamiento = nuevoAlojamiento();
        ExtraHotel extraHotel = new ExtraHotel();
        extraHotel.setNombre(alojamiento.getNombre());
        extraHotel.setDireccion(alojamiento.getDireccion());
        extraHotel.setLocalidad(alojamiento.getLocalidad());
        extraHotel.setGerente(alojamiento.getGerente());
        System.out.println("Alojamiento privado: S|N");
        char opcion;
        do{
            opcion =sc.next().toUpperCase().charAt(0);
        }while(opcion != 'S' && opcion != 'N');
        extraHotel.setPrivado(opcion == 'S');
        System.out.println("Ingrese la cantidad de metros cuadrados del establecimento: ");
        extraHotel.setCantidadMetros2();
    }
}
