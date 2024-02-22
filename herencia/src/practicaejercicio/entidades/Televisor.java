package practicaejercicio.entidades;

import practicaejercicio.enums.COLORES____;
import practicaejercicio.enums.TIPO_CONSUMO;

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
public class Televisor extends  Electrodomestico{
    private int pulgadas;
    private boolean tieneSintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double precio, COLORES____ color, TIPO_CONSUMO consumoEnergetico, int peso, int pulgadas, boolean tieneSintonizadorTDT) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tieneSintonizadorTDT = tieneSintonizadorTDT;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTieneSintonizadorTDT() {
        return tieneSintonizadorTDT;
    }

    public void setTieneSintonizadorTDT(boolean tieneSintonizadorTDT) {
        this.tieneSintonizadorTDT = tieneSintonizadorTDT;
    }

    public String sintetizador(){
        if(tieneSintonizadorTDT){
            return "Si";
        }return "No";
    }

    @Override
    public String toString() {
        return "Televisor: " +
                "\nPulgadas: " + pulgadas +
                "\nTieneSintonizadorTDT: " + sintetizador() +
                "\nPrecio: " + precio +
                "\nColor: " + color +
                "\nConsumoEnergetico: " + consumoEnergetico +
                "\nPeso: " + peso ;
    }
}
