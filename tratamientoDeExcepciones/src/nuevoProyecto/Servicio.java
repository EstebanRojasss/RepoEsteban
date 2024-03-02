package nuevoProyecto;

import java.util.Scanner;

public class Servicio {

    public Persona crearPersona() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre");
        persona.setNombre(sc.next());
        System.out.println("Ingrese la edad;");
        persona.setEdad(sc.nextInt());
        char resp;
        do {
            System.out.println("Ingrese el sexo: ");
            resp = sc.next().charAt(0);
        } while (resp != 'H' && resp != 'M' && resp != 'O');
        persona.setSexo(Character.toUpperCase(resp));
        System.out.println("Ingrese el peso: ");
        persona.setPeso(sc.nextInt());
        System.out.println("Ingrese la altura: ");
        persona.setAltura(sc.nextInt());
        return persona;
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
     */
    public int calcularIMC(Persona persona) {
        int calculo = (int) (persona.getPeso() / Math.pow(persona.getAltura(), 2));
        if (calculo < 20) {
            return -1;
        } else if (calculo > 20 && calculo <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
    /*  • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
      devuelve un booleano */
    public boolean esMayorEdad(Persona persona)throws NullPointerException{
        if(persona == null){
            throw new NullPointerException("Error.");
        }
        return persona.getEdad() >= 18;
    }

}
