package ejercicio6.servicios.hotelesServicio;

import ejercicio6.entidades.Alojamiento;
import ejercicio6.entidades.hoteles.Hotel;
import ejercicio6.servicios.AlojamientoServicio;

public class HotelServicio extends AlojamientoServicio {

    public Hotel datosHotel(){
        Alojamiento alojamiento = nuevoAlojamiento();
        Hotel hotel = new Hotel();
        hotel.setNombre(alojamiento.getNombre());
        hotel.setDireccion(alojamiento.getDireccion());
        hotel.setLocalidad(alojamiento.getLocalidad());
        hotel.setGerente(alojamiento.getGerente());
        System.out.println("Ingrese la cantidad de habitaciones por piso: ");
        hotel.setCantidadHabitaciones(sc.nextInt());
        System.out.println("Ingrese el numero de camas por habitacion: ");
        hotel.setNumeroCamas(sc.nextInt());
        System.out.println("Ingrese la cantidad de pisos: ");
        hotel.setCantidadPisos(sc.nextInt());
        hotel.setPrecioHabitaciones(precioHabitacion(hotel));
        return hotel;
    }

    public double precioHabitacion(Hotel hotel){
        int kpcidadPersonasXPiso = hotel.getCantidadHabitaciones() * hotel.getNumeroCamas();
        int kpcidadTotal = kpcidadPersonasXPiso * hotel.getCantidadPisos();
        return (50 + (kpcidadTotal));
    }


}
