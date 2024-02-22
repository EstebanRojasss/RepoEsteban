package apracticaejercici0.entidades;

import apracticaejercici0.servicios.LavadoraService;
import apracticaejercici0.servicios.TelevisorService;

import java.util.ArrayList;
import java.util.Scanner;

/*
-----------------------CONTINUACION----------------------------------------
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        LavadoraService ls = new LavadoraService();
        TelevisorService ts = new TelevisorService();
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
        int menu;
        int contador = 0;
        do {
            System.out.println("===============================");
            System.out.println("1. Agregar lavadora");
            System.out.println("2. Agregar televisor");
            System.out.println("   Ingrese la opcion: ");
            System.out.println("===============================");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    Lavadora lavadora = ls.crearLavadora();
                    ls.precioFinal(lavadora);
                    electrodomesticos.add(lavadora);
                    contador++;
                    break;
                case 2:
                    Televisor televisor = ts.crearTelevisor();
                    ts.precioFInal(televisor);
                    electrodomesticos.add(televisor);
                    contador++;
                    break;
            }
        } while (menu != 1 && menu != 2 || contador < 4);

        for(Electrodomestico electrodomestico : electrodomesticos){
            if(electrodomestico instanceof Lavadora lavadora){
                ls.mostarDatosDeElectrodomesticos(lavadora);
            }else if (electrodomestico instanceof Televisor televisor){
                ts.mostarDatosDeElectrodomesticos(televisor);
            }
        }

        System.out.println("Precio total: " + ls.sumaPrecios(electrodomesticos));

    }
}
