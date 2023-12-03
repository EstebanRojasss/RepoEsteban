package ejercicio1;

import java.util.Scanner;

public class Prueba1 {
    /*
    Declarar una clase llamada ejercicio1.Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase ejercicio1.Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Circunferencia circunferencia = new Circunferencia();
        circunferencia.crearCircunferencia();
        int menu;
        do {
            System.out.println("MENU");
            System.out.println("1. Area de la circunferencia");
            System.out.println("2. Perimetro de la circunferencia");
            System.out.println("3. Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1:circunferencia.area(circunferencia);
                    break;
                case 2:circunferencia.perimetro(circunferencia);
                    break;
                case 3:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("Ingrese las opciones disponibles");
            }
        } while (menu != 3);
    }
}
