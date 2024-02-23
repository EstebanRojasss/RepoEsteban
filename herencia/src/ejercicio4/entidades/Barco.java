package ejercicio4.entidades;

import java.time.LocalDate;

public class Barco {

    protected int matricula;
    protected int eslora;
    protected LocalDate fechaFabricacion;

    public Barco() {

    }

    public Barco(int matricula, int eslora, LocalDate fechaFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    @Override
    public String toString() {
        return
                "\nMatricula: " + matricula +
                "\nEslora: " + eslora +
                "\nFechaFabricacion: " + fechaFabricacion ;
    }
}
