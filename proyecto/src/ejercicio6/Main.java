package ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio personaService = new PersonaServicio();

        ArrayList<Persona> personas = new ArrayList<>();
        int contadorPesoIDeal = 0, contadorSobrePeso = 0, contadorInfraPeso = 0;
        int contadorMayorDeEdad = 0, contadorMenorDeEdad = 0;
        for (int i = 0; i < 4; i++) {
            Persona persona = personaService.crearPersona();
            personas.add(i, persona);
        }

        for (int i = 0; i < personas.size(); i++) {
            if (personaService.calcularIMC(personas.get(i)) == -1) {
                System.out.println("La persona " + i + ", de nombre " + personas.get(i).getNombre() + ", está en su peso ideal");
                contadorPesoIDeal++;
            } else if (personaService.calcularIMC(personas.get(i)) == 0) {
                System.out.println("La persona " + i + ", de nombre " + personas.get(i).getNombre() + ", está por debajo de su peso ideal");
                contadorInfraPeso++;
            } else {
                System.out.println("La persona " + i + ", de nombre " + personas.get(i).getNombre() + ", está con sobrepeso");
                contadorSobrePeso++;
            }
        }

        for (int i = 0; i < personas.size(); i++) {
            if (personaService.esMayor(personas.get(i))) {
                System.out.println("La persona " + i + ", de nombre " + personas.get(i).getNombre() + ", es mayor");
                contadorMayorDeEdad++;
            } else {
                contadorMenorDeEdad++;
            }
        }
        if (contadorPesoIDeal > 0) {
            double porcentajePesoIdeal = (double) (contadorPesoIDeal)/ 4;
            System.out.println("El porcentaje de peso ideal es: " + porcentajePesoIdeal);
        }
        if (contadorSobrePeso > 0) {
            double porcentajeSobrePeso = (double)  (contadorSobrePeso)/ 4 ;
            System.out.println("El porcebtaje de sobrepeso es: " + porcentajeSobrePeso);
        }
        if(contadorInfraPeso > 0) {
            double porcentajeInfraPeso = (double) (contadorInfraPeso) / 4;
            System.out.println("El porcentaje de infrapeso es: " + porcentajeInfraPeso);
        }

        if(contadorMayorDeEdad > 0){
            double porcentajeMayorDeEdad = (double)(contadorMayorDeEdad) / 4;
            System.out.println("El porcentaje de mayores de edad son: " + porcentajeMayorDeEdad);
        }
        if(contadorMenorDeEdad > 0){
            double porcentajeMenorDeEdad = (double) (contadorMenorDeEdad) / 4;
            System.out.println("El porcentaje de menores de edad son: " + porcentajeMenorDeEdad);
        }
    }
}

