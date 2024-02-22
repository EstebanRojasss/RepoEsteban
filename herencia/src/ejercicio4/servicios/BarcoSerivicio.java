package ejercicio4.servicios;

import ejercicio4.entidades.Barco;

import java.time.LocalDate;
import java.util.Scanner;

public class BarcoSerivicio {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Barco crearBarco(){
        Barco barco = new Barco();
        System.out.println("=========INGRESAR DATOS DEL BARCO=========");
        System.out.println("Ingrese la matricula: ");
        barco.setMatricula(sc.nextInt());
        System.out.println("Ingrese la eslora en cm: ");
        barco.setEslora(sc.nextInt());
        System.out.println("Ingrese la fecha de fabricacion: DD/MM/AA");
        int dia= sc.nextInt();
        int mes= sc.nextInt();
        int anho = sc.nextInt();
        barco.setFechaFabricacion(LocalDate.of(dia, mes, anho));
        return barco;
    }
}
