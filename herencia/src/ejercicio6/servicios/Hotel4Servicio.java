package ejercicio6.servicios;

import ejercicio6.entidades.Hotel;
import ejercicio6.entidades.Hotel4Estrellas;


public class Hotel4Servicio extends HotelServicio {
    public Hotel4Estrellas datosHotelEstrellas() {
        Hotel hotel = datosHotel();
        Hotel4Estrellas hotelEstrellas = new Hotel4Estrellas();
        hotelEstrellas.setNombre(hotel.getNombre());
        hotelEstrellas.setDireccion(hotel.getDireccion());
        hotelEstrellas.setLocalidad(hotel.getLocalidad());
        hotelEstrellas.setGerente(hotel.getGerente());
        System.out.println("El gimnasio es de tipo A o B: ");
        char tipoGym;
        do {
            tipoGym = sc.next().toUpperCase().charAt(0);
        } while (tipoGym != 'A' && tipoGym != 'B');
        switch (tipoGym){
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
        return hotelEstrellas;
    }
}
