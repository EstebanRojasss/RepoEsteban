package ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ArrayList<Animal> animales = new ArrayList<>();
        Animal gato = new Gato("William", "Leche", 12, "naranja");
        Animal perro = new Perro("Puppy", "Carne", 9, "Caniche");
        Animal caballo = new Caballo("Spirit", "Pasto", 5, "Delmer");
        animales.add(gato);
        animales.add(perro);
        animales.add(caballo);
        for(Animal animal: animales){
            animal.alimento();
        }
    }
}
