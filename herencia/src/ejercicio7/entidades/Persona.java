package ejercicio7.entidades;

import ejercicio7.enums.ESTADO_CIVIL;

import java.util.Scanner;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int numId;
    protected ESTADO_CIVIL estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int numId, ESTADO_CIVIL estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numId = numId;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public ESTADO_CIVIL getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(ESTADO_CIVIL estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
