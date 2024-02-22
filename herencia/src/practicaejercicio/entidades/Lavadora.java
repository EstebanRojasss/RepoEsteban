package practicaejercicio.entidades;

import practicaejercicio.enums.COLORES____;
import practicaejercicio.enums.TIPO_CONSUMO;

/*
A continuación se debe crear una subclase llamada Lavadora, con el atributo
carga, además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de atributos heredados. Recuerda que
debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(double precio, COLORES____ color, TIPO_CONSUMO consumoEnergetico, int peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora: " +
                "\nPrecio: " + precio +
                "\nColor: " + color +
                "\nConsumoEnergetico: " + consumoEnergetico +
                "\nPeso: " + peso +
                "\nCarga: " + carga ;
    }
}
