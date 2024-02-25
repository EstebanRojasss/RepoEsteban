package ejercicio5.entidades;

import java.util.Scanner;

public abstract class Edificio {
    protected int ancho;
    protected int alto;
    protected int largo;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public abstract int calcularSuperficie();

    public abstract int calcularVolumen();

    public void ingresarMedidas() {
        System.out.println("====================================");
        System.out.println("Ingrese el largo del edificio: ");
        largo = sc.nextInt();
        System.out.println("Ingrese el ancho del edificio: ");
        ancho = sc.nextInt();
        System.out.println("Ingrese el alto del edificio");
        alto = sc.nextInt();
    }
}
