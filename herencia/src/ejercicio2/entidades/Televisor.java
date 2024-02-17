package ejercicio2.entidades;

import ejercicio2.enums.COLOR_ELECTRODOMESTICO;
import ejercicio2.enums.CONSUMO_ENERGETICO;

/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
 */
public class Televisor extends Electrodomestico{
    private int pulgadas;
    private boolean sintonizadorTDTdispo;

    public Televisor() {

    }
    public Televisor(double precio, COLOR_ELECTRODOMESTICO color, CONSUMO_ENERGETICO consumoEnergetico, double peso, int pulgadas, boolean sintonizadorTDTdispo) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDTdispo = sintonizadorTDTdispo;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizadorTDTdispo() {
        return sintonizadorTDTdispo;
    }

    public void setSintonizadorTDTdispo(boolean sintonizadorTDTdispo) {
        this.sintonizadorTDTdispo = sintonizadorTDTdispo;
    }

}
