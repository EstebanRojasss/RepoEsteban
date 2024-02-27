package ejercicio6.servicios.serviciosExtraHoteleros;

import ejercicio6.entidades.extraHotel.Camping;
import ejercicio6.entidades.extraHotel.ExtraHotel;


public class CampingServicio extends ExtraHotelServicio {

    public Camping datosCamping() {
        ExtraHotel extraHotel = extraHotelDatos();
        Camping camping = new Camping();
        camping.setNombre(extraHotel.getNombre());
        camping.setDireccion(extraHotel.getDireccion());
        camping.setLocalidad(extraHotel.getLocalidad());
        camping.setGerente(extraHotel.getGerente());
        camping.setPrivado(extraHotel.isPrivado());
        camping.setCantidadMetros2(extraHotel.getCantidadMetros2());
        System.out.println("Ingrese la capacidad capcidad máxima de carpas: ");
        camping.setCapMaxCarpas(sc.nextInt());
        System.out.println("Ingrese la cantidad de banhos disponibles: ");
        camping.setCantBanhosDispo(sc.nextInt());
        char opcion;
        do {
            System.out.println("Restaurante disponible: S|N");
            opcion = sc.next().toUpperCase().charAt(0);
        } while (opcion != 'S' && opcion != 'N');
        camping.setRestauranteDispo(opcion == 'S');
        return camping;
    }

}
