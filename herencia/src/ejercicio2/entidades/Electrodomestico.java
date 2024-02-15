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


    private void comprobarConsumoEnergetico(char letra) {
        if (!String.valueOf(letra).equalsIgnoreCase(CONSUMO_ENERGETICO.A.toString())
                || !String.valueOf(letra).equalsIgnoreCase(CONSUMO_ENERGETICO.B.toString())
                || !String.valueOf(letra).equalsIgnoreCase(CONSUMO_ENERGETICO.C.toString())
                || !String.valueOf(letra).equalsIgnoreCase(CONSUMO_ENERGETICO.D.toString())
                || !String.valueOf(letra).equalsIgnoreCase(CONSUMO_ENERGETICO.E.toString())
                || !String.valueOf(letra).equalsIgnoreCase(CONSUMO_ENERGETICO.F.toString())) {
            setConsumoEnergetico(CONSUMO_ENERGETICO.F);
        }
    }

    private void comprobarColor(String color) {
        if (!color.equalsIgnoreCase(COLOR_ELECTRODOMESTICO.ROJO.toString())
                || !color.equalsIgnoreCase(COLOR_ELECTRODOMESTICO.BLANCO.toString())
                || !color.equalsIgnoreCase(COLOR_ELECTRODOMESTICO.GRIS.toString())
                || !color.equalsIgnoreCase(COLOR_ELECTRODOMESTICO.NEGRO.toString())
                || !color.equalsIgnoreCase(COLOR_ELECTRODOMESTICO.AZUL.toString())) {
            setColor(COLOR_ELECTRODOMESTICO.BLANCO);
        }
    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el precio del electrodomestico: ");
        setPrecio(sc.nextDouble());
        int opcion;
        do {
            System.out.println("Seleccione el color del electrodomestico: ");
            System.out.println("1. BLANCO 2. NEGRO 3. ROJO 4. AZUL 5. GRIS");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    setColor(COLOR_ELECTRODOMESTICO.BLANCO);
                    break;
                case 2:
                    setColor(COLOR_ELECTRODOMESTICO.NEGRO);
                    break;
                case 3:
                    setColor(COLOR_ELECTRODOMESTICO.ROJO);
                    break;
                case 4:
                    setColor(COLOR_ELECTRODOMESTICO.AZUL);
                    break;
                case 5:
                    setColor(COLOR_ELECTRODOMESTICO.GRIS);
                    break;
                default:
            }
            System.out.println("Ingrese el consumo del electrodomestico: ");
            System.out.println("A. B. C. D. E. F.");
        } while (opcion != );
    }

}
