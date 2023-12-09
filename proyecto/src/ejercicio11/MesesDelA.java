package ejercicio11;

import java.util.Scanner;

/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
public class MesesDelA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String[] mesesDelAnio = new String[12];
        boolean mesAcertado = false;
        System.out.println("Ingrese los meses del anio: ");
        for (int i = 0; i < mesesDelAnio.length; i++) {
            mesesDelAnio[i] = sc.next();
        }

        do {
            System.out.println("Adivine el mes secreto: ");
            String mes = sc.next();
            String mesSecreto = mesesDelAnio[6];
            if (mes.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Ha acertado!");
                mesAcertado = true;
            } else System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
        } while (!mesAcertado);
    }
}
