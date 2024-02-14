package ejercicio1;

public class Caballo extends Animal {
    public Caballo() {
    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimento() {
        System.out.println("Me alimento de: " + alimento);

    }
}
