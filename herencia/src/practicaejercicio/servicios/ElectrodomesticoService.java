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
            if (letraAComparar == Character.toUpperCase(letra)) {
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
        System.out.println("**************************************************");
        electrodomestico.setPrecio(1000);
        System.out.println("OPCIONES DE COLOR");
        System.out.println(Arrays.toString(COLORES____.values()));
        System.out.print("Ingrese el color: ");
        String colorAINgresar = sc.next();
        electrodomestico.setColor(comprobarColor(colorAINgresar));
        System.out.println("**************************************************");
        System.out.println("OPCIONES DE CONSUMO");
        System.out.println(Arrays.toString(TIPO_CONSUMO.values()));
        System.out.print("Ingrese el tipo de consumo: ");
        char letraAIngresar = sc.next().charAt(0);
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(letraAIngresar));
        System.out.println("**************************************************");
        System.out.print("Ingrese el peso:  ");
        int pesoAIngresar = sc.nextInt();
        electrodomestico.setPeso(pesoAIngresar);
        return electrodomestico;
    }
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará
      el valor del precio. Esta es la lista de precios
     */

    public void precioFinal(Electrodomestico electrodomestico) {
        char letraAComprobar = electrodomestico.getConsumoEnergetico().name().charAt(0);
        switch (letraAComprobar) {
            case 'A':
                electrodomestico.setPrecio(electrodomestico.getPrecio() + TIPO_CONSUMO.A.getPrecioConusmo());
                break;
            case 'B':
                electrodomestico.setPrecio(electrodomestico.getPrecio() +TIPO_CONSUMO.B.getPrecioConusmo());
                break;
            case 'C':
                electrodomestico.setPrecio(electrodomestico.getPrecio() +TIPO_CONSUMO.C.getPrecioConusmo());
                break;
            case 'D':
                electrodomestico.setPrecio(electrodomestico.getPrecio() +TIPO_CONSUMO.D.getPrecioConusmo());
                break;
            case 'E':
                electrodomestico.setPrecio(electrodomestico.getPrecio() +TIPO_CONSUMO.E.getPrecioConusmo());
                break;
            case 'F':
                electrodomestico.setPrecio(electrodomestico.getPrecio() +TIPO_CONSUMO.F.getPrecioConusmo());
                break;
        }
        if (electrodomestico.getPeso() > 0 && electrodomestico.getPeso() < 20) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 100);
        } else if (electrodomestico.getPeso() > 19 && electrodomestico.getPeso() < 50) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 500);
        } else if (electrodomestico.getPeso() > 49 && electrodomestico.getPeso() < 80) {
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 800);
        } else if(electrodomestico.getPeso() > 79){
            electrodomestico.setPrecio(electrodomestico.getPrecio() + 1000);
        }
    }
}
