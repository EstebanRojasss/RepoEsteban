package ejercicio2.servicios;

import ejercicio2.enums.COLOR_ELECTRODOMESTICO;
import ejercicio2.enums.CONSUMO_ENERGETICO;
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
    private static char comprobarConsumoEnergetico(char letra) {
        CONSUMO_ENERGETICO[] nivelesDeCon = CONSUMO_ENERGETICO.values();
        int contador = 0;
        while (contador < nivelesDeCon.length) {
            if (nivelesDeCon[contador].toString().charAt(0) == letra) {
                return letra;
            }
            contador++;
        }
        return 'F';
    }

    private static String comprobarColor(String color) {
        COLOR_ELECTRODOMESTICO[] colores = COLOR_ELECTRODOMESTICO.values();
        int contador = 0;
        while (contador < colores.length) {
            if (colores[contador].toString().equalsIgnoreCase(color)) {
                return color.toUpperCase();
            }
            contador++;
        }
        return COLOR_ELECTRODOMESTICO.BLANCO.toString();
    }

    public crearElectrodomestico()
}