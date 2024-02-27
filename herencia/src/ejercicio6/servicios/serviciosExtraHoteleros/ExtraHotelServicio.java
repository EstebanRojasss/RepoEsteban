package ejercicio6.servicios.serviciosExtraHoteleros;

import ejercicio6.entidades.Alojamiento;
import ejercicio6.entidades.extraHotel.ExtraHotel;
import ejercicio6.servicios.AlojamientoServicio;


public class ExtraHotelServicio extends AlojamientoServicio {

    public ExtraHotel extraHotelDatos() {
        Alojamiento alojamiento = nuevoAlojamiento();
        ExtraHotel extraHotel = new ExtraHotel();
        extraHotel.setNombre(alojamiento.getNombre());
        extraHotel.setDireccion(alojamiento.getDireccion());
        extraHotel.setLocalidad(alojamiento.getLocalidad());
        extraHotel.setGerente(alojamiento.getGerente());
        char opcion;
        do {
            System.out.println("Alojamiento privado: S|N");
            opcion = sc.next().toUpperCase().charAt(0);
        } while (opcion != 'S' && opcion != 'N');
        extraHotel.setPrivado(opcion == 'S');
        System.out.println("Ingrese la cantidad de metros cuadrados del establecimento: ");
        extraHotel.setCantidadMetros2(sc.nextInt());
        return extraHotel;
    }
}
