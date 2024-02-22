package apracticaejercici0.entidades;

import apracticaejercici0.enums.COLORES____;
import apracticaejercici0.enums.TIPO_CONSUMO;

public class Electrodomestico {
   protected double precio;
   protected COLORES____ color;
   protected TIPO_CONSUMO consumoEnergetico;
   protected int peso;

   public Electrodomestico() {

   }

   public Electrodomestico(double precio, COLORES____ color, TIPO_CONSUMO consumoEnergetico, int peso) {
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

   public COLORES____ getColor() {
      return color;
   }

   public void setColor(COLORES____ color) {
      this.color = color;
   }

   public TIPO_CONSUMO getConsumoEnergetico() {
      return consumoEnergetico;
   }

   public void setConsumoEnergetico(TIPO_CONSUMO consumoEnergetico) {
      this.consumoEnergetico = consumoEnergetico;
   }

   public int getPeso() {
      return peso;
   }

   public void setPeso(int peso) {
      this.peso = peso;
   }

   @Override
   public String toString() {
      return
              " Precio: " + precio +
              " Color: " + color +
              " ConsumoEnergetico: " + consumoEnergetico +
              " Peso: " + peso;
   }
}
