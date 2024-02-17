package ejercicio2.servicios;


import ejercicio2.entidades.Electrodomestico;
import ejercicio2.entidades.Televisor;

import java.util.Random;
import java.util.Scanner;

/*
 Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
 */
public class TelevisorServicio extends ElectrodomesticoSerivicio{

    public Televisor crearTelevisor(){
        Random random = new Random();
        Electrodomestico electrodomestico = crearElectrodomestico();
        Televisor televisor = new Televisor();
        televisor.setPrecio(electrodomestico.getPrecio());
        televisor.setColor(electrodomestico.getColor());
        televisor.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        int pulgadas = sc.nextInt();
        televisor.setPulgadas(pulgadas);
        televisor.setSintonizadorTDTdispo(random.nextBoolean());
        return televisor;
    }

    public void precioFinal(Televisor televisor) {
        super.precioFinal(televisor);
        if(televisor.getPulgadas() > 40){
            televisor.setPrecio(televisor.getPrecio() * 1.30);
        }
        if(televisor.isSintonizadorTDTdispo()){
            televisor.setPrecio(televisor.getPrecio() + 500);
        }
        System.out.println("El precio del televisor es: " + televisor.getPrecio());
    }
}
