package ejercicio4.entidades;

import java.time.LocalDate;

public class BarcoAMotor extends Barco{
    private int potenciaCV;

    public BarcoAMotor() {
    }

    public BarcoAMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoAMotor(int matricula, int eslora, LocalDate fechaFabricacion, int potenciaCV) {
        super(matricula, eslora, fechaFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoAMotor: " +
                "\nPotencia CV: " + potenciaCV +
                "\nMatricula: " + matricula +
                "\nEslora: " + eslora +
                "\nFecha Fabricacion: " + fechaFabricacion;
    }
}
