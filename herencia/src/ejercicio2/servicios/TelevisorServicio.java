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
        televisor.setColor(electrodomestico.getColor());
        televisor.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        System.out.println("Ingrese las pulgadas del televisor: ");
        int pulgadas = sc.nextInt();
        televisor.setPulgadas(pulgadas);
        televisor.setPeso(electrodomestico.getPeso());
        televisor.setPrecio(electrodomestico.getPrecio());
        System.out.println("Desea que el televisor cuente con sintentizador? S/N");
        char respuesta = sc.next().charAt(0);
        televisor.setSintonizadorTDTdispo(Character.toUpperCase(respuesta) == 'S');
        return televisor;
    }

    public double precioFinal(Televisor televisor) {
        super.precioFinal(televisor);
        if(televisor.getPulgadas() >= 40){
            televisor.setPrecio((televisor.getPrecio() * 1.3));
        }
        if(televisor.isSintonizadorTDTdispo()){
            televisor.setPrecio(televisor.getPrecio() + 500);
        }
        return televisor.getPrecio();
    }
}
