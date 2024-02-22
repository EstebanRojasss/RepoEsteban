package ejercicio5.servicios;


import ejercicio5.entidades.GestionPoliza;
import ejercicio5.enums.FORMAPAGO;
import ejercicio5.enums.TIPOCOBERTURA;

import java.time.LocalDate;

import java.util.Random;
import java.util.Scanner;

public class GestionDePolizaServicio {
    public void sistemaDePoliza(Scanner sc) {
        System.out.println("Ingrese la cantidad de polizas: ");
        int nPolizas = sc.nextInt();
        Random random = new Random();
        FORMAPAGO[] formapagos = FORMAPAGO.values();
        TIPOCOBERTURA[] tipocoberturas = TIPOCOBERTURA.values();
        GestionClienteServicio clienteServicio = new GestionClienteServicio();
        GestionVehiculoServicio vehiculoServicio = new GestionVehiculoServicio();
        GestionCuotaServicio gestionCuotaServicio = new GestionCuotaServicio();
        for (int i = 0; i < nPolizas; i++) {
            GestionPoliza gPoliza = new GestionPoliza();
            gPoliza.setCliente(clienteServicio.generarCliente());
            gPoliza.setVehiculo(vehiculoServicio.generarVehiculo());
            gPoliza.setNumeroPoliza(i);
            gPoliza.setFechaInicio(LocalDate.now());
            gPoliza.setFechaFin(LocalDate.now().plusYears(1));
            gPoliza.setCantidadCuotas(gPoliza.getFechaInicio().getMonthValue());
            gPoliza.setFormaPago(formapagos[random.nextInt(formapagos.length)]);
            gPoliza.setMontoTotalAsegurado(random.nextInt(1000, 2000));
            gPoliza.setTipoCobertura(tipocoberturas[random.nextInt(tipocoberturas.length)]);
            gPoliza.setContraGranizo(gPoliza.getTipoCobertura() == TIPOCOBERTURA.AMPLIA ||
                    gPoliza.getTipoCobertura() == TIPOCOBERTURA.TOTAL);
            gPoliza.setMontoMaximoGranizo(random.nextDouble(500, 600));
            gestionCuotaServicio.pagoDeCuota(gestionCuotaServicio.generarCuota(gPoliza), gPoliza);
            datosDeLaCuota(gPoliza);
        }
    }

    public static void datosDeLaCuota(GestionPoliza poliza){
        System.out.println(poliza.toString());
    }

}
