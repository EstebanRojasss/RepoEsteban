package ejercicio4.servicios;

import ejercicio4.entidades.Barco;
import ejercicio4.entidades.YateDeLujo;

public class YateServicio extends BarcoSerivicio{
    public YateDeLujo crearYate(){
        Barco barco = new Barco();
        YateDeLujo yate = new YateDeLujo();
        yate.setMatricula(barco.getMatricula());
        yate.setEslora(barco.getEslora());
        yate.setFechaFabricacion(barco.getFechaFabricacion());
        System.out.println("Ingrese la potencia en CV (Caballos de fuerza): ");
        yate.setPotenciaCV(sc.nextInt());
        System.out.println("Ingrese el numero de camarotes: ");
        yate.setNumeroCamarotes(sc.nextInt());
        return yate;
    }
}
