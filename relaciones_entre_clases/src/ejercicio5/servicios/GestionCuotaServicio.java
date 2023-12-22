package ejercicio5.servicios;



import ejercicio5.entidades.GestionCuota;
import ejercicio5.entidades.GestionPoliza;
import ejercicio5.enums.FORMAPAGO;

import java.util.Random;

public class GestionCuotaServicio {
    public GestionCuota generarCuota(GestionPoliza poliza){
        Random random = new Random();
        FORMAPAGO[]formapagos = FORMAPAGO.values();
        GestionCuota gestionCuota = new GestionCuota();
        gestionCuota.setNumeroCuota(poliza.getCantidadCuotas());
        gestionCuota.setMontoTotalCuota(poliza.getMontoTotalAsegurado()/poliza.getCantidadCuotas());
        gestionCuota.setFechaVencimiento(poliza.getFechaFin());
        gestionCuota.setFormaPago(formapagos[random.nextInt(formapagos.length)]);
        gestionCuota.setPagada(false);
        return gestionCuota;
    }

    public void pagoDeCuota(GestionCuota gestionCuota, GestionPoliza gestionPoliza){
        do{
            gestionCuota.setPagada(true);
            gestionCuota.setNumeroCuota(gestionCuota.getNumeroCuota() - 1);
            gestionCuota.setMontoTotalCuota(gestionPoliza.getMontoTotalAsegurado()
                    - gestionCuota.getMontoTotalCuota());
        }while(gestionCuota.getNumeroCuota() == 0);
        System.out.println(gestionCuota.);
    }


}
