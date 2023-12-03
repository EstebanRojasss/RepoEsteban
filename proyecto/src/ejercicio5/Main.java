package ejercicio5;

import java.util.Scanner;

/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicio serviceCafe = new CafeteraServicio();
        Cafetera cafetera = serviceCafe.llenarCafetera();
        int menu;
        do{
            System.out.println("MENU");
            System.out.println("1. Servir taza");
            System.out.println("2. Agregar cafe");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Salir");
            menu = sc.nextInt();
            switch (menu){
                case 1:serviceCafe.servirTaza(cafetera);
                    break;
                case 2:serviceCafe.agregarCafe(cafetera);
                    break;
                case 3:serviceCafe.vaciarCafetera(cafetera);
                    break;
                case 4:
                    System.out.println("Chau");
                    break;
                default:
                    System.out.println("Ha ocurrido un error");
            }
        }while(menu != 4);

    }
}
