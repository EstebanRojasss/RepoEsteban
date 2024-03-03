package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner
para leer dos números en forma de cadena. A continuación, utilice el método
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en
dos variables de tipo int. Por ultimo realizar una división con los dos numeros y
mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por
teclado puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
public class DivisionNumero {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        try{
            String n1 = sc.next();
            String n2 = sc.next();
            int numero1 = Integer.parseInt(n1);
            int numero2 = Integer.parseInt(n2);
            System.out.println(numero1 / numero2);
        }catch(InputMismatchException mismatchException){
            System.out.println("Error al ingresar por teclado.");
        }catch(NumberFormatException numberFormatException){
            System.out.println("Error al convertir");
        }catch(ArithmeticException arithmeticException){
            System.out.println("No se puede dividir por cero.");
        }

    }
}
