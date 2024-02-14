package ejercicio1;

public class Gato extends Animal{
    public Gato() {
    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

   @Override
    public void alimento(){
       System.out.println("Me alimento de: "+ alimento);
   }
}
