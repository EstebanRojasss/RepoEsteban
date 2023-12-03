package ejercicio1;

import java.util.Scanner;

public class Circunferencia {
    private int radio;


    public Circunferencia() {

    }

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "ejercicio1.Circunferencia{" +
                "radio=" + radio +
                '}';
    }


    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el radio de la circunferencia: ");
        setRadio(sc.nextInt());
    }
    public void area(Circunferencia circunferencia){
        System.out.println("Area: " + Math.PI * Math.pow(circunferencia.getRadio(), 2));
    }
    public void perimetro(Circunferencia circunferencia){
        System.out.println("Perimetro: " + 2 * Math.PI * circunferencia.getRadio());
    }
}
