package ejercicio4.servicios;

import ejercicio4.entidades.AlquilerAmarre;

public class AlquilerServicio {

    public AlquilerAmarre alquilarAmarre(){
        System.out.println("=========INGRESAR DATOS DE ALQUILER=========");
        System.out.println("Ingrese el nombre: ");
        System.out.println("Ingrese el documento de identidad: ");
        System.out.println("Ingrese la fecha de alquiler: ");
        System.out.println("Ingrese la fecha de devolución: ");
        System.out.println("Ingrese la posicion del amarre ");
        System.out.println("Ingrese el barco a amarrar: ");
        return new AlquilerAmarre();
    }
}
