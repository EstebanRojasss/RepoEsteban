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
        hotel.setCantidadPisos(sc.nextInt());
        System.out.println("Ingrese la cantidad de pisos: ");
        hotel.setCantidadPisos(sc.nextInt());
        System.out.println("Ingrese el precio de las habitaciones: ");
        hotel.setPrecioHabitaciones(sc.nextDouble());
        return hotel;
    }
    public void precioHabitacion(Hotel hotel, int valorAgregadoRestaurante,int valorAgregadoGimnasio){
        hotel.setPrecioHabitaciones(50 + (hotel.getCantidadHabitaciones()) + (valorAgregadoRestaurante));
    }
}
