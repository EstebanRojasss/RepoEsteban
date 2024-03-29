package ejercicio6.servicios.hotelesServicio;

import ejercicio6.entidades.hoteles.Hotel;
import ejercicio6.entidades.hoteles.Hotel4Estrellas;


public class Hotel4Servicio extends HotelServicio {
    public Hotel4Estrellas datosHotelEstrellas() {
        Hotel hotel = datosHotel();
        Hotel4Estrellas hotelEstrellas = new Hotel4Estrellas();
        hotelEstrellas.setNombre(hotel.getNombre());
        hotelEstrellas.setDireccion(hotel.getDireccion());
        hotelEstrellas.setLocalidad(hotel.getLocalidad());
        hotelEstrellas.setGerente(hotel.getGerente());
        hotelEstrellas.setCantidadHabitaciones(hotel.getCantidadHabitaciones());
        hotelEstrellas.setNumeroCamas(hotel.getNumeroCamas());
        hotelEstrellas.setCantidadPisos(hotel.getCantidadPisos());
        System.out.println("El gimnasio es de tipo A o B: ");
        char tipoGym;
        do {
            tipoGym = sc.next().toUpperCase().charAt(0);
        } while (tipoGym != 'A' && tipoGym != 'B');
        switch (tipoGym) {
            case 'A':
                hotelEstrellas.setGimnasio('A');
                break;
            case 'B':
                hotelEstrellas.setGimnasio('B');
                break;
            default:
                System.out.println("------------");
        }
        System.out.println("Ingrese el nombre del restaurante: ");
        hotelEstrellas.setNombreRestaurante(sc.next());
        System.out.println("Ingrese la capacidad del restaurante: ");
        hotelEstrellas.setRestauranteCapacidad(sc.nextInt());
        hotelEstrellas.setPrecioHabitaciones(hotel.getPrecioHabitaciones()
                + valorAgregadoRestaurante(hotelEstrellas)
                + valorAgregadoGimnasio(hotelEstrellas));
        return hotelEstrellas;
    }

    public int valorAgregadoRestaurante(Hotel4Estrellas hotelEstrellas) {
        if (hotelEstrellas.getRestauranteCapacidad() < 30) {
            return 10;
        } else if (hotelEstrellas.getRestauranteCapacidad() > 29 && hotelEstrellas.getRestauranteCapacidad() <= 50) {
            return 30;
        }
        return 50;
    }

    public int valorAgregadoGimnasio(Hotel4Estrellas hotelEstrellas) {
        if (hotelEstrellas.getGimnasio() == 'A') {
            return 50;
        }
        return 30;
    }
}
