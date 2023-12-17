package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroServicio {

    protected ArrayList<Perro> crearPerro(){
        Scanner sc = new Scanner(System.in);
        ArrayList<Perro>perros = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            Perro perro = new Perro();
            System.out.println("Ingrese el nombre del perro: ");
            perro.setNombre(sc.next());
            System.out.println("Ingrese la edad del perro: ");
            perro.setEdad(sc.nextInt());
            perro.setRaza(Raza.valueOf(sc.next()));
            System.out.println("Ingrese el tamanho del perro: ");
            perro.setTamanho(sc.next());
            perros.add(perro);
        }

        return perros;
    }
}
