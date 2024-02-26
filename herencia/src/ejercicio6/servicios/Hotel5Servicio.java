package ejercicio6.servicios;

import ejercicio6.entidades.Hotel4Estrellas;
import ejercicio6.entidades.Hotel5Estrellas;

public class Hotel5Servicio extends Hotel4Servicio{
    public Hotel5Estrellas datos5Estrellas(){
        Hotel4Estrellas hotelEstrellas = datosHotelEstrellas();
        Hotel5Estrellas hotel5Estrellas = new Hotel5Estrellas();
        hotel5Estrellas.setNombre(hotelEstrellas.getNombre());
        hotel5Estrellas.setDireccion(hotelEstrellas.getDireccion());
        hotel5Estrellas.setLocalidad(hotelEstrellas.getLocalidad());
        hotel5Estrellas.setGerente(hotelEstrellas.getGerente());
        hotel5Estrellas.setGimnasio(hotelEstrellas.getGimnasio());
        hotel5Estrellas.setNombreRestaurante(hotelEstrellas.getNombreRestaurante());
        hotel5Estrellas.setRestauranteCapacidad(hotelEstrellas.getRestauranteCapacidad());
        System.out.println("Ingrese la cantidad de salones de conferencia: ");
        hotel5Estrellas.setCantSalonesDeConferencia(sc.nextInt());
        System.out.println("Ingrese la cantidad de suites: ");
        hotel5Estrellas.setCantSuites(sc.nextInt());
        System.out.println("Ingrese la cantidad de limosinas: ");
        hotel5Estrellas.setCantLimosinas(sc.nextInt());
        return hotel5Estrellas;
    }
}
