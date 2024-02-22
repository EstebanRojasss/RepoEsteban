package ejercicio4.servicios;

import ejercicio4.entidades.Barco;
import ejercicio4.entidades.Velero;

public class VeleroServicio extends BarcoSerivicio{
    public Barco datosVelero(){
        Barco barco = new Barco();
        Velero velero = new Velero();
        velero.setMatricula(barco.getMatricula());
        velero.setEslora(barco.getMatricula());
        velero.setFechaFabricacion(barco.getFechaFabricacion());
        System.out.println("Ingrese el numero de mástiles del velero: ");
        velero.setNumeroDeMastiles(sc.nextInt());
        return barco;
    }

}
