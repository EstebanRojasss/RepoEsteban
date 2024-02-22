package ejercicio3.entidades;

import ejercicio3.interfaces.CalculosFormas;

public class Circulo implements CalculosFormas {
    private double radio ;
    private double diamtetro;

    public Circulo() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiamtetro() {
        return diamtetro;
    }

    public void setDiamtetro(double diamtetro) {
        this.diamtetro = diamtetro;
    }

    public Circulo(double radio, double diamtetro) {
        this.radio = radio;
        this.diamtetro = diamtetro;
    }

    @Override
    public void calcularArea() {
        double area = pi * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = pi * diamtetro;
        System.out.println("El perimetro del area es: " + perimetro);
    }
}
