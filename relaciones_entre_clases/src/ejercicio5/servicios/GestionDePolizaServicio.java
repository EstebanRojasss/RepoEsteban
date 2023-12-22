package ejercicio5.servicios;


import ejercicio5.entidades.GestionPoliza;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class GestionDePolizaServicio {
    public void sistemaDePoliza(Scanner sc) {
        System.out.println("Ingrese la cantidad de polizas: ");
        int nPolizas = sc.nextInt();
        Random random = new Random();
        for(int i = 0 ; i < nPolizas; i++){
            GestionPoliza gPoliza = new GestionPoliza();
            GestionClienteServicio clienteServicio = new GestionClienteServicio();
            GestionVehiculoServicio vehiculoServicio = new GestionVehiculoServicio();
            gPoliza.setCliente(clienteServicio.generarCliente());
            gPoliza.setVehiculo(vehiculoServicio.generarVehiculo());
            gPoliza.setNumeroPoliza(i);
            int LocalDate = ;
            gPoliza.setFechaInicio(new Date(LocalDateTime.of(LocalDate)));
        }
    }
}
