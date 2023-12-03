package ejercicio3;

import java.util.Scanner;

public class RectanguloServicio {

    public Rectangulo crearRectangulo(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.println("Ingrese la altura del recangulo: ");
        double altura = sc.nextDouble();
        return new Rectangulo(base, altura);
    }

    public void superficie(Rectangulo rectangulo){
        System.out.println("Superficie: " +( rectangulo.getBase() * rectangulo.getAltura()));
    }

    public void perimetro(Rectangulo rectangulo){
        System.out.println("Perimetro: " + (rectangulo.getBase() + rectangulo.getAltura()) * 2);
    }

    public void dibujarRectangulo(Rectangulo rectangulo){
        for(int i = 0; i < rectangulo.getAltura(); i++){
            for(int j = 0 ; j < rectangulo.getBase(); j++){
                if(i == 0 || i == rectangulo.getAltura() - 1){
                    System.out.print("*" + " ");
                }else if(j == 0 || j == rectangulo.getBase() - 1){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("-" + " ");
                }
            }
            System.out.print("\n");
        }
    }

}
