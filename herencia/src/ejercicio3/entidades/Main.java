package ejercicio3.entidades;

import java.util.Scanner;

/*
 Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
13
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int menu ;
        do{
            System.out.println("1. Calcular datos de circulo");
            System.out.println("2. Calcular datos de rectangulo");
            System.out.println("3. Salir.");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    Circulo circulo = new Circulo();
                    System.out.println("========================================");
                    System.out.println("Ingrese el radio del circulo: ");
                    double radio = sc.nextDouble();
                    circulo.setRadio(radio);
                    System.out.println("========================================");
                    System.out.println("Ingrese el diametro del circulo: ");
                    double diametro = sc.nextDouble();
                    circulo.setDiamtetro(diametro);
                    circulo.calcularArea();
                    System.out.println("========================================");
                    circulo.calcularPerimetro();
                    System.out.println("========================================");
                    break;
                case 2:
                    Rectangulo rectangulo = new Rectangulo();
                    System.out.println("========================================");
                    System.out.println("Ingrese la base del rectangulo: ");
                    double base = sc.nextDouble();
                    System.out.println("========================================");
                    System.out.println("Ingrese la altura del rectangulo: ");
                    double altura = sc.nextDouble();
                    rectangulo.setBase(base);
                    rectangulo.setAltura(altura);
                    rectangulo.calcularArea();
                    System.out.println("========================================");
                    rectangulo.calcularPerimetro();
                    System.out.println("========================================");
                    break;
                case 3:
                    System.out.println("Que tenga un buen dia");
                    break;
            }
        }while(menu != 3);


    }
}

