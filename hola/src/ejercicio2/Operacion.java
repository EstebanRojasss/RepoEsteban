package ejercicio2;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero: ");
        setNumero1(sc.nextInt());
        System.out.println("Ingrese un numero: ");
        setNumero2(sc.nextInt());
    }

    public void sumar() {
        System.out.println("Suma: " + (getNumero1() + getNumero2()));
    }
    public void restar(){
        System.out.println("Resta: " + (getNumero1() - getNumero2()));
    }
    public void multiplicar(){
        if(getNumero1() == 0 && getNumero2() == 0){
            System.out.println("El resultado es: " + 0);
        }else{
            System.out.println("Multiplicacion: " + (getNumero1() * getNumero2()));
        }
    }
    public void dividir(){
        if(getNumero1() == 0 && getNumero2() == 0){
            System.out.println("El resultado es: " + 0);
        }else{
            System.out.println("Division: " + (getNumero1() / getNumero2()));
        }
    }

}
