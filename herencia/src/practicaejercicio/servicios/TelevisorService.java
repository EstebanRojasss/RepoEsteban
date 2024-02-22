package practicaejercicio.servicios;

import practicaejercicio.entidades.Electrodomestico;
import practicaejercicio.entidades.Televisor;

public class TelevisorService extends ElectrodomesticoService {
    /*
    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la
    clase padre, lo utilizamos para llenar los atributos heredados del padre y
    después llenamos los atributos del televisor.
     */
    public Televisor crearTelevisor() {
        Electrodomestico electro = crearElectrodomestico();
        Televisor televisor = new Televisor();
        televisor.setColor(electro.getColor());
        televisor.setConsumoEnergetico(electro.getConsumoEnergetico());
        televisor.setPeso(electro.getPeso());
        televisor.setPrecio(electro.getPrecio());
        System.out.println("**************************************************");
        System.out.print("Ingrese la cantidad de pulgadas del televisor: ");
        int pulgadas = sc.nextInt();
        televisor.setPulgadas(pulgadas);

        System.out.println("**************************************************");
        System.out.println("Desea agregar al televisor un sintonizadorTDT?: S/N");
        char resp = sc.next().charAt(0);
        if (Character.toUpperCase(resp) == 'S') {
            televisor.setTieneSintonizadorTDT(true);
        }
        return televisor;
    }
    /*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
     */

    public double precioFInal(Televisor televisor) {
        super.precioFinal(televisor);
        if (televisor.getPulgadas() > 40) {
            televisor.setPrecio(televisor.getPrecio() * 1.3);
        }
        if (televisor.isTieneSintonizadorTDT()) {
            televisor.setPrecio(televisor.getPrecio() + 500);
        }
        return televisor.getPrecio();
    }
}
