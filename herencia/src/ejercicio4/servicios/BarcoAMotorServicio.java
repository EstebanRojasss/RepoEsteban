package ejercicio4.servicios;

import ejercicio4.entidades.Barco;
import ejercicio4.entidades.BarcoAMotor;

public class BarcoAMotorServicio extends BarcoSerivicio{
    public BarcoAMotor crearBarcoAMotor(){
        Barco barco = crearBarco();
        BarcoAMotor barcoAMotor = new BarcoAMotor();
        barcoAMotor.setMatricula(barco.getMatricula());
        barcoAMotor.setEslora(barco.getEslora());
        barcoAMotor.setFechaFabricacion(barco.getFechaFabricacion());
        System.out.println("Ingrese la potencia en CV (Caballos de fuerza): ");
        barcoAMotor.setPotenciaCV(sc.nextInt());
        return barcoAMotor;
    }
}
