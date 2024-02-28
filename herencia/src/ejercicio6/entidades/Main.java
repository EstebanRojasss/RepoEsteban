package ejercicio6.entidades;

import ejercicio6.entidades.extraHotel.Camping;
import ejercicio6.entidades.extraHotel.Residencia;
import ejercicio6.entidades.hoteles.Hotel;
import ejercicio6.entidades.hoteles.Hotel4Estrellas;
import ejercicio6.entidades.hoteles.Hotel5Estrellas;
import ejercicio6.servicios.hotelesServicio.Hotel4Servicio;
import ejercicio6.servicios.hotelesServicio.Hotel5Servicio;
import ejercicio6.servicios.serviciosExtraHoteleros.CampingServicio;
import ejercicio6.servicios.serviciosExtraHoteleros.ResidenciaServicio;

import java.util.ArrayList;

/*
 Una compañía de promociones turísticas desea mantener información sobre la
infraestructura de alojamiento para turistas, de forma tal que los clientes puedan
planear sus vacaciones de acuerdo a sus posibilidades. Los alojamientos se
identifican por un nombre, una dirección, una localidad y un gerente encargado
del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles y
Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas,
Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco
estrellas. Las características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las
Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos,
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad
Salones de Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio
de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más
limosinas tenga el hotel, más caro será.
El precio de una habitación debe calcularse de acuerdo a la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los
de los hoteles, estando más orientados a la vida al aire libre y al turista de bajos
recursos. Por cada Alojamiento Extrahotelero se indica si es privado o no, así
como la cantidad de metros cuadrados que ocupa. Existen dos tipos de
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y
si posee o no campo deportivo. Realizar un programa en el que se representen
todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes
criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
public class Main {
    public static void main(String[] args) {
        Hotel5Servicio hotel5S = new Hotel5Servicio();
        Hotel4Servicio hotel4S = new Hotel4Servicio();
        CampingServicio campingS = new CampingServicio();
        ResidenciaServicio residenciaS = new ResidenciaServicio();
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        // AGREGAR ALOJAMIENTOS
        for (int i = 0; i < 2; i++) {
            System.out.println("================HOTEL 5 ESTRELLAS================");
            Hotel5Estrellas hotel5Estrellas = hotel5S.datos5Estrellas();
            alojamientos.add(hotel5Estrellas);
            System.out.println("================HOTEL 4 ESTRELLAS================");
            Hotel4Estrellas hotel4Estrellas = hotel4S.datosHotelEstrellas();
            alojamientos.add(hotel4Estrellas);
            System.out.println("================CAMPING================");
            Camping camping = campingS.datosCamping();
            alojamientos.add(camping);
            System.out.println("================RESIDENCIA================");
            Residencia residencia = residenciaS.datosResidencia();
            alojamientos.add(residencia);
        }

        // MOSTRAR TODOS LOS ALOJAMIENTOS DISPONIBLES
        System.out.println("================ALOJAMIENTOS DISPONIBLES================");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel5Estrellas hotel5) {
                System.out.println(hotel5);
            }
            else if (alojamiento instanceof Hotel4Estrellas hotel4) {
                System.out.println(hotel4);
            } else if (alojamiento instanceof Camping camping) {
                System.out.println(camping);
            } else if (alojamiento instanceof Residencia residencia) {
                System.out.println(residencia);
            }
        }

        // MOSTRAR HOTEL MAS CAROS A MAS BARATOS
        System.out.println("================HOTELES DE MAYOR COSTO A MENOR================");
        System.out.println(hotelesMayorAMenor(alojamientos));
       // MOSTRAR CAMPINGS CON RESTAURANTE
        System.out.println("================CAMPINGS CON RESTAURANTE================");
        System.out.println(campingsConRestaur(alojamientos) + "\n");
        // MOSTRAR RESIDENCIAS CON DESCUENTO
        System.out.println("================RESIDENCIAS CON DESCUENTO================");
        System.out.println(residenciasConDesc(alojamientos));
    }

    public static ArrayList<Hotel> hotelesMayorAMenor(ArrayList<Alojamiento>alojamientos){
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for(Alojamiento alojamiento : alojamientos){
            if(alojamiento instanceof Hotel hotel){
                hoteles.add(hotel);
                hoteles.sort(hotel.compararPrecios);
            }
        }
        return hoteles;
    }
    public static ArrayList<Camping> campingsConRestaur(ArrayList<Alojamiento>alojamientos){
        ArrayList<Camping>campings = new ArrayList<>();
        for(Alojamiento alojamiento : alojamientos){
            if(alojamiento instanceof Camping camping && camping.isRestauranteDispo()){
                campings.add(camping);
            }
        }
        return campings;
    }
    public static ArrayList<Residencia> residenciasConDesc(ArrayList<Alojamiento>alojamientos){
        ArrayList<Residencia>residencias = new ArrayList<>();
        for(Alojamiento alojamiento : alojamientos){
            if(alojamiento instanceof Residencia residencia && residencia.isDescuentoAGremio()){
                residencias.add(residencia);
            }
        }
        return residencias;
    }
}
