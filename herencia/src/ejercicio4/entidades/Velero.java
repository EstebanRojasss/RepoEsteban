package ejercicio4.entidades;

import java.time.LocalDate;

public class Velero extends Barco{
    private int numeroDeMastiles;

    public Velero() {
    }

    public Velero(int matricula, int eslora, LocalDate fechaFabricacion, int numeroDeMastiles) {
        super(matricula, eslora, fechaFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }

    public int getNumeroDeMastiles() {
        return numeroDeMastiles;
    }

    public void setNumeroDeMastiles(int numeroDeMastiles) {
        this.numeroDeMastiles = numeroDeMastiles;
    }
}
