package ejercicio6;

import java.util.Scanner;

/*

• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores
 */
public class PersonaServicio {
    public Persona crearPersona() {
        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre: ");
        persona.setNombre(sc.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(sc.nextInt());
        char opcionDeSexo;
        do{
            System.out.println("Seleccione su sexo: ");
            System.out.println("H. Hombre ");
            System.out.println("M. Mujer");
            System.out.println("O. Otro");
            opcionDeSexo = sc.next().charAt(0);
            switch (opcionDeSexo) {
                case 'H', 'h':
                    persona.setSexo(Sexo.Hombre);
                    break;
                case 'M', 'm':
                    persona.setSexo(Sexo.Mujer);
                    break;
                case 'O', 'o':
                    persona.setSexo(Sexo.Otro);
                    break;
                default:
                    System.out.println("Debe escoger una de las opciones. H || M || O");
            }
        }while(opcionDeSexo == 'H' || opcionDeSexo == 'M' || opcionDeSexo == 'O');
        System.out.println("Ingrese su peso: ");
        persona.setPeso(sc.nextDouble());
        System.out.println("Ingrese su estatura: ");
        persona.setAltura(sc.nextDouble());
        return persona;
    }
    public int calcularIMC(Persona persona){
        double pesoIdeal = persona.getPeso() / Math.pow(persona.getAltura(), 2);
        if(pesoIdeal < 20){
            return -1;
        }else if(pesoIdeal >= 20 && pesoIdeal <= 25){
            return 0;
        }
        return 1;
    }

    public boolean esMayor(Persona persona){
        return persona.getEdad() >= 18;
    }



}