package ejercicio6.servicios;

import ejercicio6.entidades.Alojamiento;
import ejercicio6.entidades.Hotel;

public class HotelServicio extends AlojamientoServicio{

    public Hotel datosHotel(){
        Alojamiento alojamiento = nuevoAlojamiento();
        Hotel hotel = new Hotel();
        hotel.setNombre(alojamiento.getNombre());
        hotel.setDireccion(alojamiento.getDireccion());
        hotel.setLocalidad(alojamiento.getLocalidad());
        hotel.setGerente(alojamiento.getGerente());
        System.out.println("Ingrese la cantidad de habitaciones: ");
        hotel.setCantidadHabitaciones(sc.nextInt());
        System.out.println("Ingrese el numero de camas: ");
        hotel.setNumeroCamas(sc.nextInt());
        System.out.println("Ingrese la cantidad de pisos: ");
        hotel.setCantidadPisos(sc.nextInt());
        hotel.setPrecioHabitaciones(precioHabitacion());
        return hotel;
    }

    public double precioHabitacion(){
        return (50 + datosHotel().getPrecioHabitaciones());
    }


}
