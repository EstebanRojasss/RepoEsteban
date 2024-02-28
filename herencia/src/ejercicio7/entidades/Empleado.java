package ejercicio7.entidades;

import ejercicio7.enums.ESTADO_CIVIL;

import java.time.LocalDate;

public class Empleado extends Persona{
    protected LocalDate anioIncorporacion;
    protected int numeroDespacho;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int numId, ESTADO_CIVIL estadoCivil, LocalDate anioIncorporacion, int numeroDespacho) {
        super(nombre, apellido, numId, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public LocalDate getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(LocalDate anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
}
