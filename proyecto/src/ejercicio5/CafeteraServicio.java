package ejercicio5;

import java.util.Random;
import java.util.Scanner;

public class CafeteraServicio {

    public Cafetera llenarCafetera(){
        Cafetera cafetera = new Cafetera();
        Random random = new Random();
        int capacidadMaxima = random.nextInt(100);
        cafetera.setCapacidadMaxima(capacidadMaxima);
        cafetera.setCantidadActual(capacidadMaxima);
        return cafetera;
    }

    public void servirTaza(Cafetera cafetera){
        Random random = new Random();
        int taza = random.nextInt(15);
        if(cafetera.getCantidadActual() < taza){
            System.out.println("La cantidad de cafe no alcanza para llenar la taza, se cargo con lo restante.");
            cafetera.setCantidadActual(taza - cafetera.getCantidadActual());
            System.out.println("La cantidad restante en la cafetera es: " + cafetera.getCantidadActual());
        }else if(cafetera.getCantidadActual() >= taza){
            cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
            System.out.println("Se llenó la taza");
            System.out.println("La cantidad restante en la cafetera es: " + cafetera.getCantidadActual());
        }
    }

    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(0);
        System.out.println("La cantidad actual es: " + cafetera.getCantidadActual());
    }
    public void agregarCafe(Cafetera cafetera){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de cafe a agregar a la cafera");
        int agregarCafe = sc.nextInt();
        if(agregarCafe <= cafetera.getCapacidadMaxima()){
            cafetera.setCantidadActual(agregarCafe);
            System.out.println("La cantidad actual de cafe es: " + cafetera.getCantidadActual());
        }else{
            System.out.println("La cantidad que desea agregar supera la capacidad de la cafetera. Se agrego solo lo necesario.");
            cafetera.setCantidadActual(agregarCafe - cafetera.getCapacidadMaxima());
        }

    }



}
