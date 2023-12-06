package ejercicio8;

import java.util.Scanner;

/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Matematica matematica = new Matematica();

        System.out.println("Ingrese dos numeros");
        System.out.println("Ingrese el primer numero:");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = sc.nextInt();

        matematica.devolverMayor(numero1, numero2);
        matematica.calcularPotencia(numero1, numero2);
        matematica.calcularRaiz(numero1, numero2);
    }
}
