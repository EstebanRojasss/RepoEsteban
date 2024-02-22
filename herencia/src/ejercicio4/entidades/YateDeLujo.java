package ejercicio4.entidades;

import java.time.LocalDate;

public class YateDeLujo extends Barco{
    private int potenciaCV;
    private int numeroCamarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(int potenciaCV, int numeroCamarotes) {
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public YateDeLujo(int matricula, int eslora, LocalDate fechaFabricacion, int potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, fechaFabricacion);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }

    public void setNumeroCamarotes(int numeroCamarotes) {
        this.numeroCamarotes = numeroCamarotes;
    }

}
