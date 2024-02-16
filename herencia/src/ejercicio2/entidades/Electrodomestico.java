package ejercicio2.entidades;

import ejercicio2.enums.COLOR_ELECTRODOMESTICO;
import ejercicio2.enums.CONSUMO_ENERGETICO;

import java.util.Scanner;

public class Electrodomestico {
    protected double precio;
    protected COLOR_ELECTRODOMESTICO color;
    protected CONSUMO_ENERGETICO consumoEnergetico;
    protected double peso;

    public Electrodomestico() {

    }

    public Electrodomestico(double precio, COLOR_ELECTRODOMESTICO color, CONSUMO_ENERGETICO consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public COLOR_ELECTRODOMESTICO getColor() {
        return color;
    }

    public void setColor(COLOR_ELECTRODOMESTICO color) {
        this.color = color;
    }

    public CONSUMO_ENERGETICO getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(CONSUMO_ENERGETICO consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico: " +
                "  Precio: " + precio +
                "  Color: " + color +
                "  Consumo energetico: " + consumoEnergetico +
                "  Peso: " + peso;
    }
}
