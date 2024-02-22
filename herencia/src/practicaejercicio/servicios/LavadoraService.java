package practicaejercicio.servicios;


import practicaejercicio.entidades.Electrodomestico;
import practicaejercicio.entidades.Lavadora;

/*
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
 */
public class LavadoraService extends ElectrodomesticoService{
    public Lavadora crearLavadora(){
        Electrodomestico electrodomestico = crearElectrodomestico();
        Lavadora lavadora = new Lavadora();
        lavadora.setPrecio(electrodomestico.getPrecio());
        lavadora.setColor(electrodomestico.getColor());
        lavadora.setConsumoEnergetico(electrodomestico.getConsumoEnergetico());
        lavadora.setPeso(electrodomestico.getPeso());
        System.out.println("**************************************************");
        System.out.print("Ingrese la cantidad de carga que soporta la lavadora: ");
        System.out.println();
        lavadora.setCarga(sc.nextInt());
        return lavadora;
    }
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
     */
    public double precioFinal(Lavadora lavadora){
        super.precioFinal(lavadora);
        if(lavadora.getCarga() > 30){
            lavadora.setPrecio(lavadora.getPrecio() + 500);
        }
        return lavadora.getPrecio();
    }
}
