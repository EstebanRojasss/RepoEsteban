package ejercicio2;

import java.util.Scanner;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los
guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
error. Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a
pasar una división por cero, el método devuelve 0 y se le informa al usuario el
error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
al main
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        int menu;
        do {
            System.out.println("MENU");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Otra operacion ");
            System.out.println("6. Sailr");

            menu = sc.nextInt();
            switch (menu) {
                case 1:operacion.sumar();
                    break;
                case 2:operacion.restar();
                    break;
                case 3:operacion.multiplicar();
                    break;
                case 4:operacion.dividir();
                    break;
                case 5:
                    System.out.println("Ingrese un numero: ");
                    operacion.setNumero1(sc.nextInt());
                    System.out.println("Ingrese un numero: ");
                    operacion.setNumero2(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("Debe ingresar una de las opciones");
            }
        } while (menu != 6);

    }


}
