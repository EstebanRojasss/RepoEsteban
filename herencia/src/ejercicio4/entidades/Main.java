package ejercicio4.entidades;

import ejercicio4.servicios.*;


import java.util.ArrayList;
import java.util.Scanner;

/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler
se guarda: el nombre, documento del cliente, la fecha de alquiler, fecha de
devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de
fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado
con la fecha de alquiler y devolución), por un valor módulo de cada barco
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el
modulo normal y sumándole el atributo particular de cada barco. En los veleros
se suma el número de mástiles, en los barcos a motor se le suma la potencia en
CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las
clases y los métodos necesarios que permitan al usuario elegir el barco que
quiera alquilar y mostrarle el precio final de su alquiler
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        AlquilerServicio servicioAlquiler = new AlquilerServicio();
        BarcoAMotorServicio barcoAMotorService = new BarcoAMotorServicio();
        VeleroServicio veleroServicio = new VeleroServicio();
        YateServicio yateServicio = new YateServicio();
        AlquilerAmarre nuevoAlquiler;
        int menu;
        do {
            System.out.println("MENU DE BARCOS");
            System.out.println("1. Barco a motor");
            System.out.println("2. Velero");
            System.out.println("3. Yate de Lujo");
            menu = sc.nextInt();
            switch(menu){
                case 1:
                    Barco barcoAMotor = barcoAMotorService.crearBarcoAMotor();
                    nuevoAlquiler = servicioAlquiler.alquilarAmarre(barcoAMotor);
                    System.out.println("El precio del alquiler es: " + servicioAlquiler.calcularAlquiler(nuevoAlquiler, barcoAMotor));
                    servicioAlquiler.mostrarDatos(barcoAMotor,nuevoAlquiler);
                    break;
                case 2:
                    Barco velero = veleroServicio.crearVelero();
                    nuevoAlquiler = servicioAlquiler.alquilarAmarre(velero);
                    servicioAlquiler.calcularAlquiler(nuevoAlquiler, velero);
                    System.out.println("El precio del alquiler es: " + servicioAlquiler.calcularAlquiler(nuevoAlquiler, velero));
                    servicioAlquiler.mostrarDatos(velero, nuevoAlquiler);
                    break;
                case 3:
                    Barco yate = yateServicio.crearYate();
                    nuevoAlquiler = servicioAlquiler.alquilarAmarre(yate);
                    servicioAlquiler.calcularAlquiler(nuevoAlquiler, yate);
                    System.out.println("El precio del alquiler es: " + servicioAlquiler.calcularAlquiler(nuevoAlquiler, yate));
                    servicioAlquiler.mostrarDatos(yate, nuevoAlquiler);
                    break;
                default:
                    System.out.println("==============================================");
                    System.out.println("Debe ingresar una de las opciones disponibles");
                    System.out.println("==============================================");
            }
        } while (menu != 1 && menu != 2 && menu != 3);
    }
}
