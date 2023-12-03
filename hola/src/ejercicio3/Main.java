package ejercicio3;

import java.util.Scanner;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo rectangulo = rs.crearRectangulo();

        int menu;
        do{

            System.out.println("MENU");
            System.out.println("1. Superficie del rectangulo ");
            System.out.println("2. Perimetro del rectangulo ");
            System.out.println("3. Dibujar un rectangulo con los datos introducidos");
            System.out.println("4. Salir");
            menu = sc.nextInt();
            switch (menu){
                case 1:
                    rs.superficie(rectangulo);
                    break;
                case 2:rs.perimetro(rectangulo);
                    break;
                case 3:rs.dibujarRectangulo(rectangulo);
                    break;
                case 4:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("No es una de las opciones");
            }
        }while(menu != 4);
    }
}
