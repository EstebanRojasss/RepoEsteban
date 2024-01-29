package ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList<Animal> animales = new ArrayList<>();
        Gato gato = new Gato();
        Perro perro = new Perro();
        animales.add(gato);
        animales.add(perro);
        for(Animal animal: animales){
            animal.hacerRuido();
        }
    }
}
