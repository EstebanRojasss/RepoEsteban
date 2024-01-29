package practica.entidades;

import java.util.Arrays;

public class Cine {
   private Sala [] salas;

   public Cine() {
   }

   public Cine(Sala[] salas) {
      this.salas = salas;
   }

   public Sala[] getSalas() {
      return salas;
   }

   public void setSalas(Sala[] salas) {
      this.salas = salas;
   }

   @Override
   public String toString() {
      return "Cine{" +
              "salas=" + Arrays.toString(salas) +
              '}';
   }
}
