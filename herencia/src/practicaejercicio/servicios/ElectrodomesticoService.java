package practicaejercicio.servicios;


import practicaejercicio.entidades.Electrodomestico;
import practicaejercicio.enums.COLORES____;
import practicaejercicio.enums.TIPO_CONSUMO;

import java.util.Arrays;
import java.util.Scanner;

public class ElectrodomesticoService extends Electrodomestico {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra
    es correcta, sino es correcta usara la letra F por defecto. Este método se debe
    invocar al crear el objeto y no será visible.
     */
    private static TIPO_CONSUMO comprobarConsumoEnergetico(char letra) {
        TIPO_CONSUMO[] consumoEnergetico = TIPO_CONSUMO.values();
        int contador = 0;
        while (contador < consumoEnergetico.length) {
            char letraAComparar = consumoEnergetico[contador].toString().charAt(0);
            if (Character.toUpperCase(letraAComparar) == letra) {
                return consumoEnergetico[contador];
            }
            contador++;
        }
        return TIPO_CONSUMO.F;
    }

    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y
    si no lo es, usa el color blanco por defecto. Los colores disponibles para los
    electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
    está en mayúsculas o en minúsculas. Este método se invocará al crear el
    objeto y no será visible.
     */
    private static COLORES____ comprobarColor(String color) {
        COLORES____[] colores = COLORES____.values();
        int contador = 0;
        while (contador < colores.length) {
            if (colores[contador].toString().equalsIgnoreCase(color)) {
                return colores[contador];
            }
            contador++;
        }
        return COLORES____.BLANCO;
    }

    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000.

     */
    public Electrodomestico crearElectrodomestico() {
        Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.setPrecio(1000);
        System.out.println("\n**************************************************");
        System.out.println("Ingrese el color del electrodomestico: ");
        System.out.println("OPCIONES DISPONIBLES");
        System.out.println(Arrays.toString(COLORES____.values()));
        System.out.print("Ingrese el color: ");
        String colorAINgresar = sc.next();
        electrodomestico.setColor(comprobarColor(colorAINgresar));
        System.out.println("\n**************************************************");
        System.out.println("Ingrese el consumo del electrodomestico: ");
        System.out.println("OPCIONES DISPONIBLES");
        System.out.println(Arrays.toString(TIPO_CONSUMO.values()));
        System.out.print("Ingrese el consumo: ");
        char letraAIngresar = sc.next().charAt(0);
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(letraAIngresar));
        System.out.println("\n**************************************************");
        System.out.println("Ingrese el peso del elctrodomestico: ");
        int pesoAIngresar = sc.nextInt();
        electrodomestico.setPeso(pesoAIngresar);
        return electrodomestico;
    }
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará
      el valor del precio. Esta es la lista de precios
     */

    public void precioFInal(Electrodomestico electrodomestico){

    }


}
