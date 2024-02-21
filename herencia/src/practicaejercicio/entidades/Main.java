package practicaejercicio.entidades;

import practicaejercicio.servicios.LavadoraService;
import practicaejercicio.servicios.TelevisorService;

/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
public class Main {
    public static void main(String [] args){
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        for(int i = 0; i < 2; i++){
            System.out.println("DATOS DE LAVADORA");
            Lavadora lavadora = ls.crearLavadora();
            ls.precioFinal(lavadora);
            System.out.println("El precio de la lavadora es: " + lavadora.getPrecio());
            System.out.println("DATOS DE TELEVISOR");
            Televisor televisor = ts.crearTelevisor();
            ts.precioFInal(televisor);
            System.out.println("El precio del televisor es: "+ televisor.getPrecio());
        }


    }
}
