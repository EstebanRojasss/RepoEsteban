package ejercicio2.servicios;

import ejercicio2.entidades.Electrodomestico;
import ejercicio2.enums.COLOR_ELECTRODOMESTICO;
import ejercicio2.enums.CONSUMO_ENERGETICO;

import java.util.Arrays;
import java.util.Scanner;

/*
 Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.
Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio. Este método debe
llamar al método padre y añadir el código necesario. Recuerda que las
condiciones que hemos visto en la clase Electrodoméstico también deben
afectar al precio.
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
public class ElectrodomesticoSerivicio {
    private CONSUMO_ENERGETICO comprobarConsumoEnergetico(char letra) {
        CONSUMO_ENERGETICO[] nivelesDeCon = CONSUMO_ENERGETICO.values();
        int contador = 0;
        while (contador < nivelesDeCon.length) {
            char c = nivelesDeCon[contador].toString().charAt(0);
            if (c == Character.toUpperCase(letra)) {
                return nivelesDeCon[contador];
            }
            contador++;
        }
        return CONSUMO_ENERGETICO.F;
    }

    private COLOR_ELECTRODOMESTICO comprobarColor(String colorIngresado) {
        COLOR_ELECTRODOMESTICO[] colores = COLOR_ELECTRODOMESTICO.values();
        int contador = 0;
        while (contador < colores.length) {
            String colorr = colores[contador].toString();
            if (colorr.equalsIgnoreCase(colorIngresado)) {
                return colores[contador];
            }
            contador++;
        }
        return COLOR_ELECTRODOMESTICO.BLANCO;
    }

    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el
    consumo. Al precio se le da un valor base de $1000.
     */
    public Electrodomestico crearElectrodomestico() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.setPrecio(1000);
        System.out.println("Ingrese el color del electrodomestico: ");
        System.out.println("COLORES DISPONIBLES: " +
                "\n" + Arrays.toString(COLOR_ELECTRODOMESTICO.values()));
        System.out.print("Ingresar color: ");
        String color = sc.next();
        electrodomestico.setColor(comprobarColor(color));
        System.out.println("Ingrese el tipo de consumo energetico: ");
        System.out.println("TIPOS: " +
                "\n" + Arrays.toString(CONSUMO_ENERGETICO.values()));
        System.out.print("Ingresar tipo: ");
        char tipoConsumoo = sc.next().charAt(0);
        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(tipoConsumoo));
        System.out.println("Ingrese el peso del electrodomestico: ");
        double pesoElectrodomestico = sc.nextDouble();
        electrodomestico.setPeso(pesoElectrodomestico);
        precioFinal(electrodomestico);
        return electrodomestico;
    }

    /*
    Método precioFinal(): según el consumo energético y su tamaño, aumentará
    el valor del precio. Esta es la lista de precios
     */
    public void precioFinal(Electrodomestico electroD) {
        char letra = electroD.getConsumoEnergetico().name().charAt(0);
        switch (letra) {
            case 'A':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.A.getPrecios());
                break;
            case 'B':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.B.getPrecios());
                break;
            case 'C':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.C.getPrecios());
                break;
            case 'D':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.D.getPrecios());
                break;
            case 'E':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.E.getPrecios());
                break;
            case 'F':
                electroD.setPrecio(electroD.getPrecio() + CONSUMO_ENERGETICO.F.getPrecios());
                break;
        }
        if(electroD.getPeso()>0 && electroD.getPeso()<20){
            electroD.setPrecio(electroD.getPrecio() + 100);
        }else if(electroD.getPeso()>19 && electroD.getPeso() < 50){
            electroD.setPrecio(electroD.getPrecio() + 500);
        }else if(electroD.getPeso() > 49 && electroD.getPeso() < 80){
            electroD.setPrecio(electroD.getPrecio() + 800);
        }else {
            electroD.setPrecio(electroD.getPrecio() + 1000);
        }
    }


}

